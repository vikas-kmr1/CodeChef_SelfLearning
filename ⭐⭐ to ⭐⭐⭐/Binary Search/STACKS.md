<div id="problem-statement" class="_problemBody_lulsq_29 print"><h2>Problem</h2>
<h3> Read problems statements in <a target="_blank" href="https://www.codechef.com/download/translated/COOK62/mandarin/STACKS.pdf" rel="nofollow noreferrer noopener">Mandarin Chinese</a> and <a target="_blank" href="https://www.codechef.com/download/translated/COOK62/russian/STACKS.pdf" rel="nofollow noreferrer noopener">Russian</a> as well.</h3>
<p>
As every other little boy, Mike has a favorite toy to play with. Mike's favorite toy is a set of <b>N</b> disks. The boy likes to compose his disks in stacks, but there's one very important rule: the disks in a single stack must be ordered by their radiuses in a <b>strictly</b> increasing order such that the top-most disk will have the smallest radius. 
</p>
<p>
For example, a stack of disks with radii (5, 2, 1) is valid, while a stack of disks with radii (3, 4, 1) is not.
</p>
<p>
Little Mike has recently come up with the following algorithm after the order of disks are given:
</p>
<p>
</p><ul><li>First, Mike initiates an empty set of disk stacks.
	</li><li>Then, Mike processes the disks in the chosen order using the following pattern:
	<ul><li>If there is at least one stack such that Mike can put the current disk on the top of the stack without making it invalid, then he chooses the stack with the smallest top disk radius <b>strictly</b> greater than the radius of the current disk, and puts the current disk on top of that stack.
		</li><li>Otherwise, Mike makes a new stack containing only the current disk.
	</li></ul></li></ul><p>
For example, let's assume that the order of the disk radii is (3, 4, 5, 1, 1, 2). Here's how the set of the top stack disks will appear during the algorithm's run:
</p>
<p>
</p><ul><li>In the beginning of the algorithm, the set of disk stacks is empty. After processing the first disk, the set of top stack disks is {3}.
	</li><li>We cannot put the second disk on the only stack that we have after processing the first disk, so we make a new stack. After processing the second disk, the set of top stack disks is {3, 4}.
	</li><li>We cannot put the third disk on any of the available stacks, so we make a new stack. After processing the third disk, the set of top stack disks is {3, 4, 5}.
	</li><li>The fourth disk has radius 1, so it can be easily put on any of the available stacks. According to the algorithm, we choose the stack with the top disk radius equal to 3. After processing the fourth disk, the set of top stack disks is {1, 4, 5}.
	</li><li>The fifth disk has radius 1, so there are two stacks we can put it on. According to the algorithm, we choose the stack with the top disk radius equal to 4. After processing the fifth disk, the set of top stack disks is {1, 1, 5}.
	</li><li>The sixth disk has radius 2, so there is only one stack we can put it on. The final set of top stack disks is {1, 1, 2}.
</li></ul><p>
Mike is really excited about his new algorithm, but he has so many disks that it seems impossible to simulate the algorithm manually.
</p>
<p>
You are given an array <b>A</b> of <b>N</b> integers denoting the radii of Mike's disks. The disks are already ordered by Mike. Your task is to find the set of the stack top disk radii after the algorithm is done.
</p>
<h3>Input</h3>
<p>
The first line of the input contains an integer <b>T</b> denoting the number of test cases. The description of <b>T</b> test cases follows.
</p>
<p>
The first line of a test description contains a single integer <b>N</b>.
</p>
<p>
The second line of the description contains <b>N</b> integers denoting <b>A<sub>1</sub>, ... , A<sub>N</sub></b>.
</p>
<h3>Output</h3>
<p>
For each test case, output a single line. The line should start with a positive integer <b>S</b> denoting the number of stacks after the algorithm is done. This should be followed by <b>S</b> integers on the same line denoting the stacks' top disk radii in <b>non-decreasing order</b>.
</p>
<p>
If there are multiple correct answers, you are allowed to output any of them.
</p>
<h3>Constraints</h3>
<ul><li>1 ≤ <b>T</b> ≤ 10</li>
    <li>1 ≤ <b>N</b> ≤ 10<sup>5</sup></li>
    <li>1 ≤ <b>A<sub>i</sub></b> ≤ 10<sup>9</sup></li>
</ul>
<h3>Sample 1:</h3>
<div data-reactroot="" class="_input_output__table_lulsq_184"><div class="_text_copy__container_lulsq_188"><div class="_text_copy_lulsq_188 _input_top__box_lulsq_198" style="border-right: 1px solid rgb(210, 217, 231);"><span>Input</span><div title="Copy to clipboard" class="" style="pointer-events: all;"><span class="_icon__box_9xn05_2 undefined"><i class="_copy__icon_9xn05_14"></i></span></div></div><div class="_text_copy_lulsq_188 _ouput_top__box_lulsq_201"><span>Output</span><div title="Copy to clipboard" class="" style="pointer-events: all;"><span class="_icon__box_9xn05_2 undefined"><i class="_copy__icon_9xn05_14"></i></span></div></div></div><div class="_values__container_lulsq_204"><div class="_values_lulsq_204" style="border-right: 1px solid rgb(210, 217, 231);"><pre>3
6
3 4 5 1 1 2
10
3 2 9 5 2 9 4 14 7 10
8
14 5 13 19 17 10 18 12</pre></div><div class="_values_lulsq_204"><pre>3 1 1 2
5 2 2 4 7 10 
4 5 10 12 18</pre></div></div></div>
<h3>Explanation:</h3>
<p><strong>Test case <span class="math math-inline"><span class="katex"><span class="katex-mathml"><math xmlns="http://www.w3.org/1998/Math/MathML"><semantics><mrow><mn>1</mn></mrow><annotation encoding="application/x-tex">1</annotation></semantics></math></span><span class="katex-html" aria-hidden="true"><span class="base"><span class="strut" style="height: 0.6444em;"></span><span class="mord">1</span></span></span></span></span>:</strong> This case is already explained in the problem statement.</p>
<p><strong>Test case <span class="math math-inline"><span class="katex"><span class="katex-mathml"><math xmlns="http://www.w3.org/1998/Math/MathML"><semantics><mrow><mn>2</mn></mrow><annotation encoding="application/x-tex">2</annotation></semantics></math></span><span class="katex-html" aria-hidden="true"><span class="base"><span class="strut" style="height: 0.6444em;"></span><span class="mord">2</span></span></span></span></span>:</strong> After processing the first disk, the set of top stack disks are <span class="math math-inline"><span class="katex"><span class="katex-mathml"><math xmlns="http://www.w3.org/1998/Math/MathML"><semantics><mrow><mo stretchy="false">[</mo><mn>3</mn><mo stretchy="false">]</mo></mrow><annotation encoding="application/x-tex">[3]</annotation></semantics></math></span><span class="katex-html" aria-hidden="true"><span class="base"><span class="strut" style="height: 1em; vertical-align: -0.25em;"></span><span class="mopen">[</span><span class="mord">3</span><span class="mclose">]</span></span></span></span></span>. The second disk can be placed on the first stack. Thus, top stack disks are <span class="math math-inline"><span class="katex"><span class="katex-mathml"><math xmlns="http://www.w3.org/1998/Math/MathML"><semantics><mrow><mo stretchy="false">[</mo><mn>2</mn><mo stretchy="false">]</mo></mrow><annotation encoding="application/x-tex">[2]</annotation></semantics></math></span><span class="katex-html" aria-hidden="true"><span class="base"><span class="strut" style="height: 1em; vertical-align: -0.25em;"></span><span class="mopen">[</span><span class="mord">2</span><span class="mclose">]</span></span></span></span></span>. The next <span class="math math-inline"><span class="katex"><span class="katex-mathml"><math xmlns="http://www.w3.org/1998/Math/MathML"><semantics><mrow><mn>3</mn></mrow><annotation encoding="application/x-tex">3</annotation></semantics></math></span><span class="katex-html" aria-hidden="true"><span class="base"><span class="strut" style="height: 0.6444em;"></span><span class="mord">3</span></span></span></span></span> disks can be stacked together. Thus, the top stack disks are <span class="math math-inline"><span class="katex"><span class="katex-mathml"><math xmlns="http://www.w3.org/1998/Math/MathML"><semantics><mrow><mo stretchy="false">[</mo><mn>2</mn><mo separator="true">,</mo><mn>2</mn><mo stretchy="false">]</mo></mrow><annotation encoding="application/x-tex">[2, 2]</annotation></semantics></math></span><span class="katex-html" aria-hidden="true"><span class="base"><span class="strut" style="height: 1em; vertical-align: -0.25em;"></span><span class="mopen">[</span><span class="mord">2</span><span class="mpunct">,</span><span class="mspace" style="margin-right: 0.1667em;"></span><span class="mord">2</span><span class="mclose">]</span></span></span></span></span>. The next two disks can be stacked together to get <span class="math math-inline"><span class="katex"><span class="katex-mathml"><math xmlns="http://www.w3.org/1998/Math/MathML"><semantics><mrow><mo stretchy="false">[</mo><mn>2</mn><mo separator="true">,</mo><mn>2</mn><mo separator="true">,</mo><mn>4</mn><mo stretchy="false">]</mo></mrow><annotation encoding="application/x-tex">[2, 2, 4]</annotation></semantics></math></span><span class="katex-html" aria-hidden="true"><span class="base"><span class="strut" style="height: 1em; vertical-align: -0.25em;"></span><span class="mopen">[</span><span class="mord">2</span><span class="mpunct">,</span><span class="mspace" style="margin-right: 0.1667em;"></span><span class="mord">2</span><span class="mpunct">,</span><span class="mspace" style="margin-right: 0.1667em;"></span><span class="mord">4</span><span class="mclose">]</span></span></span></span></span>. The next two disks can be stacked together to get <span class="math math-inline"><span class="katex"><span class="katex-mathml"><math xmlns="http://www.w3.org/1998/Math/MathML"><semantics><mrow><mo stretchy="false">[</mo><mn>2</mn><mo separator="true">,</mo><mn>2</mn><mo separator="true">,</mo><mn>4</mn><mo separator="true">,</mo><mn>7</mn><mo stretchy="false">]</mo></mrow><annotation encoding="application/x-tex">[2, 2, 4, 7]</annotation></semantics></math></span><span class="katex-html" aria-hidden="true"><span class="base"><span class="strut" style="height: 1em; vertical-align: -0.25em;"></span><span class="mopen">[</span><span class="mord">2</span><span class="mpunct">,</span><span class="mspace" style="margin-right: 0.1667em;"></span><span class="mord">2</span><span class="mpunct">,</span><span class="mspace" style="margin-right: 0.1667em;"></span><span class="mord">4</span><span class="mpunct">,</span><span class="mspace" style="margin-right: 0.1667em;"></span><span class="mord">7</span><span class="mclose">]</span></span></span></span></span>. The last disk can be put on top of the fifth stack. The final stack top are <span class="math math-inline"><span class="katex"><span class="katex-mathml"><math xmlns="http://www.w3.org/1998/Math/MathML"><semantics><mrow><mo stretchy="false">[</mo><mn>2</mn><mo separator="true">,</mo><mn>2</mn><mo separator="true">,</mo><mn>4</mn><mo separator="true">,</mo><mn>7</mn><mo separator="true">,</mo><mn>10</mn><mo stretchy="false">]</mo></mrow><annotation encoding="application/x-tex">[2, 2, 4, 7, 10]</annotation></semantics></math></span><span class="katex-html" aria-hidden="true"><span class="base"><span class="strut" style="height: 1em; vertical-align: -0.25em;"></span><span class="mopen">[</span><span class="mord">2</span><span class="mpunct">,</span><span class="mspace" style="margin-right: 0.1667em;"></span><span class="mord">2</span><span class="mpunct">,</span><span class="mspace" style="margin-right: 0.1667em;"></span><span class="mord">4</span><span class="mpunct">,</span><span class="mspace" style="margin-right: 0.1667em;"></span><span class="mord">7</span><span class="mpunct">,</span><span class="mspace" style="margin-right: 0.1667em;"></span><span class="mord">10</span><span class="mclose">]</span></span></span></span></span>. Thus, <span class="math math-inline"><span class="katex"><span class="katex-mathml"><math xmlns="http://www.w3.org/1998/Math/MathML"><semantics><mrow><mn>5</mn></mrow><annotation encoding="application/x-tex">5</annotation></semantics></math></span><span class="katex-html" aria-hidden="true"><span class="base"><span class="strut" style="height: 0.6444em;"></span><span class="mord">5</span></span></span></span></span> stacks are needed.</p>
<p><strong>Test case <span class="math math-inline"><span class="katex"><span class="katex-mathml"><math xmlns="http://www.w3.org/1998/Math/MathML"><semantics><mrow><mn>3</mn></mrow><annotation encoding="application/x-tex">3</annotation></semantics></math></span><span class="katex-html" aria-hidden="true"><span class="base"><span class="strut" style="height: 0.6444em;"></span><span class="mord">3</span></span></span></span></span>:</strong> After processing the first disk, the set of top stack disks are <span class="math math-inline"><span class="katex"><span class="katex-mathml"><math xmlns="http://www.w3.org/1998/Math/MathML"><semantics><mrow><mo stretchy="false">[</mo><mn>14</mn><mo stretchy="false">]</mo></mrow><annotation encoding="application/x-tex">[14]</annotation></semantics></math></span><span class="katex-html" aria-hidden="true"><span class="base"><span class="strut" style="height: 1em; vertical-align: -0.25em;"></span><span class="mopen">[</span><span class="mord">14</span><span class="mclose">]</span></span></span></span></span>. The second disk can be placed on the first stack. Thus, top stack disks are <span class="math math-inline"><span class="katex"><span class="katex-mathml"><math xmlns="http://www.w3.org/1998/Math/MathML"><semantics><mrow><mo stretchy="false">[</mo><mn>5</mn><mo stretchy="false">]</mo></mrow><annotation encoding="application/x-tex">[5]</annotation></semantics></math></span><span class="katex-html" aria-hidden="true"><span class="base"><span class="strut" style="height: 1em; vertical-align: -0.25em;"></span><span class="mopen">[</span><span class="mord">5</span><span class="mclose">]</span></span></span></span></span>. The next disk can be placed on second stack to get <span class="math math-inline"><span class="katex"><span class="katex-mathml"><math xmlns="http://www.w3.org/1998/Math/MathML"><semantics><mrow><mo stretchy="false">[</mo><mn>5</mn><mo separator="true">,</mo><mn>13</mn><mo stretchy="false">]</mo></mrow><annotation encoding="application/x-tex">[5, 13]</annotation></semantics></math></span><span class="katex-html" aria-hidden="true"><span class="base"><span class="strut" style="height: 1em; vertical-align: -0.25em;"></span><span class="mopen">[</span><span class="mord">5</span><span class="mpunct">,</span><span class="mspace" style="margin-right: 0.1667em;"></span><span class="mord">13</span><span class="mclose">]</span></span></span></span></span>. The next <span class="math math-inline"><span class="katex"><span class="katex-mathml"><math xmlns="http://www.w3.org/1998/Math/MathML"><semantics><mrow><mn>2</mn></mrow><annotation encoding="application/x-tex">2</annotation></semantics></math></span><span class="katex-html" aria-hidden="true"><span class="base"><span class="strut" style="height: 0.6444em;"></span><span class="mord">2</span></span></span></span></span> disks can be stacked together. Thus, the top stack disks are <span class="math math-inline"><span class="katex"><span class="katex-mathml"><math xmlns="http://www.w3.org/1998/Math/MathML"><semantics><mrow><mo stretchy="false">[</mo><mn>5</mn><mo separator="true">,</mo><mn>13</mn><mo separator="true">,</mo><mn>17</mn><mo stretchy="false">]</mo></mrow><annotation encoding="application/x-tex">[5, 13, 17]</annotation></semantics></math></span><span class="katex-html" aria-hidden="true"><span class="base"><span class="strut" style="height: 1em; vertical-align: -0.25em;"></span><span class="mopen">[</span><span class="mord">5</span><span class="mpunct">,</span><span class="mspace" style="margin-right: 0.1667em;"></span><span class="mord">13</span><span class="mpunct">,</span><span class="mspace" style="margin-right: 0.1667em;"></span><span class="mord">17</span><span class="mclose">]</span></span></span></span></span>. The next disk can be placed on second stack to get <span class="math math-inline"><span class="katex"><span class="katex-mathml"><math xmlns="http://www.w3.org/1998/Math/MathML"><semantics><mrow><mo stretchy="false">[</mo><mn>5</mn><mo separator="true">,</mo><mn>10</mn><mo separator="true">,</mo><mn>17</mn><mo stretchy="false">]</mo></mrow><annotation encoding="application/x-tex">[5, 10, 17]</annotation></semantics></math></span><span class="katex-html" aria-hidden="true"><span class="base"><span class="strut" style="height: 1em; vertical-align: -0.25em;"></span><span class="mopen">[</span><span class="mord">5</span><span class="mpunct">,</span><span class="mspace" style="margin-right: 0.1667em;"></span><span class="mord">10</span><span class="mpunct">,</span><span class="mspace" style="margin-right: 0.1667em;"></span><span class="mord">17</span><span class="mclose">]</span></span></span></span></span>. The next disk can be placed on fourth stack to get <span class="math math-inline"><span class="katex"><span class="katex-mathml"><math xmlns="http://www.w3.org/1998/Math/MathML"><semantics><mrow><mo stretchy="false">[</mo><mn>5</mn><mo separator="true">,</mo><mn>10</mn><mo separator="true">,</mo><mn>17</mn><mo separator="true">,</mo><mn>18</mn><mo stretchy="false">]</mo></mrow><annotation encoding="application/x-tex">[5, 10, 17, 18]</annotation></semantics></math></span><span class="katex-html" aria-hidden="true"><span class="base"><span class="strut" style="height: 1em; vertical-align: -0.25em;"></span><span class="mopen">[</span><span class="mord">5</span><span class="mpunct">,</span><span class="mspace" style="margin-right: 0.1667em;"></span><span class="mord">10</span><span class="mpunct">,</span><span class="mspace" style="margin-right: 0.1667em;"></span><span class="mord">17</span><span class="mpunct">,</span><span class="mspace" style="margin-right: 0.1667em;"></span><span class="mord">18</span><span class="mclose">]</span></span></span></span></span>. The last disk can be put on top of the third stack. The final stack top are <span class="math math-inline"><span class="katex"><span class="katex-mathml"><math xmlns="http://www.w3.org/1998/Math/MathML"><semantics><mrow><mo stretchy="false">[</mo><mn>5</mn><mo separator="true">,</mo><mn>10</mn><mo separator="true">,</mo><mn>12</mn><mo separator="true">,</mo><mn>18</mn><mo stretchy="false">]</mo></mrow><annotation encoding="application/x-tex">[5, 10, 12, 18]</annotation></semantics></math></span><span class="katex-html" aria-hidden="true"><span class="base"><span class="strut" style="height: 1em; vertical-align: -0.25em;"></span><span class="mopen">[</span><span class="mord">5</span><span class="mpunct">,</span><span class="mspace" style="margin-right: 0.1667em;"></span><span class="mord">10</span><span class="mpunct">,</span><span class="mspace" style="margin-right: 0.1667em;"></span><span class="mord">12</span><span class="mpunct">,</span><span class="mspace" style="margin-right: 0.1667em;"></span><span class="mord">18</span><span class="mclose">]</span></span></span></span></span>. Thus, <span class="math math-inline"><span class="katex"><span class="katex-mathml"><math xmlns="http://www.w3.org/1998/Math/MathML"><semantics><mrow><mn>4</mn></mrow><annotation encoding="application/x-tex">4</annotation></semantics></math></span><span class="katex-html" aria-hidden="true"><span class="base"><span class="strut" style="height: 0.6444em;"></span><span class="mord">4</span></span></span></span></span> stacks are needed.</p></div>

# SOLUTION:

***JAVA***
```
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	  Scanner sc=new Scanner(System.in);
	  Byte t=sc.nextByte();
	  while(t--!=0)
	  {
	      int n=sc.nextInt();
	      int c=0;
	      long a[]=new long[n];
	      long temp=sc.nextLong();
	      a[c++]=temp;
	      for(int i=1;i<n;i++)
	      {
	          temp=sc.nextLong();
	          if( a[c-1]<=temp)
	          {
	          a[c++]=temp;
	          continue;
	          }
	          int low=0,high=c-1;
	          while(high>low)
	          {
	              int mid=(low+high)/2;
	              if(a[mid]<=temp)
	              low=mid+1;
	              else
	              high=mid;
	          }
	          a[low]=temp;
	         
	      }
	      System.out.print(c+" ");
	      for(int i=0;i<c;i++)
	      System.out.print(a[i]+" ");
	      System.out.println();
	  }
	}
}
```

***PYTHON***
```
```
