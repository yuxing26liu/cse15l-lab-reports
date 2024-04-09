# **Lab Report 1 - Remote Access and Filesystem** 
---
<pre>
* Share an example of using the command with no arguments.
```
cd
```
*Defination of cd : cd <path> - “Change Directory” Used to switch the current working directory to the given path*
Absolute path: /home/user
If use without arguments, cd changes the directory to the user's home directory. It does not display any information. 

```
ls
```
Defination of ls : ls <path> - “List” Used to list the files and folders the given path
Absolute path: /home/user
ls lists the contents of current working directory which is /home/user because no arguments are provided. It prints out the files and directories in the working directory. 

```
cat 
```
*Defination of cat : cat <path1> <path2> ... - “Concatenate” Used to print the contents of one or more files given by the paths*
Absolute path: /home/user
When type in cat without argument, the terminal requires you to continue type in something and repeats the random words you type in. 
(From google search) Without argument, the cat command reads from standard input and write to its standard output.


* Share an example of using the command with a path to a directory as an argument.
```
cd Applications
```
Absolute path: /Users/yuxing/Applications
It moves to my application directory. 
```
ls Desktop
```
Absolute path: /home/user
It didn't change my working direcoty but list out all the file that's existing in my desktop directory. 
```
cat Desktop
```
Absolute path: /home/user
It prints out cat: Applications: Is a directory. 


* Share an example of using the command with a path to a file as an argument.
```
cd /Users/yuxing/Desktop/Project-Team-1
```
or 
```
cd Desktop
cd Project-Team-1
```
Absolute path: /Users/yuxing/Desktop/Project-Team-1
Desktop is one of my directory and Project-Team-1 is one folder in the desktop directory. 
If I try to access the file inside Project-Team-1 using cd, such as index.html file and it will display 
```
(base) yuxing@hoshis-MacBook-Pro Project-Team-1 % cd index.html
cd: not a directory: index.html
```



```
ls /Users/yuxing/Desktop/Project-Team-1/index.html
```
Absolute path: /home/user
It will prints out the absolute path to the file. 
```
(base) yuxing@hoshis-MacBook-Pro ~ % ls /Users/yuxing/Desktop/Project-Team-1/index.html
/Users/yuxing/Desktop/Project-Team-1/index.html
```
</pre>


```
cat /Users/yuxing/Desktop/Project-Team-1/index.html
```
Absolue path: /home/user
It prints out the code inside the index.html file. 
