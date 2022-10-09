<div id="problem-statement" class="_problemBody_lulsq_29 print"><h2>Problem</h2>
<p>
Write a program to find the remainder when an integer <b>A</b> is divided by an integer <b>B</b>.
</p>
<h3>Input</h3>
<p> 
</p><p>The first line contains an integer <b>T</b>, the total number of test cases. Then <b>T</b> lines follow, each line contains two Integers <b>A</b> and <b>B</b>.</p>
<p></p>
<h3>Output</h3>
<p>For each test case, find the remainder when <b>A</b> is divided by  <b>B</b>, and display it in a new line.</p>
<h3>Constraints</h3>
<ul><li>1 <b>≤</b> <b>T</b> <b>≤</b> 1000</li>
<li>1 <b>≤</b> <b>A,B</b> <b>≤</b> 10000</li>
</ul>
<h3>Sample 1:</h3>
<div data-reactroot="" class="_input_output__table_lulsq_184"><div class="_text_copy__container_lulsq_188"><div class="_text_copy_lulsq_188 _input_top__box_lulsq_198" style="border-right: 1px solid rgb(210, 217, 231);"><span>Input</span><div title="Copy to clipboard" class="" style="pointer-events: all;"><span class="_icon__box_9xn05_2 undefined"><i class="_copy__icon_9xn05_14"></i></span></div></div><div class="_text_copy_lulsq_188 _ouput_top__box_lulsq_201"><span>Output</span><div title="Copy to clipboard" class="" style="pointer-events: all;"><span class="_icon__box_9xn05_2 undefined"><i class="_copy__icon_9xn05_14"></i></span></div></div></div><div class="_values__container_lulsq_204"><div class="_values_lulsq_204" style="border-right: 1px solid rgb(210, 217, 231);"><pre>3 
1 2
100 200
40 15</pre></div><div class="_values_lulsq_204"><pre>1
100
10</pre></div></div></div></div>

# Solution: 
## Python:
``` 
``` 
## Java: 
```
import java.util.*;
class Remainder
{
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while(t-->0)
        {
            int a = s.nextInt();
            int b = s.nextInt();
            System.out.println(a%b);
        }
    }
}
```

