# **Lab Report 2 - Servers and SSH Keys** <br/>
**Part 1:**<br/>
Here is my code: (created a seperate file called chatServer.java based on the code provided by previous lab)

```
import java.io.IOException;
import java.net.URI;

class Handler implements URLHandler {
    String s = "";

    public String handleRequest(URI url) {
        if (url.getPath().equals("/")) {
            return "/add-message?s=<string>&user=<string>";
        } else if (url.getPath().contains("/add-message")) {
            String[] parameters = url.getQuery().split("&");
            String user = null;
            String message = null;
            for (String param : parameters) {
                String[] keyword = param.split("=");
                if (keyword[0].equals("user")) {
                    user = keyword[1];
                } else if (keyword[0].equals("s")) {
                    message = keyword[1];
                }
            }
            // Check if user and message are not null and append to the string
            if (user != null && message != null) {
                s += user + ": " + message + "\n";
                return s; // Return the message history
            } else {
                return "Message not clear";
            }
        } else {
            return "404 Not Found! Or your message has issue";
        }
    }
}

class chatServer {
    public static void main(String[] args) throws IOException {
        if (args.length == 0) {
            System.out.println("Missing port number! Try any number between 1024 to 49151");
            return;
        }

        int port = Integer.parseInt(args[0]);

        Server.start(port, new Handler());
    }
}
```

and my terminal commond: <br/>
```
[yul269@ieng6-202]:wavelet-1:33$ javac Server.java chatServer.java
[yul269@ieng6-202]:wavelet-1:34$ java chatServer 4006
```

On the website I entered: <br/>
```
http://localhost:4005/add-message?s=Hello&user=jpolitz
```

The second commond I entered: <br/>
```
http://localhost:4006/add-message?s=How%20are%20you&user=yash
```

**Part 2:**<br/>

The absolute path: <br/>

1. I first check the existing SSh Keys using
```
ls -al ~/.ssh
```
and it gives out this result. 
```
[yul269@ieng6-202]:~:58$ ls -al ~/.ssh
total 12
drwx--S---  2 yul269 ieng6_staff 4096 Apr 16 09:27 .
drwxr-s--- 24 yul269 ieng6_staff 4096 Apr 24 20:48 ..
-rw-------  1 yul269 ieng6_staff 1170 Apr 16 09:31 authorized_keys
```
2.I then print out the absolute value for the private key

```
[yul269@ieng6-202]:~:58$ cd ~/.ssh
[yul269@ieng6-202]:.ssh:59$ ls
authorized_keys
[yul269@ieng6-202]:.ssh:60$ echo $(pwd)/id_rsa
/home/linux/ieng6/oce/26/yul269/.ssh/id_rsa
```

This is the content of my bashrc which is used by Bash, the default shellto execute commands every time a new terminal session starts for non-login shells. 


```
[yul269@ieng6-202]:.ssh:62$ cat ~/.bashrc
# /public/bashrc -- prototype for ${HOME}/.bashrc
# $Id: bashrc,v 1.2 2010/07/18 21:57:59 rml Exp $
[ -r .acms.debug ] && echo ENTERED .bashrc >&2
public=${public:-/public}

# Your .bashrc file is processed each time a new, non-login 
# Bourne-Again SHell (bash) is initialized.
# Changes made here will have no effect on the login bash shell;
# such changes should be made in .bash_profile. 
# 
# All the usual setup is done by the following line.  Any additions 
# you make should come after it. 
#
# You may add commands to the end of this file as needed. 
# 

# echo processing bash specific shell initialization
[ -r $public/bashrc.adjunct ] && . $public/bashrc.adjunct

# When this file was first placed in your home directory, a
# pre-existing bashrc file may have been moved to a file named 
# "${HOME}/.bashrc.old". Check the commands in that file be 
# sure they are still needed.

if [ -r ${HOME}/.bashrc.old ]
then
        echo "----------------------------------------------"
        echo "About to run commands in your old bashrc file."
        echo "Delete the file .bashrc.old, or edit .bashrc if these commands"
        echo "should not be run anymore."
        echo "----------------------------------------------"
        source ${HOME}/.bashrc.old
        echo "----------------------------------------------"
        echo "Done running commands in your old bashrc file."
        echo "----------------------------------------------"
fi

# CAUTION: if you choose to make adjustments to PATH,
# it is usually advisable to *add* to the existing PATH
# rather than resetting PATH completely.  By adding, there
# is less chance of inadvertently losing important elements.
# For example:  set path = ( $path ${HOME}/bin )
[ -r .acms.debug ] && echo EXITING .bashrc >&2

```
Because it remember the password, so a terminal would display following info when I log into my ieng6 account without being asked for a password:
```
[yul269@ieng6-202]:.ssh:64$ ssh yul269@ieng6-202
Last login: Tue Apr 16 09:31:21 2024 from 100.81.34.192
Hello yul269, you are currently logged into ieng6-202.ucsd.edu

You are using 0% CPU on this system

Cluster Status 
Hostname     Time    #Users  Load  Averages  
ieng6-201   14:25:01   6   0.37,  0.76,  0.74
ieng6-202   14:25:01   10  1.08,  0.93,  0.63
ieng6-203   14:25:01   5   0.00,  0.10,  0.22

You are currently over quota!
Disk quotas for user yul269 (uid 135768): 
     Filesystem  blocks   quota   limit   grace   files   quota   limit   grace
172.17.65.195:/vol/home/linux/ieng6
                1444800* 1444800 1444800            9515   31000   31000        
  Please clean up any unnecessary files or contact the servidesk
  for help.
 

To begin work for one of your courses [ cs15lsp24 cs12sp24b ], type its name 
at the command prompt.  (For example, "cs15lsp24", without the quotes).

To see all available software packages, type "prep -l" at the command prompt,
or "prep -h" for more options.

```
**Part 3:**
In week 3 I learned how to access remote server and how to store my key so I don't need to enter the password for it to log in anymore. The lab of seeing people access the same remote server and adding staff on my server is fun. 
