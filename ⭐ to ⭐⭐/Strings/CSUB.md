<div id="problem-statement" class="_problemBody_lulsq_29 print"><h2>Problem</h2>
<h3> Read problems statements in <a rel="nofollow noreferrer noopener" href="https://www.codechef.com/download/translated/JULY14/mandarin/CSUB.pdf">Mandarin Chinese </a> and <a rel="nofollow noreferrer noopener" href="https://www.codechef.com/download/translated/JULY14/russian/CSUB.pdf">Russian</a>.</h3>
<p>Given a string <b>S</b> consisting of only <b>1s</b> and <b>0s</b>, find the number of substrings which start and end both in <b>1</b>.<br>
In this problem, a substring is defined as a sequence of continuous characters <b>S<sub>i</sub>, S<sub>i+1</sub>, ..., S<sub>j</sub></b> where <b>1 ≤ i ≤ j ≤ N</b>.
</p>
<h3>Input</h3>
<p>First line contains <b>T</b>, the number of testcases. Each testcase consists of <b>N</b>(the length of string) in one line and string in second line.</p>
<h3>Output</h3>
<p>For each testcase, print the required answer in one line.</p>
<h3>Constraints</h3>
<ul><li><b>1</b> ≤ <b>T</b> ≤ <b>10<sup>5</sup></b></li>
<li><b>1</b> ≤ <b>N</b> ≤ <b>10<sup>5</sup></b></li>
<li>Sum of  <b>N </b> over all testcases ≤ <b>10<sup>5</sup></b></li>
</ul>
<h3>Sample 1:</h3>
<div data-reactroot="" class="_input_output__table_lulsq_184"><div class="_text_copy__container_lulsq_188"><div class="_text_copy_lulsq_188 _input_top__box_lulsq_198" style="border-right: 1px solid rgb(210, 217, 231);"><span>Input</span><div title="Copy to clipboard" class="" style="pointer-events: all;"><span class="_icon__box_9xn05_2"><i class="_copy__icon_9xn05_14"></i></span></div></div><div class="_text_copy_lulsq_188 _ouput_top__box_lulsq_201"><span>Output</span><div title="Copy to clipboard" class="" style="pointer-events: all;"><span class="_icon__box_9xn05_2"><i class="_copy__icon_9xn05_14"></i></span></div></div></div><div class="_values__container_lulsq_204"><div class="_values_lulsq_204" style="border-right: 1px solid rgb(210, 217, 231);"><pre>2
4
1111
5
10001</pre></div><div class="_values_lulsq_204"><pre>10
3</pre></div></div></div>
<h3>Explanation:</h3>
<p><strong>Test case <span class="math math-inline"><span class="katex"><span class="katex-mathml"><math xmlns="http://www.w3.org/1998/Math/MathML"><semantics><mrow><mn>1</mn></mrow><annotation encoding="application/x-tex">1</annotation></semantics></math></span><span class="katex-html" aria-hidden="true"><span class="base"><span class="strut" style="height: 0.6444em;"></span><span class="mord">1</span></span></span></span></span>:</strong> All substrings of this string start and end with <code>1</code>. The substrings are <span class="math math-inline"><span class="katex"><span class="katex-mathml"><math xmlns="http://www.w3.org/1998/Math/MathML"><semantics><mrow><mo stretchy="false">{</mo><mn>1</mn><mo separator="true">,</mo><mn>1</mn><mo separator="true">,</mo><mn>1</mn><mo separator="true">,</mo><mn>1</mn><mo separator="true">,</mo><mn>11</mn><mo separator="true">,</mo><mn>11</mn><mo separator="true">,</mo><mn>11</mn><mo separator="true">,</mo><mn>111</mn><mo separator="true">,</mo><mn>111</mn><mo separator="true">,</mo><mn>1111</mn><mo stretchy="false">}</mo></mrow><annotation encoding="application/x-tex">\{ 1, 1, 1, 1, 11, 11, 11, 111, 111, 1111 \}</annotation></semantics></math></span><span class="katex-html" aria-hidden="true"><span class="base"><span class="strut" style="height: 1em; vertical-align: -0.25em;"></span><span class="mopen">{</span><span class="mord">1</span><span class="mpunct">,</span><span class="mspace" style="margin-right: 0.1667em;"></span><span class="mord">1</span><span class="mpunct">,</span><span class="mspace" style="margin-right: 0.1667em;"></span><span class="mord">1</span><span class="mpunct">,</span><span class="mspace" style="margin-right: 0.1667em;"></span><span class="mord">1</span><span class="mpunct">,</span><span class="mspace" style="margin-right: 0.1667em;"></span><span class="mord">11</span><span class="mpunct">,</span><span class="mspace" style="margin-right: 0.1667em;"></span><span class="mord">11</span><span class="mpunct">,</span><span class="mspace" style="margin-right: 0.1667em;"></span><span class="mord">11</span><span class="mpunct">,</span><span class="mspace" style="margin-right: 0.1667em;"></span><span class="mord">111</span><span class="mpunct">,</span><span class="mspace" style="margin-right: 0.1667em;"></span><span class="mord">111</span><span class="mpunct">,</span><span class="mspace" style="margin-right: 0.1667em;"></span><span class="mord">1111</span><span class="mclose">}</span></span></span></span></span>. The total count of these substrings is <span class="math math-inline"><span class="katex"><span class="katex-mathml"><math xmlns="http://www.w3.org/1998/Math/MathML"><semantics><mrow><mn>10</mn></mrow><annotation encoding="application/x-tex">10</annotation></semantics></math></span><span class="katex-html" aria-hidden="true"><span class="base"><span class="strut" style="height: 0.6444em;"></span><span class="mord">10</span></span></span></span></span>.</p>
<p><strong>Test case <span class="math math-inline"><span class="katex"><span class="katex-mathml"><math xmlns="http://www.w3.org/1998/Math/MathML"><semantics><mrow><mn>2</mn></mrow><annotation encoding="application/x-tex">2</annotation></semantics></math></span><span class="katex-html" aria-hidden="true"><span class="base"><span class="strut" style="height: 0.6444em;"></span><span class="mord">2</span></span></span></span></span>:</strong> Three substrings of this string start and end with <code>1</code>. These are <span class="math math-inline"><span class="katex"><span class="katex-mathml"><math xmlns="http://www.w3.org/1998/Math/MathML"><semantics><mrow><mo stretchy="false">{</mo><mn>1</mn><mo separator="true">,</mo><mn>1</mn><mo separator="true">,</mo><mn>10001</mn><mo stretchy="false">}</mo></mrow><annotation encoding="application/x-tex">\{1, 1, 10001\}</annotation></semantics></math></span><span class="katex-html" aria-hidden="true"><span class="base"><span class="strut" style="height: 1em; vertical-align: -0.25em;"></span><span class="mopen">{</span><span class="mord">1</span><span class="mpunct">,</span><span class="mspace" style="margin-right: 0.1667em;"></span><span class="mord">1</span><span class="mpunct">,</span><span class="mspace" style="margin-right: 0.1667em;"></span><span class="mord">10001</span><span class="mclose">}</span></span></span></span></span>.</p></div>


## Solution:
***python3***
```
# cook your dish here
for i in range(int(input())):
    n =  int(input())
    
    c = input().count("1")
    
    print((c*(c+1))//2)
    
    
```

***java***
```

```