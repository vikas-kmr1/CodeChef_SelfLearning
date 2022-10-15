<div id="problem-statement" class="_problemBody_lulsq_29 print"><h2>Problem</h2>
<p>
A new strain of flu has broken out. Fortunately, a vaccine was developed very quickly and is now being administered to the public. Your local health clinic is administering this vaccine, but the waiting line is very long.
</p><p>
For safety reasons, people are not allowed to stand very close to each other as the flu is not under control yet. However, many people were not aware of this precaution. A health and safety official recently examined the line and has determined that people need to spread out more in the line so that they are at least T units away from each other. This needs to be done as quickly as possible so we need to calculate the minimum distance D such that it is possible for every person to move at most D units so the distance between any two people is at least T. Specifically, D should be the minimum value such that there are locations x'<sub>i</sub> so that |x<sub>i</sub> - x'<sub>i</sub>| ≤ D for each person i and |x'<sub>i</sub> - x'<sub>j</sub>| ≥ T for any two distinct people i,j. Furthermore, since nobody can move past the receptionist we must also have that x'<sub>i</sub> ≥ 0. 
</p><p>
The location of each person is given by the number of meters they are standing from the receptionist. When spreading out, people may move either forward or backward in line but nobody may move past the location of the receptionist.
</p><h3>Input</h3>
<p>
The first line of input contains a single integer K ≤ 30 indicating the number of test cases to follow. Each test case begins with a line containing an integer N (the number of people) and a floating point value T (the minimum distance that should be between people). The location of each person i is described by single floating point value x<sub>i</sub> which means person i is x<sub>i</sub> meters from the receptionist. These values appear in non-decreasing order on the following N lines, one value per line.
</p><p>
Bounds: 1 ≤ N ≤ 10,000 and T and every x<sub>i</sub> is between 0 and 1,000,000 and is given with at most 3 decimals of precision.
</p><h3>Output</h3>
<p>
For each test case, you should output the minimum value of D with exactly 4 decimals of precision on a single line.
</p>
<h3>Sample 1:</h3>
<div data-reactroot="" class="_input_output__table_lulsq_184"><div class="_text_copy__container_lulsq_188"><div class="_text_copy_lulsq_188 _input_top__box_lulsq_198" style="border-right: 1px solid rgb(210, 217, 231);"><span>Input</span><div title="Copy to clipboard" class="" style="pointer-events: all;"><span class="_icon__box_9xn05_2 undefined"><i class="_copy__icon_9xn05_14"></i></span></div></div><div class="_text_copy_lulsq_188 _ouput_top__box_lulsq_201"><span>Output</span><div title="Copy to clipboard" class="" style="pointer-events: all;"><span class="_icon__box_9xn05_2 undefined"><i class="_copy__icon_9xn05_14"></i></span></div></div></div><div class="_values__container_lulsq_204"><div class="_values_lulsq_204" style="border-right: 1px solid rgb(210, 217, 231);"><pre>3
2 4
1
2
2 2
1
2
4 1
0
0.5
0.6
2.75</pre></div><div class="_values_lulsq_204"><pre>2.0000
0.5000
1.4000</pre></div></div></div>
<h3>Explanation:</h3>
<p><strong>Test case <span class="math math-inline"><span class="katex"><span class="katex-mathml"><math xmlns="http://www.w3.org/1998/Math/MathML"><semantics><mrow><mn>1</mn></mrow><annotation encoding="application/x-tex">1</annotation></semantics></math></span><span class="katex-html" aria-hidden="true"><span class="base"><span class="strut" style="height: 0.6444em;"></span><span class="mord">1</span></span></span></span></span>:</strong> To maintain a distance of <span class="math math-inline"><span class="katex"><span class="katex-mathml"><math xmlns="http://www.w3.org/1998/Math/MathML"><semantics><mrow><mn>4</mn></mrow><annotation encoding="application/x-tex">4</annotation></semantics></math></span><span class="katex-html" aria-hidden="true"><span class="base"><span class="strut" style="height: 0.6444em;"></span><span class="mord">4</span></span></span></span></span> units, the first person can move to location <span class="math math-inline"><span class="katex"><span class="katex-mathml"><math xmlns="http://www.w3.org/1998/Math/MathML"><semantics><mrow><mn>0</mn></mrow><annotation encoding="application/x-tex">0</annotation></semantics></math></span><span class="katex-html" aria-hidden="true"><span class="base"><span class="strut" style="height: 0.6444em;"></span><span class="mord">0</span></span></span></span></span> and the second can move to location <span class="math math-inline"><span class="katex"><span class="katex-mathml"><math xmlns="http://www.w3.org/1998/Math/MathML"><semantics><mrow><mn>4</mn></mrow><annotation encoding="application/x-tex">4</annotation></semantics></math></span><span class="katex-html" aria-hidden="true"><span class="base"><span class="strut" style="height: 0.6444em;"></span><span class="mord">4</span></span></span></span></span>. The maximum distance a person has to move is <span class="math math-inline"><span class="katex"><span class="katex-mathml"><math xmlns="http://www.w3.org/1998/Math/MathML"><semantics><mrow><mn>2</mn></mrow><annotation encoding="application/x-tex">2</annotation></semantics></math></span><span class="katex-html" aria-hidden="true"><span class="base"><span class="strut" style="height: 0.6444em;"></span><span class="mord">2</span></span></span></span></span>.</p>
<p><strong>Test case <span class="math math-inline"><span class="katex"><span class="katex-mathml"><math xmlns="http://www.w3.org/1998/Math/MathML"><semantics><mrow><mn>2</mn></mrow><annotation encoding="application/x-tex">2</annotation></semantics></math></span><span class="katex-html" aria-hidden="true"><span class="base"><span class="strut" style="height: 0.6444em;"></span><span class="mord">2</span></span></span></span></span>:</strong> To maintain a distance of <span class="math math-inline"><span class="katex"><span class="katex-mathml"><math xmlns="http://www.w3.org/1998/Math/MathML"><semantics><mrow><mn>2</mn></mrow><annotation encoding="application/x-tex">2</annotation></semantics></math></span><span class="katex-html" aria-hidden="true"><span class="base"><span class="strut" style="height: 0.6444em;"></span><span class="mord">2</span></span></span></span></span> units, the first person can move to location <span class="math math-inline"><span class="katex"><span class="katex-mathml"><math xmlns="http://www.w3.org/1998/Math/MathML"><semantics><mrow><mn>0.5</mn></mrow><annotation encoding="application/x-tex">0.5</annotation></semantics></math></span><span class="katex-html" aria-hidden="true"><span class="base"><span class="strut" style="height: 0.6444em;"></span><span class="mord">0.5</span></span></span></span></span> and the second person can move to location <span class="math math-inline"><span class="katex"><span class="katex-mathml"><math xmlns="http://www.w3.org/1998/Math/MathML"><semantics><mrow><mn>2.5</mn></mrow><annotation encoding="application/x-tex">2.5</annotation></semantics></math></span><span class="katex-html" aria-hidden="true"><span class="base"><span class="strut" style="height: 0.6444em;"></span><span class="mord">2.5</span></span></span></span></span>. The maximum distance a person has to move is <span class="math math-inline"><span class="katex"><span class="katex-mathml"><math xmlns="http://www.w3.org/1998/Math/MathML"><semantics><mrow><mn>0.5</mn></mrow><annotation encoding="application/x-tex">0.5</annotation></semantics></math></span><span class="katex-html" aria-hidden="true"><span class="base"><span class="strut" style="height: 0.6444em;"></span><span class="mord">0.5</span></span></span></span></span>.</p>
<p><strong>Test case <span class="math math-inline"><span class="katex"><span class="katex-mathml"><math xmlns="http://www.w3.org/1998/Math/MathML"><semantics><mrow><mn>3</mn></mrow><annotation encoding="application/x-tex">3</annotation></semantics></math></span><span class="katex-html" aria-hidden="true"><span class="base"><span class="strut" style="height: 0.6444em;"></span><span class="mord">3</span></span></span></span></span>:</strong> To maintain a distance of <span class="math math-inline"><span class="katex"><span class="katex-mathml"><math xmlns="http://www.w3.org/1998/Math/MathML"><semantics><mrow><mn>1</mn></mrow><annotation encoding="application/x-tex">1</annotation></semantics></math></span><span class="katex-html" aria-hidden="true"><span class="base"><span class="strut" style="height: 0.6444em;"></span><span class="mord">1</span></span></span></span></span> unit, the first person does not move, the second moves to location <span class="math math-inline"><span class="katex"><span class="katex-mathml"><math xmlns="http://www.w3.org/1998/Math/MathML"><semantics><mrow><mn>1</mn></mrow><annotation encoding="application/x-tex">1</annotation></semantics></math></span><span class="katex-html" aria-hidden="true"><span class="base"><span class="strut" style="height: 0.6444em;"></span><span class="mord">1</span></span></span></span></span>, the third moves to location <span class="math math-inline"><span class="katex"><span class="katex-mathml"><math xmlns="http://www.w3.org/1998/Math/MathML"><semantics><mrow><mn>2</mn></mrow><annotation encoding="application/x-tex">2</annotation></semantics></math></span><span class="katex-html" aria-hidden="true"><span class="base"><span class="strut" style="height: 0.6444em;"></span><span class="mord">2</span></span></span></span></span>, and the fourth moves to location <span class="math math-inline"><span class="katex"><span class="katex-mathml"><math xmlns="http://www.w3.org/1998/Math/MathML"><semantics><mrow><mn>3</mn></mrow><annotation encoding="application/x-tex">3</annotation></semantics></math></span><span class="katex-html" aria-hidden="true"><span class="base"><span class="strut" style="height: 0.6444em;"></span><span class="mord">3</span></span></span></span></span>. The corresponding distances moved by each of them is <span class="math math-inline"><span class="katex"><span class="katex-mathml"><math xmlns="http://www.w3.org/1998/Math/MathML"><semantics><mrow><mn>0</mn><mo separator="true">,</mo><mn>0</mn><mo separator="true">,</mo><mn>5</mn><mo separator="true">,</mo><mn>1.4</mn><mo separator="true">,</mo></mrow><annotation encoding="application/x-tex">0, 0,5, 1.4,</annotation></semantics></math></span><span class="katex-html" aria-hidden="true"><span class="base"><span class="strut" style="height: 0.8389em; vertical-align: -0.1944em;"></span><span class="mord">0</span><span class="mpunct">,</span><span class="mspace" style="margin-right: 0.1667em;"></span><span class="mord">0</span><span class="mpunct">,</span><span class="mspace" style="margin-right: 0.1667em;"></span><span class="mord">5</span><span class="mpunct">,</span><span class="mspace" style="margin-right: 0.1667em;"></span><span class="mord">1.4</span><span class="mpunct">,</span></span></span></span></span> and <span class="math math-inline"><span class="katex"><span class="katex-mathml"><math xmlns="http://www.w3.org/1998/Math/MathML"><semantics><mrow><mn>0.25</mn></mrow><annotation encoding="application/x-tex">0.25</annotation></semantics></math></span><span class="katex-html" aria-hidden="true"><span class="base"><span class="strut" style="height: 0.6444em;"></span><span class="mord">0.25</span></span></span></span></span> respectively. Thus, the maximum distance moved by any person is <span class="math math-inline"><span class="katex"><span class="katex-mathml"><math xmlns="http://www.w3.org/1998/Math/MathML"><semantics><mrow><mn>1.4</mn></mrow><annotation encoding="application/x-tex">1.4</annotation></semantics></math></span><span class="katex-html" aria-hidden="true"><span class="base"><span class="strut" style="height: 0.6444em;"></span><span class="mord">1.4</span></span></span></span></span> moved by the third person.</p></div>

## Solutions:
**Python**
```
tc = int(input())
for k in range(tc):
    n, t = input().split()
    n, t = int(n), float(t)
    arr = []
    for j in range(n):
        arr.append(float(input()))
    l = 0.0
    r = 10.0 ** 12
    mn = r
    while (True):
        mid = l + (r - l) / 2
        if ( (r - l) <= 0.0001):
            mn = mid 
            break
        right = None
        flag = True
        for i in range(n -1 , -1 , -1):
            if (i == n - 1):
                right = arr[n - 1] + mid - t
            else:
                if (arr[i] <= right):
                    pos = min(arr[i] + mid, right)
                    right = pos - t
                else:
                    pos = max(arr[i] - mid, right)
                    if (pos > right or pos < 0):
                        flag = False
                        break
                    right = pos - t
        if (flag == True):
            r = mid 
        else:
            l = mid
    num = str(round(mn, 4)).split(".")
    while (len(num[1]) < 4):
        num[1] += "0"
    print(".".join(num))
```

**Java**
```

```

