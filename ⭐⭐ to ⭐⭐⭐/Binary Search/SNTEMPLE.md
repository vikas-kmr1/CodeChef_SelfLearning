<div id="problem-statement" class="_problemBody_lulsq_29 print"><h2>Problem</h2>
<h3>Read problems statements in <a target="_blank" href="https://www.codechef.com/download/translated/SNCKPA17/mandarin/SNTEMPLE.pdf" rel="nofollow noreferrer noopener">Mandarin Chinese</a>, <a target="_blank" href="https://www.codechef.com/download/translated/SNCKPA17/russian/SNTEMPLE.pdf" rel="nofollow noreferrer noopener">Russian</a> and <a target="_blank" href="https://www.codechef.com/download/translated/SNCKPA17/vietnamese/SNTEMPLE.pdf" rel="nofollow noreferrer noopener">Vietnamese</a> as well.</h3>
<p>You want to build a temple for snakes. The temple will be built on a mountain range, which can be thought of as <b>n</b> blocks, where height of i-th block is given by <b>h</b><sub>i</sub>. The temple will be made on a consecutive section of the blocks and its height should start from 1 and increase by exactly 1 each time till some height and then decrease by exactly 1 each time to height 1, 
i.e. a consecutive section of 1, 2, 3, .. x-1, x, x-1, x-2, .., 1 can correspond to a temple. Also, heights of all the blocks other than of the temple should have zero height, so that the temple is visible to people who view it from the left side or right side.</p>
<p>You want to construct a temple. For that, you can reduce the heights of some of the blocks. In a single operation, you can reduce the height of a block by 1 unit. Find out minimum number of operations required to build a temple.</p>
<h3>Input</h3>
<p>The first line of the input contains an integer <b>T</b> denoting the number of test cases. The description of <b>T</b> test cases follows.</p>
<p>The first line of each test case contains an integer <b>n</b>.</p>
<p>The next line contains <b>n</b> integers, where the i-th integer denotes <b>h</b><sub>i</sub></p>
<h3>Output</h3>
<p>For each test case, output a new line with an integer corresponding to the answer of that testcase.</p>
<h3>Constraints</h3>
<ul>
<li>1 ≤ <b>T</b> ≤ 10</li>
<li>2 ≤ <b>n</b> ≤ 10<sup>5</sup></li>
<li>1 ≤ <b>h</b><sub>i</sub> ≤ 10<sup>9</sup></li>
</ul>
<h3>Example</h3>
<pre><b>Input</b>
3
3
1 2 1
4
1 1 2 1
5
1 2 6 2 1
<p><b>Output</b>
0
1
3
</p></pre><p></p>
<h3>Explanation</h3>
<p><b>Example 1</b>. The entire mountain range is already a temple. So, there is no need to make any operation.</p>
<p><b>Example 2</b>. If you reduce the height of the first block to 0. You get 0 1 2 1. The blocks 1, 2, 1 form a temple. So, the answer is 1.</p>
<p><b>Example 3</b>. One possible temple can be 1 2 3 2 1. It requires 3 operations to build. This is the minimum amount you have to spend in order to build a temple.</p></div>

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

			int n = Integer.parseInt(rd.readLine());

			String [] s_a = rd.readLine().split(" ");

			int [] arr = new int[n];

			long sm = 0;
			for (int i = 0; i < n; i++) {
				arr[i] = Integer.parseInt(s_a[i]);
				sm += arr[i];
			}

			int l = 1;
			int r = n;
			long cnt = -1;

			while (l <= r) {
				int mid = l + (r - l) / 2;

				int [] left = new int [n];
				int pt = 0;
				int cur = 0;

				for (int i = 0; i < n; i++) {

					if (i < mid - 1) {
						left[i] = -1;
						continue;
					}

					while (true) {
						if (cur == mid) {
							cur -= 1;
							break;
						} 

						if (arr[pt] < cur + 1) {
							cur -= 1;
							break;
						} else {
							cur += 1;
							pt += 1;
						}								
					}

					left[i] = cur + 1;
				}


				int [] right = new int [n];
				pt = n - 1;
				cur = 0;
				
				for (int i = n - 1; i >= 0; i--) {

					if (i > n - mid) { 
						right[i] = -1;
						continue;
					}

					while (true) {
						if (cur == mid) {
							cur -= 1;
							break;
						} 

						if (arr[pt] < cur + 1) {
							cur -= 1;
							break;
						} else {
							cur += 1;
							pt -= 1;
						}								
					}

					right[i] = cur + 1;
				}

				boolean flag = false;

				for (int i = 0; i < n; i++) {
					if (left[i] == mid && right[i] == mid) {
						flag = true;
						break;
					}
				}


				if (flag) {
					cnt = sm -  (mid * (mid + 1) -  mid);
					l = mid + 1;
				} else {
					r = mid - 1;
				}
				
			}

			System.out.println(cnt);

        }

	}
}
```

***PYTHON***
```
```
