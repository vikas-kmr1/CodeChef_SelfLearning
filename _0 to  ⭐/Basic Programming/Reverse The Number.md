<div id="problem-statement" class="_problemBody_lulsq_29 print"><h2>Problem</h2>
<p>Given an Integer <b>N</b>, write a program to reverse it.</p>
<h3>Input</h3>
<p> 
The first line contains an integer <b>T</b>, total number of testcases. Then follow <b>T</b> lines, each line contains an integer <b>N</b>. 
</p>
<h3>Output</h3>
<p> For each test case, display the reverse of the given number <b>N</b>, in a new line.</p>
<h3>Constraints</h3>
<ul>
<li>1 <b>≤</b> <b>T</b> <b>≤</b> 1000</li>
<li>1 <b>≤</b> <b>N</b> <b>≤</b> 1000000</li>
</ul>
<h3>Sample 1:</h3>
<div data-reactroot="" class="_input_output__table_lulsq_184"><div class="_text_copy__container_lulsq_188"><div class="_text_copy_lulsq_188 _input_top__box_lulsq_198" style="border-right: 1px solid rgb(210, 217, 231);"><span>Input</span><div title="Copy to clipboard" class="" style="pointer-events: all;"><span class="_icon__box_9xn05_2 undefined"><i class="_copy__icon_9xn05_14"></i></span></div></div><div class="_text_copy_lulsq_188 _ouput_top__box_lulsq_201"><span>Output</span><div title="Copy to clipboard" class="" style="pointer-events: all;"><span class="_icon__box_9xn05_2 undefined"><i class="_copy__icon_9xn05_14"></i></span></div></div></div><div class="_values__container_lulsq_204"><div class="_values_lulsq_204" style="border-right: 1px solid rgb(210, 217, 231);"><pre>4
12345
31203
2123
2300</pre></div><div class="_values_lulsq_204"><pre>54321
30213
3212
32</pre></div></div></div></div>

# Solution: 
## Python:
``` 
t = int(input())
for i in range(t):
    reverse = 0
    num = int(input())
    while(num):
        remainder = num%10
        reverse =reverse*10+remainder
        num = int(num/10)
    print(reverse)


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
		    int n = sc.nextInt();
		    /*Reversing a number means that the digit at the first position should be swapped with the last digit, the second digit will be swapped with the second last digit, and so on till the middle element.*/
		    int reverse = 0;
		    while(n != 0){
		        //Take the number’s modulo by 10
		        int remainder = n % 10;
		        //Multiply the reverse number by 10 and add modulo value into the reverse number.
		        reverse = reverse * 10 + remainder;
		        //Divide the number by 10.
		        n = n/10;
		        //Repeat above steps until number becomes zero.
		    }
		    System.out.println(reverse);
		    
		}
	}
}
```
