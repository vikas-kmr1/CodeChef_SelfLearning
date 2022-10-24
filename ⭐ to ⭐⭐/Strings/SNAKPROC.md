<div id="problem-statement" class="_problemBody_lulsq_29 print"><h2>Problem</h2>
<h3>Read problems statements in <a href="https://www.codechef.com/download/translated/SNCKQL17/mandarin/SNAKPROC.pdf">Mandarin Chinese</a>, <a href="https://www.codechef.com/download/translated/SNCKQL17/russian/SNAKPROC.pdf">Russian</a> and <a href="https://www.codechef.com/download/translated/SNCKQL17/vietnamese/SNAKPROC.pdf">Vietnamese</a> as well.</h3>
<p>The annual snake festival is upon us, and all the snakes of the kingdom have gathered to participate in the procession. Chef has been tasked with reporting on the procession, and for this he decides to first keep track of all the snakes. When he sees a snake first, it'll be its Head, and hence he will mark a 'H'. The snakes are long, and when he sees the snake finally slither away, he'll mark a 'T' to denote its tail. In the time in between, when the snake is moving past him, or the time between one snake and the next snake, he marks with '.'s.</p>
<p>Because the snakes come in a procession, and one by one, a valid report would be something like "..H..T...HTH....T.", or "...", or "HT", whereas "T...H..H.T", "H..T..H", "H..H..T..T" would be invalid reports (See explanations at the bottom).</p>
<p>Formally, a snake is represented by a 'H' followed by some (possibly zero) '.'s, and then a 'T'. A valid report is one such that it begins with a (possibly zero length) string of '.'s, and then some (possibly zero) snakes between which there can be some '.'s, and then finally ends with some (possibly zero) '.'s.</p>
<p>Chef had binged on the festival food and had been very drowsy. So his report might be invalid. You need to help him find out if his report is valid or not.</p>
<h3>Input</h3>
<ul>
<li>The first line contains a single integer, <span class="math math-inline"><span class="katex"><span class="katex-mathml"><math xmlns="http://www.w3.org/1998/Math/MathML"><semantics><mrow><mi>R</mi></mrow><annotation encoding="application/x-tex">R</annotation></semantics></math></span><span class="katex-html" aria-hidden="true"><span class="base"><span class="strut" style="height: 0.6833em;"></span><span class="mord mathnormal" style="margin-right: 0.00773em;">R</span></span></span></span></span>, which denotes the number of reports to be checked. The description of each report follows after this.</li>
<li>The first line of each report contains a single integer, <span class="math math-inline"><span class="katex"><span class="katex-mathml"><math xmlns="http://www.w3.org/1998/Math/MathML"><semantics><mrow><mi>L</mi></mrow><annotation encoding="application/x-tex">L</annotation></semantics></math></span><span class="katex-html" aria-hidden="true"><span class="base"><span class="strut" style="height: 0.6833em;"></span><span class="mord mathnormal">L</span></span></span></span></span>, the length of that report.</li>
<li>The second line of each report contains a string of length <span class="math math-inline"><span class="katex"><span class="katex-mathml"><math xmlns="http://www.w3.org/1998/Math/MathML"><semantics><mrow><mi>L</mi></mrow><annotation encoding="application/x-tex">L</annotation></semantics></math></span><span class="katex-html" aria-hidden="true"><span class="base"><span class="strut" style="height: 0.6833em;"></span><span class="mord mathnormal">L</span></span></span></span></span>. The string contains only the characters '.', 'H', and 'T'.</li>
</ul>
<h3>Output</h3>
<ul>
<li>For each report, output the string <strong>Valid</strong> or <strong>Invalid</strong> in a new line, depending on whether it was a valid report or not.</li>
</ul>
<h3>Constraints</h3>
<ul>
<li><span class="math math-inline"><span class="katex"><span class="katex-mathml"><math xmlns="http://www.w3.org/1998/Math/MathML"><semantics><mrow><mn>1</mn><mo>≤</mo><mi>R</mi><mo>≤</mo><mn>500</mn></mrow><annotation encoding="application/x-tex">1 \le R \le 500</annotation></semantics></math></span><span class="katex-html" aria-hidden="true"><span class="base"><span class="strut" style="height: 0.7804em; vertical-align: -0.136em;"></span><span class="mord">1</span><span class="mspace" style="margin-right: 0.2778em;"></span><span class="mrel">≤</span><span class="mspace" style="margin-right: 0.2778em;"></span></span><span class="base"><span class="strut" style="height: 0.8193em; vertical-align: -0.136em;"></span><span class="mord mathnormal" style="margin-right: 0.00773em;">R</span><span class="mspace" style="margin-right: 0.2778em;"></span><span class="mrel">≤</span><span class="mspace" style="margin-right: 0.2778em;"></span></span><span class="base"><span class="strut" style="height: 0.6444em;"></span><span class="mord">500</span></span></span></span></span></li>
<li><span class="math math-inline"><span class="katex"><span class="katex-mathml"><math xmlns="http://www.w3.org/1998/Math/MathML"><semantics><mrow><mn>1</mn><mo>≤</mo><mi>L</mi><mo>≤</mo><mn>500</mn></mrow><annotation encoding="application/x-tex">1 \le L \le 500</annotation></semantics></math></span><span class="katex-html" aria-hidden="true"><span class="base"><span class="strut" style="height: 0.7804em; vertical-align: -0.136em;"></span><span class="mord">1</span><span class="mspace" style="margin-right: 0.2778em;"></span><span class="mrel">≤</span><span class="mspace" style="margin-right: 0.2778em;"></span></span><span class="base"><span class="strut" style="height: 0.8193em; vertical-align: -0.136em;"></span><span class="mord mathnormal">L</span><span class="mspace" style="margin-right: 0.2778em;"></span><span class="mrel">≤</span><span class="mspace" style="margin-right: 0.2778em;"></span></span><span class="base"><span class="strut" style="height: 0.6444em;"></span><span class="mord">500</span></span></span></span></span></li>
</ul>
<h3>Sample 1:</h3>
<div data-reactroot="" class="_input_output__table_lulsq_184"><div class="_text_copy__container_lulsq_188"><div class="_text_copy_lulsq_188 _input_top__box_lulsq_198" style="border-right: 1px solid rgb(210, 217, 231);"><span>Input</span><div title="Copy to clipboard" class="" style="pointer-events: all;"><span class="_icon__box_9xn05_2 undefined"><i class="_copy__icon_9xn05_14"></i></span></div></div><div class="_text_copy_lulsq_188 _ouput_top__box_lulsq_201"><span>Output</span><div title="Copy to clipboard" class="" style="pointer-events: all;"><span class="_icon__box_9xn05_2 undefined"><i class="_copy__icon_9xn05_14"></i></span></div></div></div><div class="_values__container_lulsq_204"><div class="_values_lulsq_204" style="border-right: 1px solid rgb(210, 217, 231);"><pre>6
18
..H..T...HTH....T.
3
...
10
H..H..T..T
2
HT
11
.T...H..H.T
7
H..T..H</pre></div><div class="_values_lulsq_204"><pre>Valid
Valid
Invalid
Valid
Invalid
Invalid</pre></div></div></div>
<h3>Explanation:</h3>
<ul>
<li>
<p>"H..H..T..T" is invalid because the second snake starts before the first snake ends, which is not allowed.</p>
</li>
<li>
<p>".T...H..H.T" is invalid because it has a 'T' before a 'H'. A tail can come only after its head.</p>
</li>
<li>
<p>"H..T..H" is invalid because the last 'H' does not have a corresponding 'T'.</p>
</li>
</ul></div>

## SOLUTIONS:
***JAVA***
```
	Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0){
		    int size=sc.nextInt();
		    String str = sc.next();
		    String snake = "";
            boolean flag= true;
		    for (int i=0;i<size ;i++ ){
		        if(str.charAt(i)=='H' || str.charAt(i)=='T'){
		            snake+=str.charAt(i);
		        }
		    }
		    //System.out.println(snake);
		    if(snake.length()==0){
		        flag=true;
		    }else if (snake.length()%2!=0){
		        flag=false;
		    } else{
		        for (int i=0;i<snake.length() ;i++ ){
		            if(i%2==0){
		                if(snake.charAt(i)!='H'){
		                    flag=false;}
		            }else{
		                if(snake.charAt(i)!='T'){
		                    flag=false;}
		            }
		        } 
		    }
		    if(flag==true){
		        System.out.println("Valid");
		    }else{
		        System.out.println("Invalid");
		    }
		    
		}
```

***PYTHON***
```

# cook your dish here
t=int(input())
num=0
li=[]
h_count=0
t_count=0
for i in range(t):
    num=int(input())
    s=input()
    s=s.replace(".","")
    h_count=s.count('H')
    t_count=s.count('T')
    if h_count==t_count:
        val=s.count('HT')
        if val*2==len(s):
            print('Valid')
        else:
            print('Invalid')
    else:
        print('Invalid')

```
