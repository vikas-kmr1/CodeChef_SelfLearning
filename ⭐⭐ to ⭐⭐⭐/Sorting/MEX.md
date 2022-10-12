<div id="problem-statement" class="_problemBody_lulsq_29 print"><h2>Problem</h2>
<h3>Read problems statements in <a target="_blank" href="https://www.codechef.com/download/translated/OCT17/mandarin/MEX.pdf" rel="nofollow noreferrer noopener">mandarin chinese</a>, <a target="_blank" href="https://www.codechef.com/download/translated/OCT17/russian/MEX.pdf" rel="nofollow noreferrer noopener">russian</a> and <a target="_blank" href="https://www.codechef.com/download/translated/OCT17/vietnamese/MEX.pdf" rel="nofollow noreferrer noopener">vietnamese</a> as well.</h3>
<p>You are given a multi-set <b>S</b> of <b>N</b> integers, and an integer <b>K</b>. You want to find the maximum value of minimal excluded non-negative integer (<a href="https://en.wikipedia.org/wiki/Mex_(mathematics)" rel="nofollow"><b>MEX</b></a>) of the multi-set given that you are allowed to add at most any <b>K</b> integers to the multi-set. Find the maximum value of MEX that you can obtain. </p>
<p>Few examples of finding MEX of a multi-set are as follows. MEX of multi-set {0} is 1, {1} is 0, {0, 1, 3} is 2, {0, 1, 2, 3, 5, 6} is 4.</p>
<h3>Input</h3>
<p>The first line of the input contains an integer <b>T</b> denoting the number of testcases.</p>
<p>The first line of each test case contains two space seperated integers <b>N</b> and <b>K</b> denoting the size of the multi-set and the maximum number of extra integers that you can add in the multi-set respectively.</p>
<p>The second line contains <b>N</b> space separated integers denoting the multi-set <b>S</b>: <b>S<sub>1</sub></b>, <b>S<sub>2</sub></b> ,.... <b>S<sub>N</sub></b>.
</p><h3>Output</h3>
<p>For each testcase, output the answer in a single line. </p>
<h3>Constraints</h3>
<ul>
<li><b>1</b> ≤ <b>T</b> ≤ <b>10</b></li>
<li><b>1</b> ≤ <b>N</b> ≤ <b>10<sup>5</sup></b></li>
<li><b>0</b> ≤ <b>K</b> ≤ <b>10<sup>5</sup></b></li>
<li><b>0</b> ≤ <b>S<sub>i</sub></b> ≤ <b>2 * 10<sup>5</sup></b></li>
</ul>
<h3>Subtasks</h3>
<ul>
<li><b>Subtask #1</b> (15 points): <b>K</b>=0.</li>
<li><b>Subtask #2</b> (85 points): Original Constraints.</li>
</ul>
<h3>Sample 1:</h3>
<div data-reactroot="" class="_input_output__table_lulsq_184"><div class="_text_copy__container_lulsq_188"><div class="_text_copy_lulsq_188 _input_top__box_lulsq_198" style="border-right: 1px solid rgb(210, 217, 231);"><span>Input</span><div title="Copy to clipboard" class="" style="pointer-events: all;"><span class="_icon__box_9xn05_2 undefined"><i class="_copy__icon_9xn05_14"></i></span></div></div><div class="_text_copy_lulsq_188 _ouput_top__box_lulsq_201"><span>Output</span><div title="Copy to clipboard" class="" style="pointer-events: all;"><span class="_icon__box_9xn05_2 undefined"><i class="_copy__icon_9xn05_14"></i></span></div></div></div><div class="_values__container_lulsq_204"><div class="_values_lulsq_204" style="border-right: 1px solid rgb(210, 217, 231);"><pre>4
3 0
1 0 2
3 1
1 0 2
4 3
2 5 4 9
2 0
3 4</pre></div><div class="_values_lulsq_204"><pre>3
4
6
0</pre></div></div></div>
<h3>Explanation:</h3>
<p><b>Example case 1.</b> As <b>K</b> = 0, so we can't add any element to the multi-set. Elements of the set are {1, 0, 2}. The MEX value of this set is 3.</p>
<p><b>Example case 2.</b> As <b>K</b> = 1, you are allowed to add at most 1 element to the multi-set. The multi-set are {1, 0, 2}. You can add element 3 to the multi-set, and it becomes {1, 0, 2, 3}. The MEX value of this multi-set is 4. There is no other way to have higher value of MEX of the set by adding at most one element to the multi-set.</p></div>