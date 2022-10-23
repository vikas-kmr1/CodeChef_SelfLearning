<div id="problem-statement" class="_problemBody_lulsq_29 print"><h2>Problem</h2>
<h3> Read problems statements in <a rel="nofollow noreferrer noopener" href="https://www.codechef.com/download/translated/LTIME39/mandarin/ALPHABET.pdf">Mandarin Chinese</a>, <a rel="nofollow noreferrer noopener" href="https://www.codechef.com/download/translated/LTIME39/russian/ALPHABET.pdf">Russian</a> and <a rel="nofollow noreferrer noopener" href="https://www.codechef.com/download/translated/LTIME39/vietnamese/ALPHABET.pdf">Vietnamese</a> as well.</h3>
<p>Not everyone probably knows that Chef has younger brother Jeff. Currently Jeff learns to read.</p>
<p>He knows some subset of the letter of Latin alphabet. In order to help Jeff to study, Chef gave him a book with the text consisting of <b>N</b> words. Jeff can read a word iff it consists only of the letters he knows.</p>
<p>Now Chef is curious about which words his brother will be able to read, and which are not. Please help him!</p>
<h3>Input</h3>
<p>The first line of the input contains a lowercase Latin letter string <b>S</b>, consisting of the letters Jeff can read. Every letter will appear in <b>S</b> no more than once.</p>
<p>The second line of the input contains an integer <b>N</b> denoting the number of words in the book.</p>
<p>Each of the following <b>N</b> lines contains a single lowecase Latin letter string <b>W<sub>i</sub></b>, denoting the <b>i</b><sup>th</sup> word in the book.</p>
<h3>Output</h3>
<p>For each of the words, output <tt>"Yes"</tt> (without quotes) in case Jeff can read it, and <tt>"No"</tt> (without quotes) otherwise.</p>
<h3>Constraints</h3>
<ul><li><b>1</b> ≤ <b>|S|</b> ≤ <b>26</b></li>
<li><b>1</b> ≤ <b>N</b> ≤ <b>1000</b></li>
<li><b>1</b> ≤ <b>|W<sub>i</sub>|</b> ≤ <b>12</b></li>
<li>Each letter will appear in <b>S</b> no more than once.</li>
<li><b>S, W<sub>i</sub></b> consist only of lowercase Latin letters.</li>
</ul><h3>Subtasks</h3>
<ul><li><b>Subtask #1 (31 point)</b>: <b>|S|</b> = <b>1</b>, i.e. Jeff knows only one letter.</li>
<li><b>Subtask #2 (69 point)</b>	: no additional constraints</li>
</ul>
<h3>Sample 1:</h3>
<div data-reactroot="" class="_input_output__table_lulsq_184"><div class="_text_copy__container_lulsq_188"><div class="_text_copy_lulsq_188 _input_top__box_lulsq_198" style="border-right: 1px solid rgb(210, 217, 231);"><span>Input</span><div title="Copy to clipboard" class="" style="pointer-events: all;"><span class="_icon__box_9xn05_2"><i class="_copy__icon_9xn05_14"></i></span></div></div><div class="_text_copy_lulsq_188 _ouput_top__box_lulsq_201"><span>Output</span><div title="Copy to clipboard" class="" style="pointer-events: all;"><span class="_icon__box_9xn05_2"><i class="_copy__icon_9xn05_14"></i></span></div></div></div><div class="_values__container_lulsq_204"><div class="_values_lulsq_204" style="border-right: 1px solid rgb(210, 217, 231);"><pre>act
2
cat
dog</pre></div><div class="_values_lulsq_204"><pre>Yes
No</pre></div></div></div>
<h3>Explanation:</h3>
<p>The first word can be read.</p>
<p>The second word contains the letters d, o and g that aren't known by Jeff.</p></div>


## Solution:
***python3***
```
# cook your dish here
s = input()
for i in range(int(input())):
    w = input()
    c = 0
    for j in range(len(s)):
        for k in range(len(w)):
            if s[j] == w[k]:
                c += 1
                
    if c == len(w):
        print("Yes")
        continue
    print("No")
    
        
```

***java***
```
public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		String s=sc.next();
		int n=sc.nextInt();
		while(n-->0)
		{
		    int c=0;
		    String w=sc.next();
		    for(int i=0;i<w.length();i++)
		    {
		        if(s.indexOf(w.charAt(i))>=0) c++;
		    }
		    if(c==w.length()) 
		    System.out.println("Yes");
		    else 
		    System.out.println("No");
		}
	}
}


```