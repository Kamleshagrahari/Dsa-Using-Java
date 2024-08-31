//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            int N = Integer.parseInt(read.readLine());

            Solution ob = new Solution();
            System.out.println(ob.checkPerfectSquare(N));
        }
    }
}
// } Driver Code Ends


//User function Template for Java
class Solution {
    static int checkPerfectSquare(int N) {
        // Edge case for negative numbers
        if (N < 0) {
            return 0;
        }

        // Calculate the integer square root
        int sqrt = (int) Math.sqrt(N);
        
        // Check if the square of this integer root is equal to the original number
        if (sqrt * sqrt == N) {
            return 1;
        } else {
            return 0;
        }
    }
}
