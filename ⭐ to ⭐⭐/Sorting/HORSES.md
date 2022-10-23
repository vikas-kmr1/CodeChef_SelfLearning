<div id="problem-statement" class="_problemBody_lulsq_29 print"><h2>Problem</h2>
<p>Chef is very fond of horses. He enjoys watching them race. As expected, he has a stable full of horses. He, along with his friends, goes to his stable during the weekends to watch a few of these horses race. Chef wants his friends to enjoy the race and so he wants the race to be close. This can happen only if the horses are comparable on their skill i.e. the difference in their skills is less.</p>
<p>There are <b>N</b> horses in the stable. The skill of the horse <b>i</b> is represented by an integer <b>S[i]</b>. The Chef needs to pick 2 horses for the race such that the difference in their skills is <i>minimum</i>. This way, he would be able to host a very interesting race. Your task is to help him do this and report the minimum difference that is possible between 2 horses in the race.</p>
<h3>Input:</h3>
<p>First line of the input file contains a single integer <b>T</b>, the number of test cases.<br>
Every test case starts with a line containing the integer <b>N</b>.<br>
The next line contains <b>N</b> space separated integers where the <b>i</b>-th integer is <b>S[i]</b>.</p>
<h3>Output:</h3>
<p>For each test case, output a single line containing the minimum difference that is possible.</p>
<h3>Constraints:</h3>
<pre>1 ≤ <b>T</b> ≤ 10
2 ≤ <b>N</b> ≤ 5000
1 ≤ <b>S[i]</b> ≤ 1000000000
</pre>
<h3>Sample 1:</h3>
<div data-reactroot="" class="_input_output__table_lulsq_184"><div class="_text_copy__container_lulsq_188"><div class="_text_copy_lulsq_188 _input_top__box_lulsq_198" style="border-right: 1px solid rgb(210, 217, 231);"><span>Input</span><div title="Copy to clipboard" class="" style="pointer-events: all;"><span class="_icon__box_9xn05_2"><i class="_copy__icon_9xn05_14"></i></span></div></div><div class="_text_copy_lulsq_188 _ouput_top__box_lulsq_201"><span>Output</span><div title="Copy to clipboard" class="" style="pointer-events: all;"><span class="_icon__box_9xn05_2"><i class="_copy__icon_9xn05_14"></i></span></div></div></div><div class="_values__container_lulsq_204"><div class="_values_lulsq_204" style="border-right: 1px solid rgb(210, 217, 231);"><pre>1
5
4 9 1 32 13
</pre></div><div class="_values_lulsq_204"><pre>3</pre></div></div></div>
<h3>Explanation:</h3>
<p>The minimum difference can be achieved if we pick horses with skills 1 and 4 for the race.</p></div>

## Solution:
***python3***
```
# cook your dish here
for i in range(int(input())):
    n = int(input())
    arr = list(map(int, input().split()))
    arr.sort()
    min_diff = 2**31 - 1
    
    for ith in range(n-1):
        if abs(arr[ith] - arr[ith + 1]) < min_diff:
            min_diff = abs(arr[ith] - arr[ith + 1])
                
    print(min_diff)
```

***java***
```
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
	Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		for(int i=0; i<t; i++){
		    int n = s.nextInt();
		    int arr[] = new int[n];
		    for(int j=0; j<n; j++){
		        arr[j] = s.nextInt();
		    }
		    int dif = Integer.MAX_VALUE;
		    for(int j=0; j<n; j++){
		        for(int k=j+1; k<n; k++){
		            if(Math.abs(arr[j]-arr[k]) < dif){
		                dif = Math.abs(arr[j]-arr[k]);
		            }
		        }
		    }
		    
		    System.out.println(dif);
		}
	}

```