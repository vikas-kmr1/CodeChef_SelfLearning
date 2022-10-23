<div id="problem-statement" class="_problemBody_lulsq_29 print"><h2>Problem</h2>
<p><i>Lapindrome</i> is defined as a string which when split in the middle, gives two halves having the same characters and same frequency of each character. If there are odd number of characters in the string, we ignore the middle character and check for lapindrome. For example <b><i>gaga</i></b> is a lapindrome, since the two halves <b><i>ga</i></b> and <b><i>ga</i></b> have the same characters with same frequency. Also, <b><i>abccab</i></b>, <b><i>rotor</i></b> and <b><i>xyzxy</i></b> are a few examples of lapindromes. Note that <b><i>abbaab</i></b> is NOT a lapindrome. The two halves contain the same characters but their frequencies do not match. <br> Your task is simple. Given a string, you need to tell if it is a lapindrome.</p>
<h3>Input:</h3>
First line of input contains a single integer <b>T</b>, the number of test cases.<br>
Each test is a single line containing a string <b>S</b> composed of only lowercase English alphabet.<br><h3>Output:</h3>
For each test case, output on a separate line: "YES" if the string is a lapindrome and "NO" if it is not.<br><h3>Constraints:</h3>
<ul><li>1 ≤ <b>T</b> ≤ 100</li>
<li>2 ≤ |<b>S</b>| ≤ 1000, where |<b>S</b>| denotes the length of <b>S</b></li>
</ul>
<h3>Sample 1:</h3>
<div data-reactroot="" class="_input_output__table_lulsq_184"><div class="_text_copy__container_lulsq_188"><div class="_text_copy_lulsq_188 _input_top__box_lulsq_198" style="border-right: 1px solid rgb(210, 217, 231);"><span>Input</span><div title="Copy to clipboard" class="" style="pointer-events: all;"><span class="_icon__box_9xn05_2"><i class="_copy__icon_9xn05_14"></i></span></div></div><div class="_text_copy_lulsq_188 _ouput_top__box_lulsq_201"><span>Output</span><div title="Copy to clipboard" class="" style="pointer-events: all;"><span class="_icon__box_9xn05_2"><i class="_copy__icon_9xn05_14"></i></span></div></div></div><div class="_values__container_lulsq_204"><div class="_values_lulsq_204" style="border-right: 1px solid rgb(210, 217, 231);"><pre>6
gaga
abcde
rotor
xyzxy
abbaab
ababc</pre></div><div class="_values_lulsq_204"><pre>YES
NO
YES
YES
NO
NO</pre></div></div></div></div>


## Solution:
***python3***
```
# cook your dish here
for i in range(int(input())):
    x  =  input()
    mid = len(x)//2
    s1 = x[:mid]
    s2 = x[mid:]
    if len(x)%2 == 1:
        s2 = s2[1:]
        
    #print(s1 ,s2)
        
    if sorted(s1) == sorted(s2):
        print("YES")
        continue
    
    print("NO")
    
    
```

***java***
```
public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0)
		{
		    String s=new String();
		    s=sc.next();
		    int len=s.length();
		    String sub1=new String();
		    sub1=s.substring(0,len/2);
		    String sub2=new String();
		    if(len%2==0)
		    sub2=s.substring(len/2,len);
		    else
		    sub2=s.substring((len/2)+1,len);
		    
		    char[] c1=sub1.toCharArray();
		    char[] c2=sub2.toCharArray();
		    Arrays.sort(c1);
		    Arrays.sort(c2);
		    if(Arrays.equals(c1,c2))
		    System.out.println("YES");
		    else
		    System.out.println("NO");
		}
	}
```