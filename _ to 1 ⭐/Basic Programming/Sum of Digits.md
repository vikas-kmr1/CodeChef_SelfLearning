<div id="problem-statement" class="_problemBody_lulsq_29 print"><h2>Problem</h2>
<p>
You're given an integer <b>N</b>. Write a program to calculate the sum of all the digits of <b>N</b>. 
</p>
<h3>Input</h3>
<p> 
The first line contains an integer <b>T</b>, the total number of testcases. Then follow <b>T</b> lines, each line contains an integer <b>N</b>. 
</p>
<h3>Output</h3>
<p> For each test case, calculate the sum of digits of <b>N</b>, and display it in a new line.</p>
<h3>Constraints</h3>
<ul>
<li>1 <b>≤</b> <b>T</b> <b>≤</b> 1000</li>
<li>1 <b>≤</b> <b>N</b> <b>≤</b> 1000000</li>
</ul>
<h3>Example</h3>
<pre><b>Input</b>
3 
12345
31203
2123
<b>Output</b>
15
9
8
</pre></div>

# Solution: 
## Python:
``` 
``` 
## Java: 
```
import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        //Taking input t for number of test cases
       int t = sc.nextInt();
        for(int i=0;i<t;i++){
            int n = sc.nextInt();
            //Declare a variable to store the sum and set it to 0
            int sum = 0 ;
            while(n>0){
                //Get the rightmost digit of the number with help of the remainder ‘%’ operator by dividing it by 10 and adding it to the sum.
            int temp = n%10;
            sum +=temp;
            //Divide the number by 10 with help of ‘/’ operator to remove the rightmost digit.
            n/=10;
            }
            System.out.println(sum);
        }
    }
}
```
