<div id="problem-statement" class="_problemBody_lulsq_29 print"><h2>Problem</h2>
<h3>Read problems statements in <a target="_blank" href="https://www.codechef.com/download/translated/MARCH18/mandarin/MIXCOLOR.pdf" rel="nofollow noreferrer noopener">Mandarin chinese</a>, <a target="_blank" href="https://www.codechef.com/download/translated/MARCH18/russian/MIXCOLOR.pdf" rel="nofollow noreferrer noopener">Russian</a> and <a target="_blank" href="https://www.codechef.com/download/translated/MARCH18/vietnamese/MIXCOLOR.pdf" rel="nofollow noreferrer noopener">Vietnamese</a> as well.</h3>
<p>Chef likes to mix colors a lot. Recently, she was gifted <b>N</b> colors <b>A<sub>1</sub>, A<sub>2</sub>, ..., A<sub>N</sub></b> by her friend.</p>
<p>Chef wants to make the values of all her colors pairwise distinct, as they will then look stunningly <i>beautiful</i>. In order to achieve that, she can perform the following mixing operation zero or more times:
</p><ul>
<li>Choose any two colors. Let's denote their values by <b>x</b> and <b>y</b>.</li>
<li>Mix the color with value <b>x</b> into the color with value <b>y</b>. After the mixing, the value of the first color remains <b>x</b>, but the value of the second color changes to <b>x + y</b>.</li>
</ul>
<p>Find the minimum number of mixing operations Chef needs to perform to make her colors beautiful.</p>
<h3>Input</h3>
<ul>
<li>The first line of the input contains a single integer <b>T</b> denoting the number of test cases. The description of <b>T</b> test cases follows.</li>
<li>The first line of each test case contains a single integer <b>N</b> denoting the number of colors.</li>
<li>The second line contains <b>N</b> space-separated integers <b>A<sub>1</sub>, A<sub>2</sub>, ..., A<sub>N</sub></b> denoting Chef's initial colors.</li>
</ul>
<h3>Output</h3>
<p>For each test case, print a single line containing one integer — the minimum number of required mixing operations.</p>
<h3>Constraints</h3>
<ul>
<li>1 ≤ <b>T</b> ≤ 10</li>
<li>1 ≤ <b>N</b> ≤ 10<sup>5</sup></li>
<li>1 ≤ <b>A<sub>i</sub></b> ≤ 10<sup>9</sup> for each valid <b>i</b></li>
</ul>
<h3>Subtasks</h3>
<p><b>Subtask #1 (30 points):</b> 1 ≤ <b>N</b> ≤ 100</p>
<p><b>Subtask #2 (70 points):</b> original constraints</p>
<h3>Sample 1:</h3>
<div data-reactroot="" class="_input_output__table_lulsq_184"><div class="_text_copy__container_lulsq_188"><div class="_text_copy_lulsq_188 _input_top__box_lulsq_198" style="border-right: 1px solid rgb(210, 217, 231);"><span>Input</span><div title="Copy to clipboard" class="" style="pointer-events: all;"><span class="_icon__box_9xn05_2 undefined"><i class="_copy__icon_9xn05_14"></i></span></div></div><div class="_text_copy_lulsq_188 _ouput_top__box_lulsq_201"><span>Output</span><div title="Copy to clipboard" class="" style="pointer-events: all;"><span class="_icon__box_9xn05_2 undefined"><i class="_copy__icon_9xn05_14"></i></span></div></div></div><div class="_values__container_lulsq_204"><div class="_values_lulsq_204" style="border-right: 1px solid rgb(210, 217, 231);"><pre>2
3
1 2 3
3
2 1 2</pre></div><div class="_values_lulsq_204"><pre>0
1</pre></div></div></div>
<h3>Explanation:</h3>
<p><b>Example case 1:</b> No two colors have the same value. Hence, they are already beautiful. No mixing is required.</p>
<p><b>Example case 2:</b> Take the second color (with value <b>x</b> = 1) and mix it into the first color (with value <b>x</b> = 2). After the mixing, the colors will be 3 1 2. Now the colors are beautiful. This is the minimum number of mixing operations that are required. Hence, the answer is 1.</p></div>