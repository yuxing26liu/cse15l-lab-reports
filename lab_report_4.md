<h1> Lab Report 4 - Vim (Week 7)</h1>
1. Log into ieng6

```
ssh yul269@ieng6.ucsd.edu
```
Because I already have the key authorization so I don't need to input password. 

![plot](https://github.com/yuxing26liu/cse15l-lab-reports/blob/main/lab_report4/Screenshot%202024-05-31%20at%209.49.45%20AM.png)

2.Clone git repo to ieng6 server.
```
git clone git@github.com:yul269/cse15_lab7.git
```

![plot](https://github.com/yuxing26liu/cse15l-lab-reports/blob/main/lab_report4/Screenshot%202024-05-31%20at%209.57.44%20AM.png)


3.Run the Tests using bash test.sh
```
bash test.sh 
```

![plot](https://github.com/yuxing26liu/cse15l-lab-reports/blob/main/lab_report4/Screenshot%202024-05-31%20at%2010.00.45%20AM.png)_

4. Edit the Code File to Fix the Failing Test
Open the java file with vim:
```
vim ListExamples.java
```
keys pressed to edit in vim:

```
vim<space>ListExamples.java<enter>
/index1<enter>
cwwindex2<esc>
:wq<enter>
```
![plot](https://github.com/yuxing26liu/cse15l-lab-reports/blob/main/lab_report4/Screenshot%202024-05-31%20at%2011.04.55%20AM.png)_

Opened ListExamples.java in vim, navigated to index1, changed it to index2, saved, and exited.

5. Compile java files and run the test again 
![plot](https://github.com/yuxing26liu/cse15l-lab-reports/blob/main/lab_report4/Screenshot%202024-05-31%20at%2011.08.01%20AM.png)

6.Add changed file and make a commit then push to my git repo.
```
git add ListExamples.java
git commit -m “fix bug”
git push
```

![plot](https://github.com/yuxing26liu/cse15l-lab-reports/blob/main/lab_report4/Screenshot%202024-05-31%20at%2011.35.32%20AM.png)
