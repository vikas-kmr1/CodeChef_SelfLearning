<div id="problem-statement" class="_problemBody_lulsq_29 print"><h2>Problem</h2>
<h3>Problem Statement</h3>
<pre><code>Every problem starts with a Problem Statement. It tells you in detail about the task to be solved.</code></pre>
<p>
Shivam is the youngest programmer in the world, he is just 12 years old. Shivam is learning programming and today he is writing his first program.
<br><br>
</p><p>The task is very simple: given two integers A and B, write a program to add these two numbers and output it.</p>
<p></p>
<h3>Input Format</h3>
<pre><code>This section tells you the format in which your program should receive the input.</code></pre>
<p>
The first line contains an integer <b>T</b>, the total number of test cases. Then follow <b>T</b> lines, each line contains two Integers <b>A</b> and <b>B</b>.
</p>
<h3>Output Format</h3>
<pre><code>This section tells us the format in which your program should give the output</code></pre>
<p>For each test case, add <b>A</b> and <b>B</b> and display the sum in a new line.</p>
<pre><code>Everything your program prints is considered “output”, so if you output some debugging statements like “Please enter T”, this will be considered as part of your answer, and because it does not satisfy the output format, it will be marked wrong, even if your answer is otherwise correct!</code></pre>
<h3>Constraints</h3>
<div class="_html_code__block_lulsq_178">
<p>This section tells you the maximum and minimum possible values the variables in the problem statement can take. You <b>do not</b> need to check these constraints in your program. You can safely assume that the input given to your program will be in the given range of constraints.</p>
<ul><li>1 <b>≤</b> <b>T</b> <b>≤</b> 1000</li>
<li>0 <b>≤</b> <b>A,B</b> <b>≤</b> 10000</li>
</ul>
</div>
<h3>Sample 1:</h3>
<div data-reactroot="" class="_input_output__table_lulsq_184"><div class="_text_copy__container_lulsq_188"><div class="_text_copy_lulsq_188 _input_top__box_lulsq_198" style="border-right: 1px solid rgb(210, 217, 231);"><span>Input</span><div title="Copy to clipboard" class="" style="pointer-events: all;"><span class="_icon__box_9xn05_2 undefined"><i class="_copy__icon_9xn05_14"></i></span></div></div><div class="_text_copy_lulsq_188 _ouput_top__box_lulsq_201"><span>Output</span><div title="Copy to clipboard" class="" style="pointer-events: all;"><span class="_icon__box_9xn05_2 undefined"><i class="_copy__icon_9xn05_14"></i></span></div></div></div><div class="_values__container_lulsq_204"><div class="_values_lulsq_204" style="border-right: 1px solid rgb(210, 217, 231);"><pre>3
1 2
100 200
10 40</pre></div><div class="_values_lulsq_204"><pre>3
300
50</pre></div></div></div></div>

# Solution:

## Python:
```
T = int(input())
for tc in range(T):
	# Read integers a and b.
	(a, b) = map(int, input().split(' '))
	
	ans = a + b
	print(ans)
```
## java
  ```
  import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for(int i=0; i<t; i++){
		    int a = sc.nextInt();
		    int b = sc.nextInt();
		    System.out.println(a+b);
		}
	}
}

 ```
