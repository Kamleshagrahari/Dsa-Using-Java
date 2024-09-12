//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) throws IOException{
	    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	    StringTokenizer st=new StringTokenizer(br.readLine());
	    int t=Integer.parseInt(st.nextToken());
	    while(t-->0){
	        String s=br.readLine();
	        
	        Solution obj = new Solution();
	        
	        System.out.println(obj.findSum(s));
	    }
		
	}
}

// } Driver Code Ends



class Solution
{
    // Function to calculate the sum of all numbers present in a string.
    public static long findSum(String str)
    {
        long sum = 0;  // Use long to handle larger sums
        long num = 0;  // Use long for the current number
        int n = str.length();
        
        for (int i = 0; i < n; i++)
        {
            char ch = str.charAt(i);
            
            if (ch >= '0' && ch <= '9')  // Check if the character is a digit
            {
                num = num * 10 + (ch - '0');  // Convert char to int and build the number
            }
            else
            {
                sum += num;  // Add the current number to the sum
                num = 0;     // Reset num for the next potential number
            }
        }
        
        // Add the last number to the sum if there was no non-digit character at the end
        sum += num;
        
        return sum;
    }
}
