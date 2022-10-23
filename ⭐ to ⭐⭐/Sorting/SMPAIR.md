<div id="problem-statement" class="_problemBody_lulsq_29 print"><h2>Problem</h2>
<h3> Read problems statements in <a target="_blank" href="https://www.codechef.com/download/translated/LTIME13/mandarin/SMPAIR.pdf" rel="nofollow noreferrer noopener">Mandarin Chinese </a> and <a target="_blank" href="https://www.codechef.com/download/translated/LTIME13/russian/SMPAIR.pdf" rel="nofollow noreferrer noopener">Russian</a>.</h3>
<p>You are given a sequence <b>a<sub>1</sub>, a<sub>2</sub>, ..., a<sub>N</sub></b>. Find the smallest possible value of <b>a<sub>i</sub> + a<sub>j</sub></b>, where 1 ≤ <b>i</b> &lt; <b>j</b> ≤ <b>N</b>.</p>
<h3>Input</h3>
<p>The first line of the input contains an integer <b>T</b> denoting the number of test cases. The description of <b>T</b> test cases follows.&nbsp;</p>
<p>The first line of each description consists of a single integer <b>N</b>.</p>
<p>The second line of each description contains <b>N</b> space separated integers - <b>a<sub>1</sub>, a<sub>2</sub>, ..., a<sub>N</sub></b> respectively.
</p><h3>Output</h3>
<p>For each test case, output a single line containing a single integer - the smallest possible sum for the corresponding test case.</p>
<h3>Constraints</h3>
<p>
</p><ul><li><b>T</b> = <b>10<sup>5</sup></b>, <b>N</b> = <b>2</b> : 13 points.</li>
<li><b>T</b> = <b>10<sup>5</sup></b>, <b>2</b> ≤ <b>N</b> ≤ <b>10</b> : 16 points.</li>
<li><b>T</b> = <b>1000</b>, <b>2</b> ≤ <b>N</b> ≤ <b>100</b> : 31 points.</li>
<li><b>T</b> = <b>10</b>, <b>2</b> ≤ <b>N</b> ≤ <b>10<sup>5</sup></b> : 40 points.</li>
<li><b>1</b> ≤ <b>a<sub>i</sub></b> ≤ <b>10<sup>6</sup></b></li>
</ul>
<h3>Sample 1:</h3>
<div data-reactroot="" class="_input_output__table_lulsq_184"><div class="_text_copy__container_lulsq_188"><div class="_text_copy_lulsq_188 _input_top__box_lulsq_198" style="border-right: 1px solid rgb(210, 217, 231);"><span>Input</span><div title="Copy to clipboard" class="" style="pointer-events: all;"><span class="_icon__box_9xn05_2 undefined"><i class="_copy__icon_9xn05_14"></i></span></div></div><div class="_text_copy_lulsq_188 _ouput_top__box_lulsq_201"><span>Output</span><div title="Copy to clipboard" class="" style="pointer-events: all;"><span class="_icon__box_9xn05_2 undefined"><i class="_copy__icon_9xn05_14"></i></span></div></div></div><div class="_values__container_lulsq_204"><div class="_values_lulsq_204" style="border-right: 1px solid rgb(210, 217, 231);"><pre>1
4
5 1 3 4</pre></div><div class="_values_lulsq_204"><pre>4</pre></div></div></div>
<h3>Explanation:</h3>
<p>Here we pick <b>a<sub>2</sub></b> and <b>a<sub>3</sub></b>. Their sum equals to 1 + 3 = 4.</p></div>

## Solution:
***java***
```
# cook your dish here

import java.util.Scanner;
public class Main {
    public static void main(String[] args){
         Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();  

        while(t-->0){          
        int n=sc.nextInt();
		    int ni[]=new int[n];
		    for(int i=0;i<n;i++)
		    {
		        ni[i]=sc.nextInt();
		    }
		    Arrays.sort(ni);
		    int res=ni[0]+ni[1];
		   System.out.println(res);
        }
    }
}   
```