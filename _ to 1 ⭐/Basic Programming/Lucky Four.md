<div id="problem-statement" class="_problemBody_lulsq_29 print"><h2>Problem</h2>

<p>Kostya likes the number <b>4</b> much. Of course! This number has such a lot of properties, like:
</p><ul>
<li>Four is the smallest composite number;</li>
<li>It is also the smallest Smith number;</li>
<li>The smallest non-cyclic group has four elements;</li>
<li>Four is the maximal degree of the equation that can be solved in radicals;</li>
<li>There is four-color theorem that states that any map can be colored in no more than four colors in such a way that no two adjacent regions are colored in the same color;</li>
<li>Lagrange's four-square theorem states that every positive integer can be written as the sum of at most four square numbers;</li>
<li>Four is the maximum number of dimensions of a real division algebra;</li>
<li>In bases 6 and 12, 4 is a 1-automorphic number;</li>
<li>And there are a lot more cool stuff about this number!</li>
</ul>
<p>Impressed by the power of this number, Kostya has begun to look for occurrences of four anywhere. He has a list of <b>T</b> integers, for each of them he wants to calculate the number of occurrences of the digit <b>4</b> in the decimal representation. He is too busy now, so please help him.</p>
<h3>Input</h3>
<p>The first line of input consists of a single integer <b>T</b>, denoting the number of integers in Kostya's list.</p>
<p>Then, there are <b>T</b> lines, each of them contain a single integer from the list.</p>
<h3>Output</h3>
<p>Output <b>T</b> lines. Each of these lines should contain the number of occurences of the digit <b>4</b> in the respective integer from Kostya's list.</p>
<h3>Constraints</h3>
<ul>
<li><b>1</b> ≤ <b>T</b> ≤ <b>10<sup>5</sup></b></li>
<li>(Subtask 1): <b>0</b> ≤ Numbers from the list  ≤ <b>9</b> - 33 points.</li>
<li>(Subtask 2): <b>0</b> ≤ Numbers from the list  ≤ <b>10<sup>9</sup></b> - 67 points.</li>
</ul>
<h3>Sample 1:</h3>
<div data-reactroot="" class="_input_output__table_lulsq_184"><div class="_text_copy__container_lulsq_188"><div class="_text_copy_lulsq_188 _input_top__box_lulsq_198" style="border-right: 1px solid rgb(210, 217, 231);"><span>Input</span><div title="Copy to clipboard" class="" style="pointer-events: all;"><span class="_icon__box_9xn05_2 undefined"><i class="_copy__icon_9xn05_14"></i></span></div></div><div class="_text_copy_lulsq_188 _ouput_top__box_lulsq_201"><span>Output</span><div title="Copy to clipboard" class="" style="pointer-events: all;"><span class="_icon__box_9xn05_2 undefined"><i class="_copy__icon_9xn05_14"></i></span></div></div></div><div class="_values__container_lulsq_204"><div class="_values_lulsq_204" style="border-right: 1px solid rgb(210, 217, 231);"><pre>5
447474
228
6664
40
81</pre></div><div class="_values_lulsq_204"><pre>4
0
1
1
0</pre></div></div></div></div>
# Solution:

## Python:
```
```

## Java:
```
import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	try {
	    InputStreamReader r=new InputStreamReader(System.in);    
        BufferedReader br=new BufferedReader(r);    
	    String t = br.readLine();
	    
	    for(int i=0; i<Integer.parseInt(t); i++){
	       String n = br.readLine();
	        int counter = 0;
	        
	        for(int j=0; j<n.length(); j++){
	            if(n.charAt(j) == '4'){
	                counter++;
	            }
	        }
	        System.out.println(counter);
	    }
	    
	} catch(Exception e) {
	    return;
	}
	}
}

```
