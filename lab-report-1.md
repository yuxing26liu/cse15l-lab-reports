# **Lab Report 1 - Remote Access and Filesystem** 
---

* Share an example of using the command with no arguments.

```
(base) yuxing@hoshis-MacBook-Pro ~ % cd
(base) yuxing@hoshis-MacBook-Pro ~ % 
```
*Defination of cd : Change Directory. Used to switch the current working directory to the given path* 
Absolute path: `/home/user`
If use without arguments, cd default changes the directory to the user's home directory. It does not display any information. This output is not an error. 



```
(base) yuxing@hoshis-MacBook-Pro ~ % ls
Applications			Pictures
Applications (Parallels)	Postman

```
Defination of ls : ls <path> - “List” Used to list the files and folders the given path
Absolute path: `/home/user`
ls lists the contents of current working directory which is `/home/user` because no arguments are provided. It prints out the files and directories in the working directory. It is not an error. 


    
```
cat 
```
*Defination of cat : cat <path1> <path2> ... - “Concatenate” Used to print the contents of one or more files given by the paths*
Absolute path: /home/user
When type in cat without argument, the terminal requires you to continue type in something and repeats the random words you type in. It doesn't result in an error directly; But it waits for input from the user and echoes it back.
(From google search) Without argument, the cat command reads from standard input and write to its standard output. The output is an error. It gives empty lines or repeats user inputs. 


  
* Share an example of using the command with a path to a directory as an argument.
```
cd Desktop
```
Absolute path:`/home/user`
After the command: `/home/user/Desktop` 
It moves to my Desktop directory from my orignial directory because cd takes the name of the folder you want to move to and then change to that direcoty. This output is not an error. 
  

    
```
ls Desktop
```
Absolute path: /home/user
It didn't change my working direcoty but list out all the file that's existing in my Desktop directory. This is not an error. 


    
```
cat Desktop
```
Absolute path: /home/user
It prints out 'cat: Applications: Is a directory.' 'cat' is designed to displat the contents of files not directories and will cause error. 


  
* Share an example of using the command with a path to a file as an argument.
```
cd /Users/yuxing/Desktop/Project-Team-1
```
or 
```
cd Desktop
cd Project-Team-1
```
Absolute path: `/home/user`
Absolute path after the command: `/Users/yuxing/Desktop/Project-Team-1`
*Desktop is one of my directory and Project-Team-1 is one folder in the desktop directory. Project-Team-1 is a folder on my desktop and index.html is one file inside the folder.*
If I try to access the file inside Project-Team-1 using cd, such as index.html file and it will display 
```
(base) yuxing@hoshis-MacBook-Pro Project-Team-1 % cd index.html
cd: not a directory: index.html
```
Because 'cd' is meant for changing directories and does not take a file path. It will cause the error.

    
```
ls /Users/yuxing/Desktop/Project-Team-1/index.html
```
*Project-Team-1 is a folder on my desktop and index.html is one file inside the folder.*
Absolute path: /home/user
It will prints out the absolute path to the file. Like the example below. 
```
(base) yuxing@hoshis-MacBook-Pro ~ % ls /Users/yuxing/Desktop/Project-Team-1/index.html
/Users/yuxing/Desktop/Project-Team-1/index.html
```
Because 'ls' is meant to list contents of directories not file. This is not an error. 

```
cat /Users/yuxing/Desktop/Project-Team-1/index.html
```
Absolue path: /home/user
It prints out the code content inside the index.html file. 'cat' takes in the file path and displays the contents of one or more files without having to open the file for editing. This output is not an error. 


