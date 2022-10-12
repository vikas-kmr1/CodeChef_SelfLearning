<div id="problem-statement" class="_problemBody_lulsq_29 print"><h2>Problem</h2>
<p><i></i></p><p>[<b>Chopsticks</b> (singular: <b>chopstick</b>) are short, frequently tapered sticks used in pairs of equal length, which are used as the traditional eating utensils of China, Japan, Korea and Vietnam. Originated in ancient China, they can also be found in some areas of Tibet and Nepal that are close to Han Chinese populations, as well as areas of Thailand, Laos and Burma which have significant Chinese populations. Chopsticks are most commonly made of wood, bamboo or plastic, but in China, most are made out of bamboo. Chopsticks are held in the dominant hand, between the thumb and fingers, and used to pick up pieces of food.]</p><p></p>
<p align="right"> Retrieved from <a href="http://en.wikipedia.org/wiki/Chopsticks" rel="nofollow">wikipedia</a></p>
<p>Actually, the two sticks in a pair of chopsticks need not be of the same length. A pair of sticks can be used to eat as long as the difference in their length is at most <b>D</b>. The Chef has <b>N</b> sticks in which the i<sup>th</sup> stick is <b>L[i]</b> units long. A stick can't be part of more than one pair of chopsticks. Help the Chef in pairing up the sticks to form the maximum number of usable pairs of chopsticks.</p>
<h3>Input</h3>
<p>The first line contains two space-separated integers <b>N</b> and <b>D</b>. The next <b>N</b> lines contain one integer each, the i<sup>th</sup> line giving the value of <b>L[i]</b>.</p>
<h3>Output</h3>
<p>Output a single line containing the maximum number of pairs of chopsticks the Chef can form.</p>
<h3>Constraints</h3>
<ul><li><b>1</b> ≤ <b>N</b> ≤ <b>100,000 (10<sup> 5 </sup>) </b></li>
<li><b>0</b> ≤ <b>D</b> ≤ <b>1,000,000,000 (10<sup> 9 </sup>) </b></li>
<li><b>1</b> ≤ <b>L[i]</b> ≤ <b>1,000,000,000 (10<sup> 9 </sup>)</b> for all integers <b>i</b> from <b>1</b> to <b>N</b></li>
</ul>
<h3>Sample 1:</h3>
<div data-reactroot="" class="_input_output__table_lulsq_184"><div class="_text_copy__container_lulsq_188"><div class="_text_copy_lulsq_188 _input_top__box_lulsq_198" style="border-right: 1px solid rgb(210, 217, 231);"><span>Input</span><div title="Copy to clipboard" class="" style="pointer-events: all;"><span class="_icon__box_9xn05_2 undefined"><i class="_copy__icon_9xn05_14"></i></span></div></div><div class="_text_copy_lulsq_188 _ouput_top__box_lulsq_201"><span>Output</span><div title="Copy to clipboard" class="" style="pointer-events: all;"><span class="_icon__box_9xn05_2 undefined"><i class="_copy__icon_9xn05_14"></i></span></div></div></div><div class="_values__container_lulsq_204"><div class="_values_lulsq_204" style="border-right: 1px solid rgb(210, 217, 231);"><pre>5 2
1
3
3
9
4</pre></div><div class="_values_lulsq_204"><pre>2</pre></div></div></div>
<h3>Explanation:</h3>
<p>
The 5 sticks have lengths 1, 3, 3, 9 and 4 respectively. The maximum allowed difference in the lengths of two sticks forming a pair is at most 2.
It is clear that the 4th stick (length 9) cannot be used with any other stick.
The remaining 4 sticks can can be paired as (1st and 3rd) and (2nd and 5th) to form 2 pairs of usable chopsticks.
</p></div>