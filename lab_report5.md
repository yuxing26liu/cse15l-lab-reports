<h1>Lab Report 5 - Putting it All Together (Week 9)</h1>
<br>
Part 1 – Debugging Scenario
Debugging scenario:
<br>
I create a function that's supposed to take in a txt file and use the for loop to print out the number inside the txt file (which is from 10 to 1). <br>
![plot](https://github.com/yuxing26liu/cse15l-lab-reports/blob/main/1.png?raw=true)
<br>

This is the file structure. 
```
lab-report5/
├── test.sh/
├── countdown.txt/
├── Whileloop.java
```

This is what inside the Whileloop.java :
```
public class Whileloop {
    public static void main(String[] args) throws Exception {
        for (int i=0;i<10;i++) {
            File file = new File(args[0]);
            Scanner scanner = new Scanner(file);
            String time = scanner.nextLine();
            System.out.println("Count Down:" + time);
            scanner.close();
        }
    }
}

```
This is what inside the countdown.txt: 
```
10
9
8
7
6
5
4
3
2
1
```

This is what inside the test.sh file:
```
javac Whileloop.java
java Whileloop countdown.txt 

```

Student Post: <br>
Title: Having issue when runing the function<br>

<br>
Content: <br>
Hi, I am having issue when trying to run the test.sh using bash. It says that "Error: Could not find or load main class Whileloop" and pointing to the Scanner class. 
Below is a picture of my terminal output: <br>
![plot](https://github.com/yuxing26liu/cse15l-lab-reports/blob/main/2.png?raw=true)


<br> 
<br> 

TA Response: <br>
Looks like you didn't import the `File` and `Scanner` classes.  In Java, you need to import these classes from the `java.io` and `java.util` packages. Let me know if you need more help! <br>
```
import java.io.File;
import java.util.Scanner;
```
<br>
Student: <br>
Thank you so much! I added it and now it runs but I don't know why it's only printing out countdown:10 instead of from 10 to 1. <br>
Below is a picture of my terminal output: <br>
![plot](https://github.com/yuxing26liu/cse15l-lab-reports/blob/main/3.png?raw=true)
<br>
<br> 
TA: <br>
Because the Scanner is inside the for loop so you created a new scanner in each loop and that's why it is causing the error. You need to move the Scanner scanner = new Scanner(file); before the for loop. 
<br>
Student: <br>
Thank you so much! It works now :) <br>

Part 2 – Reflection
It's really interesting to learn autograding because I have used that a lot in CSE12 and I never know the process or the code of the autograder. It's super cool to write test to determine the student's grade. It's also really intesting to learn vim and it is a really efficent tool and there are so many little shortcut for vim. 
