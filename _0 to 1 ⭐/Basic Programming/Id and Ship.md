<div id="problem-statement" class="_problemBody_lulsq_29 print"><h2>Problem</h2>
<p>
Write a program that takes in a letterclass ID of a ship and display the equivalent string class description of the given ID. Use the table below.
</p><table><tbody><tr><td style="background-color: rgb(225, 225, 225);">Class ID </td><td style="background-color: rgb(225, 225, 225);">Ship Class</td></tr><tr><td>B or b</td><td>BattleShip</td></tr><tr><td>C or c</td><td>Cruiser</td></tr><tr><td>D or d</td><td>Destroyer</td></tr><tr><td>F or f</td><td>Frigate</td></tr></tbody></table><h3>Input</h3>
<p> 
The first line contains an integer <b>T</b>, the total number of testcases. Then <b>T</b> lines follow, each line contains a character. 
</p>
<h3>Output</h3>
<p>For each test case, display the Ship Class depending on ID, in a new line.</p>
<h3>Constraints</h3>
<ul><li>1 <b>≤</b> <b>T</b> <b>≤</b> 1000</li>
</ul><h3>Example</h3>
<pre><b>Input</b>
<p>3
B
c
D</p>
<p><b>Output</b>
BattleShip
Cruiser
Destroyer
</p></pre><p></p></div>

# Solution: 
## Python:
``` 
``` 
## Java: 
```
import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for(int i=0; i<t; i++){
		    char id = sc.next().charAt(0);
		    if(id == 'B' || id=='b'){
		        System.out.println("BattleShip");
		    }
		    else if(id == 'C' || id=='c'){
		        System.out.println("Cruiser");
		    }
		    else if(id == 'D' || id=='d'){
		        System.out.println("Destroyer");
		    }
		    else if (id == 'F' || id=='f'){
		        System.out.println("Frigate");
		    }
		    
		}
	}
}
```
