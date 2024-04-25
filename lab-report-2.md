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
```
[yul269@ieng6-202]:~:34$ pwd
/home/linux/ieng6/oce/26/yul269
[yul269@ieng6-202]:~:35$ ls ~/.ssh/authorized_keys
/home/linux/ieng6/oce/26/yul269/.ssh/authorized_keys
```
**Part 3:**
In week 3 I learned how to access remote server and how to store my key so I don't need to enter the password for it to log in anymore. The lab of seeing people access the same remote server and adding staff on my server is fun. 
