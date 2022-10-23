<div id="problem-statement" class="_problemBody_lulsq_29 print"><h2>Problem</h2>
<h3>Read problems statements in <a href="https://www.codechef.com/download/translated/COOK126/hindi/PASSWD.pdf">Hindi</a>, <a href="https://www.codechef.com/download/translated/COOK126/mandarin/PASSWD.pdf">Mandarin Chinese</a>, <a href="https://www.codechef.com/download/translated/COOK126/russian/PASSWD.pdf">Russian</a>, <a href="https://www.codechef.com/download/translated/COOK126/vietnamese/PASSWD.pdf">Vietnamese</a>, and <a href="https://www.codechef.com/download/translated/COOK126/bengali/PASSWD.pdf">Bengali</a> as well.</h3>
<p>Chef is planning to setup a secure password for his Codechef account. For a password to be secure the following conditions should be satisfied:</p>
<ol>
<li>
<p>Password must contain at least one lower case letter <span class="math math-inline"><span class="katex"><span class="katex-mathml"><math xmlns="http://www.w3.org/1998/Math/MathML"><semantics><mrow><mo stretchy="false">[</mo><mi>a</mi><mo>−</mo><mi>z</mi><mo stretchy="false">]</mo></mrow><annotation encoding="application/x-tex">[a-z]</annotation></semantics></math></span><span class="katex-html" aria-hidden="true"><span class="base"><span class="strut" style="height: 1em; vertical-align: -0.25em;"></span><span class="mopen">[</span><span class="mord mathnormal">a</span><span class="mspace" style="margin-right: 0.2222em;"></span><span class="mbin">−</span><span class="mspace" style="margin-right: 0.2222em;"></span></span><span class="base"><span class="strut" style="height: 1em; vertical-align: -0.25em;"></span><span class="mord mathnormal" style="margin-right: 0.04398em;">z</span><span class="mclose">]</span></span></span></span></span>;</p>
</li>
<li>
<p>Password must contain at least one upper case letter <span class="math math-inline"><span class="katex"><span class="katex-mathml"><math xmlns="http://www.w3.org/1998/Math/MathML"><semantics><mrow><mo stretchy="false">[</mo><mi>A</mi><mo>−</mo><mi>Z</mi><mo stretchy="false">]</mo></mrow><annotation encoding="application/x-tex">[A-Z]</annotation></semantics></math></span><span class="katex-html" aria-hidden="true"><span class="base"><span class="strut" style="height: 1em; vertical-align: -0.25em;"></span><span class="mopen">[</span><span class="mord mathnormal">A</span><span class="mspace" style="margin-right: 0.2222em;"></span><span class="mbin">−</span><span class="mspace" style="margin-right: 0.2222em;"></span></span><span class="base"><span class="strut" style="height: 1em; vertical-align: -0.25em;"></span><span class="mord mathnormal" style="margin-right: 0.07153em;">Z</span><span class="mclose">]</span></span></span></span></span> strictly inside, i.e. not as the first or the last character;</p>
</li>
<li>
<p>Password must contain at least one digit <span class="math math-inline"><span class="katex"><span class="katex-mathml"><math xmlns="http://www.w3.org/1998/Math/MathML"><semantics><mrow><mo stretchy="false">[</mo><mn>0</mn><mo>−</mo><mn>9</mn><mo stretchy="false">]</mo></mrow><annotation encoding="application/x-tex">[0-9]</annotation></semantics></math></span><span class="katex-html" aria-hidden="true"><span class="base"><span class="strut" style="height: 1em; vertical-align: -0.25em;"></span><span class="mopen">[</span><span class="mord">0</span><span class="mspace" style="margin-right: 0.2222em;"></span><span class="mbin">−</span><span class="mspace" style="margin-right: 0.2222em;"></span></span><span class="base"><span class="strut" style="height: 1em; vertical-align: -0.25em;"></span><span class="mord">9</span><span class="mclose">]</span></span></span></span></span> strictly inside;</p>
</li>
<li>
<p>Password must contain at least one special character from the set <span class="math math-inline"><span class="katex"><span class="katex-mathml"><math xmlns="http://www.w3.org/1998/Math/MathML"><semantics><mrow><mo stretchy="false">{</mo></mrow><annotation encoding="application/x-tex">\{</annotation></semantics></math></span><span class="katex-html" aria-hidden="true"><span class="base"><span class="strut" style="height: 1em; vertical-align: -0.25em;"></span><span class="mopen">{</span></span></span></span></span> '@', '#', '%', '&amp;', '?' <span class="math math-inline"><span class="katex"><span class="katex-mathml"><math xmlns="http://www.w3.org/1998/Math/MathML"><semantics><mrow><mo stretchy="false">}</mo></mrow><annotation encoding="application/x-tex">\}</annotation></semantics></math></span><span class="katex-html" aria-hidden="true"><span class="base"><span class="strut" style="height: 1em; vertical-align: -0.25em;"></span><span class="mclose">}</span></span></span></span></span> strictly inside;</p>
</li>
<li>
<p>Password must be at least <span class="math math-inline"><span class="katex"><span class="katex-mathml"><math xmlns="http://www.w3.org/1998/Math/MathML"><semantics><mrow><mn>10</mn></mrow><annotation encoding="application/x-tex">10</annotation></semantics></math></span><span class="katex-html" aria-hidden="true"><span class="base"><span class="strut" style="height: 0.6444em;"></span><span class="mord">10</span></span></span></span></span> characters in length, but it can be longer.</p>
</li>
</ol>
<p>Chef has generated several strings and now wants you to check whether the passwords are secure based on the above criteria. Please help Chef in doing so.</p>
<h3>Input</h3>
<ul>
<li>First line will contain <span class="math math-inline"><span class="katex"><span class="katex-mathml"><math xmlns="http://www.w3.org/1998/Math/MathML"><semantics><mrow><mi>T</mi></mrow><annotation encoding="application/x-tex">T</annotation></semantics></math></span><span class="katex-html" aria-hidden="true"><span class="base"><span class="strut" style="height: 0.6833em;"></span><span class="mord mathnormal" style="margin-right: 0.13889em;">T</span></span></span></span></span>, number of testcases. Then the testcases follow.</li>
<li>Each testcase contains of a single line of input, string <span class="math math-inline"><span class="katex"><span class="katex-mathml"><math xmlns="http://www.w3.org/1998/Math/MathML"><semantics><mrow><mi>S</mi></mrow><annotation encoding="application/x-tex">S</annotation></semantics></math></span><span class="katex-html" aria-hidden="true"><span class="base"><span class="strut" style="height: 0.6833em;"></span><span class="mord mathnormal" style="margin-right: 0.05764em;">S</span></span></span></span></span>.</li>
</ul>
<h3>Output</h3>
<p>For each testcase, output in a single line "YES" if the password is secure and "NO" if it is not.</p>
<h3>Constraints</h3>
<ul>
<li><span class="math math-inline"><span class="katex"><span class="katex-mathml"><math xmlns="http://www.w3.org/1998/Math/MathML"><semantics><mrow><mn>1</mn><mo>≤</mo><mi mathvariant="normal">∣</mi><mi>S</mi><mi mathvariant="normal">∣</mi><mo>≤</mo><mn>20</mn></mrow><annotation encoding="application/x-tex">1 \leq |S| \leq 20</annotation></semantics></math></span><span class="katex-html" aria-hidden="true"><span class="base"><span class="strut" style="height: 0.7804em; vertical-align: -0.136em;"></span><span class="mord">1</span><span class="mspace" style="margin-right: 0.2778em;"></span><span class="mrel">≤</span><span class="mspace" style="margin-right: 0.2778em;"></span></span><span class="base"><span class="strut" style="height: 1em; vertical-align: -0.25em;"></span><span class="mord">∣</span><span class="mord mathnormal" style="margin-right: 0.05764em;">S</span><span class="mord">∣</span><span class="mspace" style="margin-right: 0.2778em;"></span><span class="mrel">≤</span><span class="mspace" style="margin-right: 0.2778em;"></span></span><span class="base"><span class="strut" style="height: 0.6444em;"></span><span class="mord">20</span></span></span></span></span></li>
<li>All the characters in <span class="math math-inline"><span class="katex"><span class="katex-mathml"><math xmlns="http://www.w3.org/1998/Math/MathML"><semantics><mrow><mi>S</mi></mrow><annotation encoding="application/x-tex">S</annotation></semantics></math></span><span class="katex-html" aria-hidden="true"><span class="base"><span class="strut" style="height: 0.6833em;"></span><span class="mord mathnormal" style="margin-right: 0.05764em;">S</span></span></span></span></span> are one of the following: lower case letters <span class="math math-inline"><span class="katex"><span class="katex-mathml"><math xmlns="http://www.w3.org/1998/Math/MathML"><semantics><mrow><mo stretchy="false">[</mo><mi>a</mi><mo>−</mo><mi>z</mi><mo stretchy="false">]</mo></mrow><annotation encoding="application/x-tex">[a-z]</annotation></semantics></math></span><span class="katex-html" aria-hidden="true"><span class="base"><span class="strut" style="height: 1em; vertical-align: -0.25em;"></span><span class="mopen">[</span><span class="mord mathnormal">a</span><span class="mspace" style="margin-right: 0.2222em;"></span><span class="mbin">−</span><span class="mspace" style="margin-right: 0.2222em;"></span></span><span class="base"><span class="strut" style="height: 1em; vertical-align: -0.25em;"></span><span class="mord mathnormal" style="margin-right: 0.04398em;">z</span><span class="mclose">]</span></span></span></span></span>, upper case letters <span class="math math-inline"><span class="katex"><span class="katex-mathml"><math xmlns="http://www.w3.org/1998/Math/MathML"><semantics><mrow><mo stretchy="false">[</mo><mi>A</mi><mo>−</mo><mi>Z</mi><mo stretchy="false">]</mo></mrow><annotation encoding="application/x-tex">[A-Z]</annotation></semantics></math></span><span class="katex-html" aria-hidden="true"><span class="base"><span class="strut" style="height: 1em; vertical-align: -0.25em;"></span><span class="mopen">[</span><span class="mord mathnormal">A</span><span class="mspace" style="margin-right: 0.2222em;"></span><span class="mbin">−</span><span class="mspace" style="margin-right: 0.2222em;"></span></span><span class="base"><span class="strut" style="height: 1em; vertical-align: -0.25em;"></span><span class="mord mathnormal" style="margin-right: 0.07153em;">Z</span><span class="mclose">]</span></span></span></span></span>, digits <span class="math math-inline"><span class="katex"><span class="katex-mathml"><math xmlns="http://www.w3.org/1998/Math/MathML"><semantics><mrow><mo stretchy="false">[</mo><mn>0</mn><mo>−</mo><mn>9</mn><mo stretchy="false">]</mo></mrow><annotation encoding="application/x-tex">[0-9]</annotation></semantics></math></span><span class="katex-html" aria-hidden="true"><span class="base"><span class="strut" style="height: 1em; vertical-align: -0.25em;"></span><span class="mopen">[</span><span class="mord">0</span><span class="mspace" style="margin-right: 0.2222em;"></span><span class="mbin">−</span><span class="mspace" style="margin-right: 0.2222em;"></span></span><span class="base"><span class="strut" style="height: 1em; vertical-align: -0.25em;"></span><span class="mord">9</span><span class="mclose">]</span></span></span></span></span>, special characters from the set <span class="math math-inline"><span class="katex"><span class="katex-mathml"><math xmlns="http://www.w3.org/1998/Math/MathML"><semantics><mrow><mo stretchy="false">{</mo></mrow><annotation encoding="application/x-tex">\{</annotation></semantics></math></span><span class="katex-html" aria-hidden="true"><span class="base"><span class="strut" style="height: 1em; vertical-align: -0.25em;"></span><span class="mopen">{</span></span></span></span></span> '@', '#', '%', '&amp;', '?' <span class="math math-inline"><span class="katex"><span class="katex-mathml"><math xmlns="http://www.w3.org/1998/Math/MathML"><semantics><mrow><mo stretchy="false">}</mo></mrow><annotation encoding="application/x-tex">\}</annotation></semantics></math></span><span class="katex-html" aria-hidden="true"><span class="base"><span class="strut" style="height: 1em; vertical-align: -0.25em;"></span><span class="mclose">}</span></span></span></span></span></li>
<li>Sum of length of strings over all tests is atmost <span class="math math-inline"><span class="katex"><span class="katex-mathml"><math xmlns="http://www.w3.org/1998/Math/MathML"><semantics><mrow><mn>1</mn><msup><mn>0</mn><mn>6</mn></msup></mrow><annotation encoding="application/x-tex">10^6</annotation></semantics></math></span><span class="katex-html" aria-hidden="true"><span class="base"><span class="strut" style="height: 0.8141em;"></span><span class="mord">1</span><span class="mord"><span class="mord">0</span><span class="msupsub"><span class="vlist-t"><span class="vlist-r"><span class="vlist" style="height: 0.8141em;"><span style="top: -3.063em; margin-right: 0.05em;"><span class="pstrut" style="height: 2.7em;"></span><span class="sizing reset-size6 size3 mtight"><span class="mord mtight">6</span></span></span></span></span></span></span></span></span></span></span></span></li>
</ul>
<h3>Sample 1:</h3>
<div data-reactroot="" class="_input_output__table_lulsq_184"><div class="_text_copy__container_lulsq_188"><div class="_text_copy_lulsq_188 _input_top__box_lulsq_198" style="border-right: 1px solid rgb(210, 217, 231);"><span>Input</span><div title="Copy to clipboard" class="" style="pointer-events: all;"><span class="_icon__box_9xn05_2 undefined"><i class="_copy__icon_9xn05_14"></i></span></div></div><div class="_text_copy_lulsq_188 _ouput_top__box_lulsq_201"><span>Output</span><div title="Copy to clipboard" class="" style="pointer-events: all;"><span class="_icon__box_9xn05_2 undefined"><i class="_copy__icon_9xn05_14"></i></span></div></div></div><div class="_values__container_lulsq_204"><div class="_values_lulsq_204" style="border-right: 1px solid rgb(210, 217, 231);"><pre>3# cookOff#P1
U@code4CHEFINA
gR3@tPWD</pre></div><div class="_values_lulsq_204"><pre>NO
YES
NO</pre></div></div></div>
<h3>Explanation:</h3>
<p><strong>Example case 1:</strong> Condition <span class="math math-inline"><span class="katex"><span class="katex-mathml"><math xmlns="http://www.w3.org/1998/Math/MathML"><semantics><mrow><mn>3</mn></mrow><annotation encoding="application/x-tex">3</annotation></semantics></math></span><span class="katex-html" aria-hidden="true"><span class="base"><span class="strut" style="height: 0.6444em;"></span><span class="mord">3</span></span></span></span></span> is not satisfied, because the only digit is not strictly inside.</p>
<p><strong>Example case 2:</strong> All conditions are satisfied.</p>
<p><strong>Example case 3:</strong> Condition <span class="math math-inline"><span class="katex"><span class="katex-mathml"><math xmlns="http://www.w3.org/1998/Math/MathML"><semantics><mrow><mn>5</mn></mrow><annotation encoding="application/x-tex">5</annotation></semantics></math></span><span class="katex-html" aria-hidden="true"><span class="base"><span class="strut" style="height: 0.6444em;"></span><span class="mord">5</span></span></span></span></span> is not satisfied, because the length of this string is 8.</p></div>


## Solution

***python3***

```
# cook your dish here

t=int(input())
for i in range(t):
    n=input()
    s=""
    for j in n:
        if(ord(j)<=122 and ord(j)>=97):
            s=s+'1'
            break
    for j in range(1,len(n)-1):
        if(ord(n[j])<=90 and ord(n[j])>=65 ):
            s=s+'1'
            break
    for j in range(1,len(n)-1):
        if(ord(n[j])==64 or ord(n[j])==35 or ord(n[j])==37  or ord(n[j])==38   or ord(n[j])==63 ):
            s=s+'1'
            break
    for j in range(1,len(n)-1):
        if(ord(n[j])<=58 and ord(n[j])>=48 ):
            s=s+'1'
            break
    if(len(n)>=10):
        s=s+'1'
    if(s=="11111"):
        print("YES")
    else:
        print("NO")

```
***java***

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
		try(Scanner S = new Scanner(System.in)){
		    int t = S.nextInt();
		    for(int i=0;i<t;i++){
		        String str = S.next();
		        boolean sp=false,l=false,u=false,d=false,len=false;
		        
		            for(int i1=1;i1<str.length()-1;i1++){
		                if(Character.isDigit(str.charAt(i1)))
		                    d=true;
		                else if(Character.isLowerCase(str.charAt(i1)))
		                    l=true;
		                else if(Character.isUpperCase(str.charAt(i1)))
		                    u=true;
		                else 
		                    sp = true;
		            }
		            if(Character.isLowerCase(str.charAt(0))||Character.isLowerCase(str.charAt(str.length()-1)))
                        l = true;
                    if(str.length()>=10)
                        len = true;
                    if(d&&l&&u&&sp&&len)
                        System.out.println("YES");
                    else
                        System.out.println("NO");
    		        
		        
		    }
		}catch(Exception e){
		    return;
		}
	}
}

