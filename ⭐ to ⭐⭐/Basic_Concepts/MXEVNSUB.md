<div id="problem-statement" class="_problemBody_lulsq_29 print"><h2>Problem</h2>
<h3>Read problem statements in <a href="https://www.codechef.com/download/translated/LTIME99/mandarin/MXEVNSUB.pdf">Mandarin</a>, <a href="https://www.codechef.com/download/translated/LTIME99/bengali/MXEVNSUB.pdf">Bengali</a>, <a href="https://www.codechef.com/download/translated/LTIME99/russian/MXEVNSUB.pdf">Russian</a>, and <a href="https://www.codechef.com/download/translated/LTIME99/vietnamese/MXEVNSUB.pdf">Vietnamese</a> as well.</h3>
<p>You are given an integer <span class="math math-inline"><span class="katex"><span class="katex-mathml"><math xmlns="http://www.w3.org/1998/Math/MathML"><semantics><mrow><mi>N</mi></mrow><annotation encoding="application/x-tex">N</annotation></semantics></math></span><span class="katex-html" aria-hidden="true"><span class="base"><span class="strut" style="height: 0.6833em;"></span><span class="mord mathnormal" style="margin-right: 0.10903em;">N</span></span></span></span></span>. Consider the sequence containing the integers <span class="math math-inline"><span class="katex"><span class="katex-mathml"><math xmlns="http://www.w3.org/1998/Math/MathML"><semantics><mrow><mn>1</mn><mo separator="true">,</mo><mn>2</mn><mo separator="true">,</mo><mo>…</mo><mo separator="true">,</mo><mi>N</mi></mrow><annotation encoding="application/x-tex">1, 2, \ldots, N</annotation></semantics></math></span><span class="katex-html" aria-hidden="true"><span class="base"><span class="strut" style="height: 0.8778em; vertical-align: -0.1944em;"></span><span class="mord">1</span><span class="mpunct">,</span><span class="mspace" style="margin-right: 0.1667em;"></span><span class="mord">2</span><span class="mpunct">,</span><span class="mspace" style="margin-right: 0.1667em;"></span><span class="minner">…</span><span class="mspace" style="margin-right: 0.1667em;"></span><span class="mpunct">,</span><span class="mspace" style="margin-right: 0.1667em;"></span><span class="mord mathnormal" style="margin-right: 0.10903em;">N</span></span></span></span></span> in increasing order (each exactly once). Find the maximum length of its contiguous subsequence with an even sum.</p>
<h3>Input Format</h3>
<ul>
<li>The first line of the input contains a single integer <span class="math math-inline"><span class="katex"><span class="katex-mathml"><math xmlns="http://www.w3.org/1998/Math/MathML"><semantics><mrow><mi>T</mi></mrow><annotation encoding="application/x-tex">T</annotation></semantics></math></span><span class="katex-html" aria-hidden="true"><span class="base"><span class="strut" style="height: 0.6833em;"></span><span class="mord mathnormal" style="margin-right: 0.13889em;">T</span></span></span></span></span> denoting the number of test cases. The description of <span class="math math-inline"><span class="katex"><span class="katex-mathml"><math xmlns="http://www.w3.org/1998/Math/MathML"><semantics><mrow><mi>T</mi></mrow><annotation encoding="application/x-tex">T</annotation></semantics></math></span><span class="katex-html" aria-hidden="true"><span class="base"><span class="strut" style="height: 0.6833em;"></span><span class="mord mathnormal" style="margin-right: 0.13889em;">T</span></span></span></span></span> test cases follows.</li>
<li>The first and only line of each test case contains a single integer <span class="math math-inline"><span class="katex"><span class="katex-mathml"><math xmlns="http://www.w3.org/1998/Math/MathML"><semantics><mrow><mi>N</mi></mrow><annotation encoding="application/x-tex">N</annotation></semantics></math></span><span class="katex-html" aria-hidden="true"><span class="base"><span class="strut" style="height: 0.6833em;"></span><span class="mord mathnormal" style="margin-right: 0.10903em;">N</span></span></span></span></span>.</li>
</ul>
<h3>Output Format</h3>
<p>For each test case, print a single line containing one integer --- the maximum length of a contiguous subsequence with even sum.</p>
<h3>Constraints</h3>
<div class="_html_code__block_lulsq_178">
<ul>
<li><span class="math math-inline"><span class="katex"><span class="katex-mathml"><math xmlns="http://www.w3.org/1998/Math/MathML"><semantics><mrow><mn>1</mn><mo>≤</mo><mi>T</mi><mo>≤</mo><mn>1</mn><msup><mn>0</mn><mn>4</mn></msup></mrow><annotation encoding="application/x-tex">1 \leq T \leq 10^4</annotation></semantics></math></span><span class="katex-html" aria-hidden="true"><span class="base"><span class="strut" style="height: 0.7804em; vertical-align: -0.136em;"></span><span class="mord">1</span><span class="mspace" style="margin-right: 0.2778em;"></span><span class="mrel">≤</span><span class="mspace" style="margin-right: 0.2778em;"></span></span><span class="base"><span class="strut" style="height: 0.8193em; vertical-align: -0.136em;"></span><span class="mord mathnormal" style="margin-right: 0.13889em;">T</span><span class="mspace" style="margin-right: 0.2778em;"></span><span class="mrel">≤</span><span class="mspace" style="margin-right: 0.2778em;"></span></span><span class="base"><span class="strut" style="height: 0.8141em;"></span><span class="mord">1</span><span class="mord"><span class="mord">0</span><span class="msupsub"><span class="vlist-t"><span class="vlist-r"><span class="vlist" style="height: 0.8141em;"><span style="top: -3.063em; margin-right: 0.05em;"><span class="pstrut" style="height: 2.7em;"></span><span class="sizing reset-size6 size3 mtight"><span class="mord mtight">4</span></span></span></span></span></span></span></span></span></span></span></span></li>
<li><span class="math math-inline"><span class="katex"><span class="katex-mathml"><math xmlns="http://www.w3.org/1998/Math/MathML"><semantics><mrow><mn>2</mn><mo>≤</mo><mi>N</mi><mo>≤</mo><mn>1</mn><msup><mn>0</mn><mn>4</mn></msup></mrow><annotation encoding="application/x-tex">2 \leq N \leq 10^4</annotation></semantics></math></span><span class="katex-html" aria-hidden="true"><span class="base"><span class="strut" style="height: 0.7804em; vertical-align: -0.136em;"></span><span class="mord">2</span><span class="mspace" style="margin-right: 0.2778em;"></span><span class="mrel">≤</span><span class="mspace" style="margin-right: 0.2778em;"></span></span><span class="base"><span class="strut" style="height: 0.8193em; vertical-align: -0.136em;"></span><span class="mord mathnormal" style="margin-right: 0.10903em;">N</span><span class="mspace" style="margin-right: 0.2778em;"></span><span class="mrel">≤</span><span class="mspace" style="margin-right: 0.2778em;"></span></span><span class="base"><span class="strut" style="height: 0.8141em;"></span><span class="mord">1</span><span class="mord"><span class="mord">0</span><span class="msupsub"><span class="vlist-t"><span class="vlist-r"><span class="vlist" style="height: 0.8141em;"><span style="top: -3.063em; margin-right: 0.05em;"><span class="pstrut" style="height: 2.7em;"></span><span class="sizing reset-size6 size3 mtight"><span class="mord mtight">4</span></span></span></span></span></span></span></span></span></span></span></span></li>
</ul>
</div>
<h3>Subtasks</h3>
<div class="_html_code__block_lulsq_178">
<p><strong>Subtask #1 (100 points):</strong> original constraints</p>
</div>
<h3>Sample 1:</h3>
<div data-reactroot="" class="_input_output__table_lulsq_184"><div class="_text_copy__container_lulsq_188"><div class="_text_copy_lulsq_188 _input_top__box_lulsq_198" style="border-right: 1px solid rgb(210, 217, 231);"><span>Input</span><div title="Copy to clipboard" class="" style="pointer-events: all;"><span class="_icon__box_9xn05_2"><i class="_copy__icon_9xn05_14"></i></span></div></div><div class="_text_copy_lulsq_188 _ouput_top__box_lulsq_201"><span>Output</span><div title="Copy to clipboard" class="" style="pointer-events: all;"><span class="_icon__box_9xn05_2"><i class="_copy__icon_9xn05_14"></i></span></div></div></div><div class="_values__container_lulsq_204"><div class="_values_lulsq_204" style="border-right: 1px solid rgb(210, 217, 231);"><pre style="position: relative;">3
3
4
5<div class="open_grepper_editor" title="Edit &amp; Save To Grepper"></div></pre></div><div class="_values_lulsq_204"><pre style="position: relative;">3
4
4<div class="open_grepper_editor" title="Edit &amp; Save To Grepper"></div></pre></div></div></div>
<h3>Explanation:</h3>
<p><strong>Example case 1:</strong> The optimal choice is to choose the entire sequence, since the sum of all its elements is <span class="math math-inline"><span class="katex"><span class="katex-mathml"><math xmlns="http://www.w3.org/1998/Math/MathML"><semantics><mrow><mn>1</mn><mo>+</mo><mn>2</mn><mo>+</mo><mn>3</mn><mo>=</mo><mn>6</mn></mrow><annotation encoding="application/x-tex">1 + 2 + 3 = 6</annotation></semantics></math></span><span class="katex-html" aria-hidden="true"><span class="base"><span class="strut" style="height: 0.7278em; vertical-align: -0.0833em;"></span><span class="mord">1</span><span class="mspace" style="margin-right: 0.2222em;"></span><span class="mbin">+</span><span class="mspace" style="margin-right: 0.2222em;"></span></span><span class="base"><span class="strut" style="height: 0.7278em; vertical-align: -0.0833em;"></span><span class="mord">2</span><span class="mspace" style="margin-right: 0.2222em;"></span><span class="mbin">+</span><span class="mspace" style="margin-right: 0.2222em;"></span></span><span class="base"><span class="strut" style="height: 0.6444em;"></span><span class="mord">3</span><span class="mspace" style="margin-right: 0.2778em;"></span><span class="mrel">=</span><span class="mspace" style="margin-right: 0.2778em;"></span></span><span class="base"><span class="strut" style="height: 0.6444em;"></span><span class="mord">6</span></span></span></span></span>, which is even.</p>
<p><strong>Example case 3:</strong> One of the optimal choices is to choose the subsequence <span class="math math-inline"><span class="katex"><span class="katex-mathml"><math xmlns="http://www.w3.org/1998/Math/MathML"><semantics><mrow><mo stretchy="false">[</mo><mn>1</mn><mo separator="true">,</mo><mn>2</mn><mo separator="true">,</mo><mn>3</mn><mo separator="true">,</mo><mn>4</mn><mo stretchy="false">]</mo></mrow><annotation encoding="application/x-tex">[1, 2, 3, 4]</annotation></semantics></math></span><span class="katex-html" aria-hidden="true"><span class="base"><span class="strut" style="height: 1em; vertical-align: -0.25em;"></span><span class="mopen">[</span><span class="mord">1</span><span class="mpunct">,</span><span class="mspace" style="margin-right: 0.1667em;"></span><span class="mord">2</span><span class="mpunct">,</span><span class="mspace" style="margin-right: 0.1667em;"></span><span class="mord">3</span><span class="mpunct">,</span><span class="mspace" style="margin-right: 0.1667em;"></span><span class="mord">4</span><span class="mclose">]</span></span></span></span></span>, which has an even sum.</p></div>


## Solution:
Python3:
```
# cook your dish here
for i in range(int(input())):
    n =int( input())
    s = ( n * (n+1) )/2
    
    if s%2 != 0:
        print(n-1)
    else:
        print(n)
    
    
    
```

java
```
/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner scan = new Scanner(System.in);
	    int t = scan.nextInt();
	    
	    for(int i=0 ; i<t; i++){
	        
	        int n = scan.nextInt();
	       
            int sum = (n*(n+1))/2;
            
            if (sum%2 != 0)
	        System.out.println(n-1+"");
	        else
	        System.out.println(n+"");
	        
	        
	        
	        
	        
	    }
		// your code goes here
	}
}

```