<div id="problem-statement" class="_problemBody_lulsq_29 print"><h2>Problem</h2>
<p>The purpose of this problem is to verify whether the method you are using to read input data is sufficiently fast to handle problems branded with the <b>enormous Input/Output</b> warning. You are expected to be able to process at least 2.5MB of input data per second at runtime.
</p><h3>Input</h3>
<p>The input begins with two positive integers n k (n, k&lt;=10<sup>7</sup>). The next n lines of input contain one positive integer t<sub>i</sub>, not greater than 10<sup>9</sup>, each.
</p><h3>Output</h3>
<p>Write a single integer to output, denoting how many integers t<sub>i</sub> are divisible by k.
</p>
<h3>Sample 1:</h3>
<div data-reactroot="" class="_input_output__table_lulsq_184"><div class="_text_copy__container_lulsq_188"><div class="_text_copy_lulsq_188 _input_top__box_lulsq_198" style="border-right: 1px solid rgb(210, 217, 231);"><span>Input</span><div title="Copy to clipboard" class="" style="pointer-events: all;"><span class="_icon__box_9xn05_2 undefined"><i class="_copy__icon_9xn05_14"></i></span></div></div><div class="_text_copy_lulsq_188 _ouput_top__box_lulsq_201"><span>Output</span><div title="Copy to clipboard" class="" style="pointer-events: all;"><span class="_icon__box_9xn05_2 undefined"><i class="_copy__icon_9xn05_14"></i></span></div></div></div><div class="_values__container_lulsq_204"><div class="_values_lulsq_204" style="border-right: 1px solid rgb(210, 217, 231);"><pre>7 3
1
51
966369
7
9
999996
11
</pre></div><div class="_values_lulsq_204"><pre>4</pre></div></div></div>
<h3>Explanation:</h3>
<p>The integers divisible by 3 are 51, 966369, 9,51,966369,9, and 999996999996. Thus, there are 4 integers in total.</p></div>

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
		int n = sc.nextInt();
		int k = sc.nextInt();
		int count=0;
		for(int i=0; i<n; i++){
		    int t = sc.nextInt();
		    if(t%k==0){
		        count++;
		    }
		}
		System.out.println(count);
	}
}
```
