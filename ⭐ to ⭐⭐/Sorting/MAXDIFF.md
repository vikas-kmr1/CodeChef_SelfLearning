<div id="problem-statement" class="_problemBody_lulsq_29 print"><h2>Problem</h2>
<p>Chef has gone shopping with his 5-year old son. They have bought <b>N</b> items so far. The items are numbered from <b>1</b> to <b>N</b>, and the item <b>i</b> weighs <b>W<sub>i</sub></b> grams.
</p><p>Chef's son insists on helping his father in carrying the items. He wants his dad to give him a few items. Chef does not want to burden his son. But he won't stop bothering him unless he is given a few items to carry. So Chef decides to give him some items. Obviously, Chef wants to give the kid less weight to carry.
</p><p>However, his son is a smart kid. To avoid being given the bare minimum weight to carry, he suggests that the items are split into two groups, and one group contains exactly <b>K</b> items. Then Chef will carry the heavier group, and his son will carry the other group.
</p><p>Help the Chef in deciding which items should the son take. Your task will be simple. Tell the Chef the maximum possible difference between the weight carried by him and the weight carried by the kid.
</p><h3>Input:</h3>
<p>The first line of input contains an integer <b>T</b>, denoting the number of test cases. Then <b>T</b> test cases follow. The first line of each test contains two space-separated integers <b>N</b> and <b>K</b>. The next line contains <b>N</b> space-separated integers <b>W<sub>1</sub></b>, <b>W<sub>2</sub></b>, ..., <b>W<sub>N</sub></b>.
</p><h3>Output:</h3>
<p>For each test case, output the maximum possible difference between the weights carried by both in grams.
</p><h3>Constraints:</h3>
<ul><li><b>1 ≤ T ≤ 100</b></li>
<li><b>1 ≤ K &lt; N ≤ 100</b></li>
<li><b>1 ≤ W<sub>i</sub> ≤ 100000 (10<sup>5</sup>)</b></li>
</ul>
<h3>Sample 1:</h3>
<div data-reactroot="" class="_input_output__table_lulsq_184"><div class="_text_copy__container_lulsq_188"><div class="_text_copy_lulsq_188 _input_top__box_lulsq_198" style="border-right: 1px solid rgb(210, 217, 231);"><span>Input</span><div title="Copy to clipboard" class="" style="pointer-events: all;"><span class="_icon__box_9xn05_2"><i class="_copy__icon_9xn05_14"></i></span></div></div><div class="_text_copy_lulsq_188 _ouput_top__box_lulsq_201"><span>Output</span><div title="Copy to clipboard" class="" style="pointer-events: all;"><span class="_icon__box_9xn05_2"><i class="_copy__icon_9xn05_14"></i></span></div></div></div><div class="_values__container_lulsq_204"><div class="_values_lulsq_204" style="border-right: 1px solid rgb(210, 217, 231);"><pre>2
5 2
8 4 5 2 10
8 3
1 1 1 1 1 1 1 1</pre></div><div class="_values_lulsq_204"><pre>17
2</pre></div></div></div>
<h3>Explanation:</h3>
<p><b>Case #1:</b> The optimal way is that Chef gives his son <b>K=2</b> items with weights <b>2</b> and <b>4</b>. Chef carries the rest of the items himself. Thus the difference is: <b>(8+5+10) ? (4+2) = 23 ? 6 = 17</b>.
</p><p><b>Case #2:</b> Chef gives his son <b>3</b> items and he carries <b>5</b> items himself.
</p></div>

## Solution:
***python3***
```
# cook your dish here
for i in range(int(input())):
    n,k = map(int, input().split())
    arr = list(map(int, input().split()))
    arr.sort()
    s = sum(arr)
    s1 = sum(arr[:k])
    s2 = sum(arr[-k:])
    print(max( abs(s1-(s-s1)) , abs(s2-(s-s2)) ))
    
```
***java***
```

```