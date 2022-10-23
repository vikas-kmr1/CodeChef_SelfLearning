<div id="problem-statement" class="_problemBody_lulsq_29 print"><h2>Problem</h2>
<h3>Read problems statements in <a href="https://www.codechef.com/download/translated/COOK127/mandarin/PAWRI.pdf">Mandarin Chinese</a>, <a href="https://www.codechef.com/download/translated/COOK127/russian/PAWRI.pdf">Russian</a>, <a href="https://www.codechef.com/download/translated/COOK127/vietnamese/PAWRI.pdf">Vietnamese</a>, and <a href="https://www.codechef.com/download/translated/COOK127/bengali/PAWRI.pdf">Bengali</a> as well.</h3>
<p>Lately, Chef has been inspired by the "pawri" meme. Therefore, he decided to take a string <span class="math math-inline"><span class="katex"><span class="katex-mathml"><math xmlns="http://www.w3.org/1998/Math/MathML"><semantics><mrow><mi>S</mi></mrow><annotation encoding="application/x-tex">S</annotation></semantics></math></span><span class="katex-html" aria-hidden="true"><span class="base"><span class="strut" style="height: 0.6833em;"></span><span class="mord mathnormal" style="margin-right: 0.05764em;">S</span></span></span></span></span> and change each of its substrings that spells "party" to "pawri". Find the resulting string.</p>
<h3>Input</h3>
<ul>
<li>The first line of the input contains a single integer <span class="math math-inline"><span class="katex"><span class="katex-mathml"><math xmlns="http://www.w3.org/1998/Math/MathML"><semantics><mrow><mi>T</mi></mrow><annotation encoding="application/x-tex">T</annotation></semantics></math></span><span class="katex-html" aria-hidden="true"><span class="base"><span class="strut" style="height: 0.6833em;"></span><span class="mord mathnormal" style="margin-right: 0.13889em;">T</span></span></span></span></span> denoting the number of test cases. The description of <span class="math math-inline"><span class="katex"><span class="katex-mathml"><math xmlns="http://www.w3.org/1998/Math/MathML"><semantics><mrow><mi>T</mi></mrow><annotation encoding="application/x-tex">T</annotation></semantics></math></span><span class="katex-html" aria-hidden="true"><span class="base"><span class="strut" style="height: 0.6833em;"></span><span class="mord mathnormal" style="margin-right: 0.13889em;">T</span></span></span></span></span> test cases follows.</li>
<li>The first and only line of each test case contains a single string <span class="math math-inline"><span class="katex"><span class="katex-mathml"><math xmlns="http://www.w3.org/1998/Math/MathML"><semantics><mrow><mi>S</mi></mrow><annotation encoding="application/x-tex">S</annotation></semantics></math></span><span class="katex-html" aria-hidden="true"><span class="base"><span class="strut" style="height: 0.6833em;"></span><span class="mord mathnormal" style="margin-right: 0.05764em;">S</span></span></span></span></span>.</li>
</ul>
<h3>Output</h3>
<p>For each test case, print a single line containing the string after it is modified by Chef.</p>
<h3>Constraints</h3>
<ul>
<li><span class="math math-inline"><span class="katex"><span class="katex-mathml"><math xmlns="http://www.w3.org/1998/Math/MathML"><semantics><mrow><mn>1</mn><mo>≤</mo><mi>T</mi><mo>≤</mo><mn>10</mn></mrow><annotation encoding="application/x-tex">1 \leq T \leq 10</annotation></semantics></math></span><span class="katex-html" aria-hidden="true"><span class="base"><span class="strut" style="height: 0.7804em; vertical-align: -0.136em;"></span><span class="mord">1</span><span class="mspace" style="margin-right: 0.2778em;"></span><span class="mrel">≤</span><span class="mspace" style="margin-right: 0.2778em;"></span></span><span class="base"><span class="strut" style="height: 0.8193em; vertical-align: -0.136em;"></span><span class="mord mathnormal" style="margin-right: 0.13889em;">T</span><span class="mspace" style="margin-right: 0.2778em;"></span><span class="mrel">≤</span><span class="mspace" style="margin-right: 0.2778em;"></span></span><span class="base"><span class="strut" style="height: 0.6444em;"></span><span class="mord">10</span></span></span></span></span></li>
<li><span class="math math-inline"><span class="katex"><span class="katex-mathml"><math xmlns="http://www.w3.org/1998/Math/MathML"><semantics><mrow><mn>1</mn><mo>≤</mo><mi mathvariant="normal">∣</mi><mi>S</mi><mi mathvariant="normal">∣</mi><mo>≤</mo><mn>1</mn><msup><mn>0</mn><mn>5</mn></msup></mrow><annotation encoding="application/x-tex">1 \leq |S| \leq 10^5</annotation></semantics></math></span><span class="katex-html" aria-hidden="true"><span class="base"><span class="strut" style="height: 0.7804em; vertical-align: -0.136em;"></span><span class="mord">1</span><span class="mspace" style="margin-right: 0.2778em;"></span><span class="mrel">≤</span><span class="mspace" style="margin-right: 0.2778em;"></span></span><span class="base"><span class="strut" style="height: 1em; vertical-align: -0.25em;"></span><span class="mord">∣</span><span class="mord mathnormal" style="margin-right: 0.05764em;">S</span><span class="mord">∣</span><span class="mspace" style="margin-right: 0.2778em;"></span><span class="mrel">≤</span><span class="mspace" style="margin-right: 0.2778em;"></span></span><span class="base"><span class="strut" style="height: 0.8141em;"></span><span class="mord">1</span><span class="mord"><span class="mord">0</span><span class="msupsub"><span class="vlist-t"><span class="vlist-r"><span class="vlist" style="height: 0.8141em;"><span style="top: -3.063em; margin-right: 0.05em;"><span class="pstrut" style="height: 2.7em;"></span><span class="sizing reset-size6 size3 mtight"><span class="mord mtight">5</span></span></span></span></span></span></span></span></span></span></span></span></li>
<li><span class="math math-inline"><span class="katex"><span class="katex-mathml"><math xmlns="http://www.w3.org/1998/Math/MathML"><semantics><mrow><mi>S</mi></mrow><annotation encoding="application/x-tex">S</annotation></semantics></math></span><span class="katex-html" aria-hidden="true"><span class="base"><span class="strut" style="height: 0.6833em;"></span><span class="mord mathnormal" style="margin-right: 0.05764em;">S</span></span></span></span></span> contains only lowercase English letters</li>
</ul>
<h3>Sample 1:</h3>
<div data-reactroot="" class="_input_output__table_lulsq_184"><div class="_text_copy__container_lulsq_188"><div class="_text_copy_lulsq_188 _input_top__box_lulsq_198" style="border-right: 1px solid rgb(210, 217, 231);"><span>Input</span><div title="Copy to clipboard" class="" style="pointer-events: all;"><span class="_icon__box_9xn05_2"><i class="_copy__icon_9xn05_14"></i></span></div></div><div class="_text_copy_lulsq_188 _ouput_top__box_lulsq_201"><span>Output</span><div title="Copy to clipboard" class="" style="pointer-events: all;"><span class="_icon__box_9xn05_2"><i class="_copy__icon_9xn05_14"></i></span></div></div></div><div class="_values__container_lulsq_204"><div class="_values_lulsq_204" style="border-right: 1px solid rgb(210, 217, 231);"><pre>3
part
partypartiparty
yemaihuyemericarhaiauryahapartyhorahihai</pre></div><div class="_values_lulsq_204"><pre>part
pawripartipawri
yemaihuyemericarhaiauryahapawrihorahihai</pre></div></div></div>
<h3>Explanation:</h3>
<p><strong>Example case 1:</strong> There is no substring "party" in the original string.</p>
<p><strong>Example case 2:</strong> The original string has <span class="math math-inline"><span class="katex"><span class="katex-mathml"><math xmlns="http://www.w3.org/1998/Math/MathML"><semantics><mrow><mn>2</mn></mrow><annotation encoding="application/x-tex">2</annotation></semantics></math></span><span class="katex-html" aria-hidden="true"><span class="base"><span class="strut" style="height: 0.6444em;"></span><span class="mord">2</span></span></span></span></span> substrings "party".</p>
<p><strong>Example case 3:</strong> There is only a single substring "party" in the original string.</p></div>


## Solution:
***python3***
```
# cook your dish here
for i in range(int(input())):
    s =  input()
    j = 0
    while(j < len(s)):
        
        if s[j:j+5] == "party":
            s = s[:j]+"pawri"+s[j+5:]
            j += 4
        j += 1
    print(s)
            
            
```

***java***
```
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-- != 0){
		    String s = sc.next();
		    System.out.println(s.replaceAll("party", "pawri"));
		}
	}
```