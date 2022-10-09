<div id="problem-statement" class="_problemBody_lulsq_29 print"><h2>Problem</h2>
<p>Pooja would like to withdraw <tt>X</tt> $US from an ATM. The cash machine will only accept the transaction if <tt>X</tt> is a multiple of 5, and Pooja's account balance has enough cash to perform the withdrawal transaction (including bank charges).  For each successful withdrawal the bank charges 0.50 $US.
</p><p>Calculate Pooja's account balance after an attempted transaction.</p>
<p></p><h3>Input</h3>
<p> Positive integer 0 &lt; <tt>X</tt> &lt;= 2000 - the amount of cash which Pooja wishes to withdraw.
</p><p> Nonnegative number 0&lt;= <tt>Y</tt> &lt;= 2000 with two digits of precision - Pooja's initial account balance.
</p><h3>Output</h3>
<p>Output the account balance after the attempted transaction, given as a number with two digits of precision.  If there is not enough money in the account to complete the transaction, output the current bank balance.
</p><h3>Example - Successful Transaction</h3>
<pre><b>Input:</b>
30 120.00

<b>Output:</b>
89.50
</pre>
<h3>Example - Incorrect Withdrawal Amount (not multiple of 5)</h3>
<pre><b>Input:</b>
42 120.00

<b>Output:</b>
120.00
</pre>
<h3>Example - Insufficient Funds</h3>
<pre><b>Input:</b>
300 120.00

<b>Output:</b>
120.00
</pre></div>

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
		    float x= sc.nextFloat();// the amount of cash which Pooja wishes to withdraw.
		    float y = sc.nextFloat();//Pooja's initial account balance.
		    
		    if(x%5 == 0 && y >= x+0.5f){
		        //Successful Transaction
		        x = y - x - 0.5f;
		        System.out.println(String.format("%.2f",x));
		    }
		    else{
                System.out.println(String.format("%.2f",y));
		    } 
	}
}

```
