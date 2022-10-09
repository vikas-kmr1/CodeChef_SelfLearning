<div id="problem-statement" class="_problemBody_lulsq_29 print"><h2>Problem</h2>
<p>
Write a program to check whether a triangle is valid or not, when the three angles of the triangle are the inputs. A triangle is valid if the sum of all the three angles is equal to 180 degrees.
</p>
<h3>Input</h3>
<p> 
The first line contains an integer <b>T</b>, the total number of testcases. Then <b>T</b> lines follow, each line contains three angles  <b>A</b>, <b>B</b> and <b>C</b>, of the triangle separated by space. 
</p>
<h3>Output</h3>
<p>For each test case, display 'YES' if the triangle is valid, and 'NO', if it is not, in a new line.</p>
<h3>Constraints</h3>
<ul>
<li>1 <b>≤</b> <b>T</b> <b>≤</b> 1000</li>
<li>1<b> ≤</b>  <b>A,B,C</b> <b>≤</b> 180</li>
</ul>
<h3>Example</h3>
<pre><b>Input</b>
<p>3
40 40 100
45 45 90
180 1 1
<b>Output</b></p>
<p>YES
YES
NO
</p></pre><p></p></div>

# Solution:

## Python:
```
```

## Java:
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
		    //Taking input of three angles of triangle
		    int a = sc.nextInt();
		    int b = sc.nextInt();
		    int c = sc.nextInt();
		    //Checking if the sum of all three angles is 180 or not
		    if((a+b+c)==180){
		        //For valid triangles
		        System.out.println("YES");
		    }
		    else{
		        //for invalid triangles
		        System.out.println("NO");
		    }
		}
	}
}
```
