<div id="problem-statement" class="_problemBody_lulsq_29 print"><h2>Problem</h2>
<h3> Read problems statements in <a target="_blank" href="https://www.codechef.com/download/translated/SNCKQL17/mandarin/SNAKEEAT.pdf" rel="nofollow noreferrer noopener">Mandarin Chinese</a>, <a target="_blank" href="https://www.codechef.com/download/translated/SNCKQL17/russian/SNAKEEAT.pdf" rel="nofollow noreferrer noopener">Russian</a> and <a target="_blank" href="https://www.codechef.com/download/translated/SNCKQL17/vietnamese/SNAKEEAT.pdf" rel="nofollow noreferrer noopener">Vietnamese</a> as well.</h3>
<p>The Chef has acquired a vicious bunch of snakes, and these snakes are ever hungry and end up eating each other. In particular, each snake i has a length <b>L<sub>i</sub></b>, whose initial value is given to you. A snake can eat any other snake which is not longer than itself. That is, snake i can eat snake j (i ≠ j), if <b>L<sub>i</sub></b> ≥ <b>L<sub>j</sub></b>. And when a snake eats another snake, its length increases by 1. That is, <b>L<sub>i</sub></b> increases by 1. A snake can eat multiple other snakes.</p>
<p>The Chef doesn't care about snakes eating each other. All he wants is to have as many snakes as possible, which are at least some particular lengths long. You are given <b>Q</b> values: <b>K<sub>1</sub>, K<sub>2</sub>, .., K<sub>Q</sub></b>. Treat each of them independently and output the answer for each. That is, for each <b>K<sub>i</sub></b>, assume that you start out from the beginning with all the snakes alive and the lengths as the initial values given in the input, and find out the maximum number of snakes you can get whose length is at least <b>K<sub>i</sub></b>.</p>
<h3>Input</h3>
<ul>
<li>The first line contains an integer <b>T</b>, which is the number of testcases. The description of each testcase follows.</li>
<li>The first line of each testcase contains two integers: <b>N</b> and <b>Q</b>, which denote the number of snakes initially, and the number of queries, respectively.</li>
<li>The second line contains <b>N</b> space separated integers: <b>L<sub>1</sub>, L<sub>2</sub>, .., L<sub>N</sub></b>, the initial lengths of the snakes.</li>
<li>The i-th of the next <b>Q</b> lines contains a single integer, <b>K<sub>i</sub></b>.
</li></ul>
<h3>Output</h3>
<ul>
<li>For each testcase, output <b>Q</b> lines, the i-th of which should have a single integer: The maximum number of snakes the Chef can get which are of length at least <b>K<sub>i</sub></b>.</li>
</ul>
<h3>Constraints</h3>
<ul>
<li>1 ≤ <b>T</b> ≤ 5</li>
<li>1 ≤ <b>N, Q</b> ≤ 10<sup>5</sup></li>
<li>1 ≤ <b>L<sub>i</sub></b> ≤ 10<sup>9</sup></li>
<li>1 ≤ <b>K<sub>i</sub></b> ≤ 10<sup>9</sup></li>
</ul>
<h3>Example</h3>
<pre style="position: relative;"><b>Input:</b>
2
5 2
21 9 5 8 10
10
15
5 1
1 2 3 4 5
100
<b>Output:</b>
3
1
0
<div class="open_grepper_editor" title="Edit &amp; Save To Grepper"></div></pre>
<h3>Explanation</h3>
<p>In the first testcase, first query, the second snake (length 9) can eat the fourth snake (length 8), and hence make its length 10. Now, there are four snakes left, and their lengths are {21, 10, 5, 10}. So, we have three snakes with length ≥ 10: Two snakes of length 10 and one snake of length 21. This is the best you can do.</p>
<p>In the second query, no matter what happens, you cannot get more than one snake of length ≥ 15.</p>
<p>In the second testcase, no matter what happens, you cannot get any snake of length ≥ 100. Hence the answer is 0.</p></div>
# SOLUTIONS:

***JAVA***
```
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{


		BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
		
		int t = Integer.parseInt(rd.readLine());
		
        for (int tc = 0; tc < t; tc++) {

			String [] n_q = rd.readLine().split(" ");

			int n = Integer.parseInt(n_q[0]);
			int q = Integer.parseInt(n_q[1]);

			String [] s1 = rd.readLine().split(" ");

			int [] s = new int[n];

			long sm = 0;

			for (int i = 0; i < n; i++) {
				s[i] = Integer.parseInt(s1[i]);
				sm +=  (long) s[i];
			}

			Arrays.sort(s);

			int [] qw = new int[q];
			
			Map<Integer, Integer> mp = new HashMap<>();


			for (int i = 0; i < q; i++) {
				qw[i] =  Integer.parseInt(rd.readLine());
				
				if (mp.containsKey(qw[i]) == false) {
					mp.put(qw[i], -1);
				}
			}

			int [] arr = new int [mp.size()];
			int ind = 0;

			for (Map.Entry<Integer, Integer> pair : mp.entrySet()) {
				arr[ind] = pair.getKey();
				ind += 1;
			}

			Arrays.sort(arr);
			int pt = 0;
			long cur = 0;

			int pt2 = 0;
			long cur2 = 0;
			

			for (int i = 0; i < arr.length; i++) {

				while (pt2 < n && s[pt2] < arr[i]) {
					cur2 +=  (long) s[pt2];
					pt2 += 1;
				}

				if (pt2 == n) {
					while (pt < n &&  (long) pt <   (long)(n - pt) *  (long) arr[i] -  (sm - cur)) {
						cur +=   (long) s[pt];
						pt += 1;
					}

				} else {
					while (pt < pt2 && (long) pt < (long)(pt2 - pt) * (long) arr[i] - (sm - cur - (sm - cur2))) {  
						cur +=  (long) s[pt];
						pt += 1;
					}
				}
				
				if (pt == pt2) {
					mp.put(arr[i], n - pt2);
				} else {
					mp.put(arr[i], (n - pt2) + (pt2 - pt));
				}

			}

			for (int i = 0; i < q; i++) {
				System.out.println(mp.get(qw[i]));
			}

        }


	}
}
```

***PYTHON***
```
```
