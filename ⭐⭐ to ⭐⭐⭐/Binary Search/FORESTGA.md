<div id="problem-statement" class="_problemBody_lulsq_29 print"><h2>Problem</h2>
<h3> Read problems statements in <a target="_blank" href="https://www.codechef.com/download/translated/MAY16/mandarin/FORESTGA.pdf" rel="nofollow noreferrer noopener">Mandarin Chinese</a>, <a target="_blank" href="https://www.codechef.com/download/translated/MAY16/russian/FORESTGA.pdf" rel="nofollow noreferrer noopener">Russian</a> and <a target="_blank" href="https://www.codechef.com/download/translated/MAY16/vietnamese/FORESTGA.pdf" rel="nofollow noreferrer noopener">Vietnamese</a> as well.</h3>
<p>Chef is the head of commercial logging industry that recently bought a farm containing <b>N</b> trees. You are given initial height of the i-th tree by <b>H<sub>i</sub></b> and the rate of growth of height as <b>R<sub>i</sub></b> meters per month. For simplicity, you can assume that all the trees are perfect cylinders of equal radius. This allows us to consider only the height of trees when we talk about the amount of wood. 
</p>
<p>
In Chef's country, laws don't allow one to cut a tree partially, so one has to cut the tree completely for gathering wood. Also, laws prohibit cutting trees of heights (strictly) lower than <b>L</b> meters. 
</p>
<p>
Today Chef received an order of <b>W</b> meters (of height) of wood. Chef wants to deliver this order as soon as possible. Find out how minimum number of months he should wait after which he will able to fulfill the order. You can assume that Chef's company's sawing machines are very efficient and take negligible amount of time to cut the trees.
</p>
<h3>Input</h3>
<p>There is a single test case per test file.</p>
<p>The first line of the input contains three space separated integers <b>N</b>, <b>W</b> and <b>L</b> denoting the number of trees in the farm, the amount of wood (in meters) that have to be gathered and the minimum allowed height of the tree to cut.</p>
<p>Each of next <b>N</b> lines contain two space separated integers denoting <b>H<sub>i</sub></b> and <b>R<sub>i</sub></b> respectively.</p>
<h3>Output</h3>
<p>Output a single integer denoting the number of months that have to pass before Chef will be able to fulfill the order.</p>
<h3>Constraints</h3>
<ul>
<li><b>1</b> ≤ <b>N</b> ≤ <b>10<sup>5</sup></b></li>
<li><b>1</b> ≤ <b>W</b>, <b>L</b> ≤ <b>10<sup>18</sup></b></li>
<li><b>1</b> ≤ <b>H<sub>i</sub></b>, <b>R<sub>i</sub></b> ≤ <b>10<sup>9</sup></b></li>
</ul>
<h3>Subtasks</h3>
<ul>
<li><b>Subtask #1 [40 points]:</b> <b>1 ≤ </b> <b>N</b>, <b>W</b>, <b>L</b> ≤ <b>10<sup>4</sup></b></li>
<li><b>Subtask #2 [60 points]:</b> No additional constraints</li>
</ul>
<h3>Sample 1:</h3>
<div data-reactroot="" class="_input_output__table_lulsq_184"><div class="_text_copy__container_lulsq_188"><div class="_text_copy_lulsq_188 _input_top__box_lulsq_198" style="border-right: 1px solid rgb(210, 217, 231);"><span>Input</span><div title="Copy to clipboard" class="" style="pointer-events: all;"><span class="_icon__box_9xn05_2 undefined"><i class="_copy__icon_9xn05_14"></i></span></div></div><div class="_text_copy_lulsq_188 _ouput_top__box_lulsq_201"><span>Output</span><div title="Copy to clipboard" class="" style="pointer-events: all;"><span class="_icon__box_9xn05_2 undefined"><i class="_copy__icon_9xn05_14"></i></span></div></div></div><div class="_values__container_lulsq_204"><div class="_values_lulsq_204" style="border-right: 1px solid rgb(210, 217, 231);"><pre>3 74 51
2 2
5 7
2 9</pre></div><div class="_values_lulsq_204"><pre>7</pre></div></div></div>
<h3>Explanation:</h3>
<p>After <b>6</b> months, heights of each tree will be <b>14</b>, <b>47</b> and <b>56</b> respectively. Chef is allowed to cut only the third tree, sadly it is not enough to fulfill an order of 74 meters of wood.</p>
<p>After <b>7</b> months, heights of each tree will be <b>16</b>, <b>54</b> and <b>65</b> respectively. Now Chef is allowed to cut second and third trees. Cutting both of them would provide him <b>119</b> meters of wood, which is enough to fulfill the order. </p></div>

# SOLUTION:

***PYTHON***
```
```

***JAVA***
```
```


