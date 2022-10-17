/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    try{
    		int t = nextInt();
    		while(t-->0){
    		    int n = nextInt();
    		    int m = nextInt();
    		    int A[][]=new int[n][m];
    		    Queue<ArrayList<Integer>> que = new LinkedList<>();
    		    int max = 1;
    		    for(int i=0;i<n;i++){
    		        for(int j=0;j<m;j++){
    		            A[i][j]= nextInt();
    		            max= Math.max(A[i][j], max);
    		        }
    		    }
    		    for(int i=0;i<n;i++){
    		        for(int j=0;j<m;j++){
    		            if(A[i][j]==max){
    		                que.add(new ArrayList<Integer>(Arrays.asList(i,j,0)));
    		            }
    		        }
    		    }
    		    int ans = 0;
    		    while(!que.isEmpty()){
    		        //System.out.println(que);
    		        ArrayList<Integer> current = que.remove();
    		        int i = current.get(0);
    		        int j = current.get(1);
    		        int hour = current.get(2);
    		        ans = Math.max(ans, hour);
    		        //Edges
    		        if(i>0 &&A[i-1][j]!=max){
    		            que.add(new ArrayList<Integer>(Arrays.asList(i-1,j,hour+1)));   
    		            A[i-1][j]= max;
    		        }
    		        if(i<n-1 &&A[i+1][j]!=max){
    		            que.add(new ArrayList<Integer>(Arrays.asList(i+1,j,hour+1)));  
    		            A[i+1][j]= max;
    		        }
    		        if(j>0 &&A[i][j-1]!=max){
    		            que.add(new ArrayList<Integer>(Arrays.asList(i,j-1,hour+1)));   
    		            A[i][j-1]= max;
    		        }
    		        if(j<m-1 &&A[i][j+1]!=max){
    		            que.add(new ArrayList<Integer>(Arrays.asList(i,j+1,hour+1)));   
    		            A[i][j+1]= max;
    		        }
    		        
    		        //Corners
    		        if(i>0 && j>0 &&A[i-1][j-1]!=max){
    		            que.add(new ArrayList<Integer>(Arrays.asList(i-1,j-1,hour+1)));   
    		            A[i-1][j-1]= max;
    		        }
    		        if(i<n-1 && j<m-1 &&A[i+1][j+1]!=max){
    		            que.add(new ArrayList<Integer>(Arrays.asList(i+1,j+1,hour+1)));  
    		            A[i+1][j+1]= max;
    		        }
    		        if(j>0 && i<n-1 &&A[i+1][j-1]!=max){
    		            que.add(new ArrayList<Integer>(Arrays.asList(i+1,j-1,hour+1)));   
    		            A[i+1][j-1]= max;
    		        }
    		        if(j<m-1 && i>0 && A[i-1][j+1]!=max){
    		            que.add(new ArrayList<Integer>(Arrays.asList(i-1,j+1,hour+1)));   
    		            A[i-1][j+1]= max;
    		        }
    		    }
    		    bw.write(ans+"\n");
    		}
    		bw.flush();
    		} catch (Exception e) {
                e.printStackTrace();
            }
		}
	
	// Fast I/O 
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st = null;
    static int mod=1000000007;
    static boolean prime[]=new boolean[10000001];

    static String next() {
        while (st == null || !st.hasMoreElements()) {
            try {
                st = new StringTokenizer(br.readLine());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return st.nextToken();
    }
    
    static int nextInt() {
        return Integer.parseInt(next());
    }
    
    static long nextLong() {
        return Long.parseLong(next());
    }

    static double nextDouble() {
        return Double.parseDouble(next());
    }
}