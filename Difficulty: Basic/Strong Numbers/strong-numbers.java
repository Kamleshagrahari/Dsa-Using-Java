//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int N = Integer.parseInt(read.readLine());

            Solution ob = new Solution();
            System.out.println(ob.isStrong(N));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    static int isStrong(int N) {
        // code here
    
        int z=N;
        int sum=0;
        while(z!=0){
            int temp=z%10;
            int a=fact(temp);
            sum=sum+a;
            z=z/10;
            
        }
        if(sum==N){
            return 1;
        }else{
            return 0;
        }
    }
 static int fact(int n){
        if(n==0 || n==1){
            return 1;
        }
        return n*fact(n-1);
    }
};