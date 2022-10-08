**Java Code**

```
/*package codechef; // don't place package name!*/

import java.util.*;
import java.lang.*;
import java.io.*;

/*Name of the class has to be "Main" only if the class is public.*/
class Codechef
{
 public static void main (String[] args) throws java.lang.Exception
 {
  // your code goes here
  
  Scanner sc = new Scanner(System.in);
  int t= sc.nextInt();
  while(t-- > 0){
      int n = sc.nextInt();
      int nums[] = new int[n];
      for(int i=0;i<n;i++){
          nums[i]= sc.nextInt();
      }
     
      int count=0;
      for(int i=0;i < n;i++){
          int start = 0;
          int end =0;
          
          for(int j=0;j < n;j++){
              if(nums[j] <= nums[i]){
                  start++;
              }
              else{
                  end++;
              }
              
          }
          if(start > end){
              count++;
          }
      }
      System.out.println(count);
  }
 }
}
```
