<div id="problem-statement" class="_problemBody_lulsq_29 print"><h2>Problem</h2>
<p>
If Give an integer <b>N</b> . Write a program to obtain the sum of the first and last digits of this number.
</p>
<h3>Input</h3>
<p> 
</p><p>The first line contains an integer <b>T</b>, the total number of test cases. Then follow <b>T</b> lines, each line contains an integer <b>N</b>.</p>
<p></p>
<h3>Output</h3>
<p>For each test case, display the sum of first and last digits of <b>N</b> in a new line.</p>
<h3>Constraints</h3>
<ul>
<li>1 <b>≤</b> <b>T</b> <b>≤</b> 1000</li>
<li>1 <b>≤</b> <b>N</b> <b>≤</b> 1000000</li>
</ul>
<h3>Example</h3>
<pre><b>Input</b>
3 
1234
124894
242323
<p><b>Output</b>
5
5
5
</p></pre><p></p></div>

# Solution:

## Python:
```

for i in range(int(input())):
    s = input()
    print(int(s[0]) + int(s[len(s) - 1]))


```

## Java:
```
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	  Scanner get = new Scanner(System.in);
	  int i=0,sum=0,rem=0,t = get.nextInt();
	  while(i<t)
	  {
	      int a = get.nextInt();
	      sum = a%10;
	      while(a>0)
	      {
	          rem = a%10;
	          a = a/10;
	      }
	      sum = sum+rem;
	      System.out.println(sum);
	      i++;
	  }
	}
}
```
