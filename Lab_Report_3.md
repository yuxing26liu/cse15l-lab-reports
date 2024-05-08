<h1> Lab Report 3 - Bugs and Commands (Week 5)<h1>

**Part 1 - Bugs**
Choose one of the bugs from week 4's lab.

Provide:

A failure-inducing input for the buggy program, as a JUnit test and any associated code (write it as a code block in Markdown). <br>
This test is testing the merge method inside the ListExamples.java and the ListExamples.java failed the test. 
```
  @Test(timeout = 500)
  public void testMergeRightEnd() {
    List<String> left = Arrays.asList("a", "b", "c");
    List<String> right = Arrays.asList("a", "d");
    List<String> merged = ListExamples.merge(left, right);
    List<String> expected = Arrays.asList("a", "a", "b", "c", "d");
    assertEquals(expected, merged);
  }
```


An input that doesn't induce a failure, as a JUnit test and any associated code (write it as a code block in Markdown).<br>
ListExapmles passed this test. 
```
  @Test(timeout = 500)
  public void testFilterMethod(){
        List<String> list = List.of("moon", "oon", "m", "moon", "moo", "moon");
        List<String> expected = List.of("moon", "moon", "moon");
        List<String> output = ListExamples.filter(list, new IsMoon());
        
        assertEquals(expected, output);
  }
```

The symptom, as the output of running the two tests above (provide it as a screenshot -- one test should pass, one test should fail).
```
There was 1 failure:
1) testMergeRightEnd(TestListExamples)
org.junit.runners.model.TestTimedOutException: test timed out after 500 milliseconds
        at java.base@18.0.2.1/java.util.Arrays.copyOf(Arrays.java:3512)
        at java.base@18.0.2.1/java.util.Arrays.copyOf(Arrays.java:3481)
        at java.base@18.0.2.1/java.util.ArrayList.grow(ArrayList.java:237)
        at java.base@18.0.2.1/java.util.ArrayList.grow(ArrayList.java:244)
        at java.base@18.0.2.1/java.util.ArrayList.add(ArrayList.java:454)
        at java.base@18.0.2.1/java.util.ArrayList.add(ArrayList.java:467)
        at app//ListExamples.merge(ListExamples.java:42)
        at app//TestListExamples.testMergeRightEnd(TestListExamples.java:18)
        at java.base@18.0.2.1/java.lang.invoke.LambdaForm$DMH/0x0000000800c12400.invokeVirtual(LambdaForm$DMH)
        at java.base@18.0.2.1/java.lang.invoke.LambdaForm$MH/0x0000000800c13000.invoke(LambdaForm$MH)
        at java.base@18.0.2.1/java.lang.invoke.Invokers$Holder.invokeExact_MT(Invokers$Holder)

FAILURES!!!
Tests run: 2,  Failures: 1
```

The bug, as the before-and-after code change required to fix it (as two code blocks in Markdown).
Before: <br> 
```
static List<String> filter(List<String> list, StringChecker sc) {
static List<String> merge(List<String> list1, List<String> list2) {
    List<String> result = new ArrayList<>();
    int index1 = 0, index2 = 0;
    while(index1 < list1.size() && index2 < list2.size()) {
      if(list1.get(index1).compareTo(list2.get(index2)) < 0) {
        result.add(list1.get(index1));
        index1 += 1;
      }
      else {
        result.add(list2.get(index2));
        index2 += 1;
      }
    }
    while(index1 < list1.size()) {
      result.add(list1.get(index1));
      index1 += 1;
    }
    while(index2 < list2.size()) {
      result.add(list2.get(index2));
      index1 += 1;
    }
    return result;
  }
```
After: <br> 
```
public static List<String> merge(List<String> list1, List<String> list2) {
        List<String> result = new ArrayList<>();
        int index1 = 0, index2 = 0;
        while (index1 < list1.size() && index2 < list2.size()) {
            if (list1.get(index1).compareTo(list2.get(index2)) < 0) {
                result.add(list1.get(index1));
                index1++;
            } else {
                result.add(list2.get(index2));
                index2++;
            }
        }
        while (index1 < list1.size()) {
            result.add(list1.get(index1));
            index1++;
        }
        while (index2 < list2.size()) {
            result.add(list2.get(index2));
            index2++;
        }
        return result;
    }
```
Briefly describe (2-3 sentences) why the fix addresses the issue. <br> 
Logical Error in merge Method: There is a mistake in the loop that processes the remaining elements from the second list (list2). You incorrectly increment index1 instead of index2. This causes an infinite loop if list2 has more elements left to add after list1 is exhausted.
There is a logical error with the merge method as it incrememnt index1 instead of index2 which case an infinite loop. It also requires writing public infront of the method header. 
<br>
**Part 2 - Researching Commands**
Consider the commands less, find, and grep. Choose one of them. Online, find 4 interesting command-line options or alternate ways to use the single command you chose. Many commands like these have pretty sophisticated behavior possible – it can take years to be exposed to and learn all of the possible tricks and inner workings. To find information about the commands, a simple Web search like “find command-line options” will probably give decent results. There is also a built-in command on many systems called man (short for “manual”) that displays information about commands; you can use man grep, for example, to see a long listing of information about how grep works. Also, consider asking ChatGPT!

For example, we saw the -name option for find in class.

Instruction: For each of those options, give 2 examples of using it on files and directories from ./technical. That makes 8 total examples, all focused on a single command. Show each example as a code block that shows the command and its output, and write a sentence or two about what it’s doing and why it’s useful.

Along with each option/mode you show, cite your source for how you found out about it as a URL or a description of where you found it. See the syllabus on Academic Integrity and how to cite sources like ChatGPT for this class.
