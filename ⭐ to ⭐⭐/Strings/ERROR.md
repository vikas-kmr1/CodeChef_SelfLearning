<div id="problem-statement" class="_problemBody_lulsq_29 print"><h2>Problem</h2>
<h3> Read problems statements in <a rel="nofollow noreferrer noopener" href="https://www.codechef.com/download/translated/JAN14/mandarin/ERROR.pdf">Mandarin Chinese </a> and <a rel="nofollow noreferrer noopener" href="https://www.codechef.com/download/translated/JAN14/russian/ERROR.pdf">Russian</a>.</h3>
<p> Lots of geeky customers visit our chef's restaurant everyday. So, when asked to fill the feedback form, these customers represent the feedback using a binary string (i.e a string that contains only characters <b>'0'</b> and <b>'1'</b>. </p>
<p>Now since chef is not that great in deciphering binary strings, he has decided the following criteria to classify the feedback as <b>Good</b> or <b>Bad</b> : <br><br></p>
<p>If the string contains the substring <b>"010"</b> or <b>"101"</b>, then the feedback is <b>Good</b>, else it is <b>Bad</b>. Note that, to be <b>Good</b> it is not necessary to have both of them as substring.<br><br></p><p> So given some binary strings, you need to output whether according to the chef, the strings are <b>Good</b> or <b>Bad</b>. </p><p></p>
<h3>Input</h3>
<p> The first line contains an integer <b>T</b> denoting the number of feedbacks. Each of the next <b>T</b> lines contains a string composed of only <b>'0' </b> and <b>'1'</b>.</p>
<h3>Output</h3>
<p> For every test case, print in a single line <b>Good</b> or <b>Bad</b> as per the Chef's method of classification.
</p><h3>Constraints</h3>
<ul><li><b> 1 </b>≤  <b>T</b> ≤ <b>  100 </b></li>
<li><b> 1 </b> ≤ <b> |S| </b>  ≤ <b> 10<sup>5</sup></b></li>
</ul><br>
Sum of length of all strings in one test file will not exceed <b>6*10<sup>6</sup></b>.
<br>
<h3>Sample 1:</h3>
<div data-reactroot="" class="_input_output__table_lulsq_184"><div class="_text_copy__container_lulsq_188"><div class="_text_copy_lulsq_188 _input_top__box_lulsq_198" style="border-right: 1px solid rgb(210, 217, 231);"><span>Input</span><div title="Copy to clipboard" class="" style="pointer-events: all;"><span class="_icon__box_9xn05_2"><i class="_copy__icon_9xn05_14"></i></span></div></div><div class="_text_copy_lulsq_188 _ouput_top__box_lulsq_201"><span>Output</span><div title="Copy to clipboard" class="" style="pointer-events: all;"><span class="_icon__box_9xn05_2"><i class="_copy__icon_9xn05_14"></i></span></div></div></div><div class="_values__container_lulsq_204"><div class="_values_lulsq_204" style="border-right: 1px solid rgb(210, 217, 231);"><pre>2
11111110
10101010101010</pre></div><div class="_values_lulsq_204"><pre>Bad
Good</pre></div></div></div>
<h3>Explanation:</h3>
<p><b>Example case 1.</b><br>
The string doesn't contain <b>010</b> or <b>101</b> as substrings.
 </p>
<p><b>Example case 2.</b><br>
The string contains both <b>010</b> and <b>101</b> as substrings.
</p></div>

## Solution:
***python3***
```
# cook your dish here
t=int(input())
for i in range(t):
    num=input()
    if (num.find('010')!=-1 or num.find('101')!=-1):
        print('Good')
    else:
        print('Bad')  
	
```

***java***
```
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int t=sc.nextInt();
		int count=0;
		for(int i=0; i<t; i++){
		    String str = sc.next();
		     if(str.contains("010") || str.contains("101")){
		        System.out.println("Good");
		    }
		    else{
		        System.out.println("Bad");
		    }
		}
```
