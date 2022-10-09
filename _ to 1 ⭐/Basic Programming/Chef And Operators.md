<div id="problem-statement" class="_problemBody_lulsq_29 print"><h2>Problem</h2>
<p>Chef has just started Programming, he is in first year of Engineering. Chef is reading about Relational Operators. <br>
Relational Operators are operators which check relatioship between two values. Given two numerical values <b>A</b> and <b>B</b> you need to help chef in finding the relationship between them that is, <br></p>First one is greater than second or,
First one is less than second or,
First and second one are equal.
<p>&nbsp;</p>
<h3>Input</h3>
<p>First line contains an integer <b>T</b>, which denotes the number of testcases. Each of the <b>T</b> lines contain two integers <b>A</b> and <b>B</b>. </p>
<h3>Output</h3>
<p>For each line of input produce one line of output. This line contains any one of the relational operators<br>
'&lt;' , '&gt;' , '='.</p>
<h3>Constraints</h3>
<p>
</p>1 ≤ <b>T</b> ≤ 10000
1 ≤ <b>A</b>, <b>B</b> ≤ 1000000001
<h3>Sample 1:</h3>
<div data-reactroot="" class="_input_output__table_lulsq_184"><div class="_text_copy__container_lulsq_188"><div class="_text_copy_lulsq_188 _input_top__box_lulsq_198" style="border-right: 1px solid rgb(210, 217, 231);"><span>Input</span><div title="Copy to clipboard" class="" style="pointer-events: all;"><span class="_icon__box_9xn05_2 undefined"><i class="_copy__icon_9xn05_14"></i></span></div></div><div class="_text_copy_lulsq_188 _ouput_top__box_lulsq_201"><span>Output</span><div title="Copy to clipboard" class="" style="pointer-events: all;"><span class="_icon__box_9xn05_2 undefined"><i class="_copy__icon_9xn05_14"></i></span></div></div></div><div class="_values__container_lulsq_204"><div class="_values_lulsq_204" style="border-right: 1px solid rgb(210, 217, 231);"><pre>3
10 20
20 10
10 10
</pre></div><div class="_values_lulsq_204"><pre>&lt;
&gt;
=</pre></div></div></div>
<h3>Explanation:</h3>
<p>In this example 1 as 10 is lesser than 20</p></div>

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
		//taking input t for number of test cases
		int t = sc.nextInt();
		for(int i=0; i<t; i++){
		    int a = sc.nextInt();
		    int b = sc.nextInt();
		    if(a>b){
		        //for a greater than b
		        System.out.println(">");
		    }
		    else if(a<b){
		        //for a less than b
		        System.out.println("<");
		    }
		    else{
		        //for a equal to b
		        System.out.println("=");
		    }
		}
	}
}
```
