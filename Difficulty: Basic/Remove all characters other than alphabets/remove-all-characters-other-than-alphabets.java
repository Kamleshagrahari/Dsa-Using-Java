//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim()); //Inputting the testcases
        while(t-->0){
            String S = br.readLine();
            Solution ob = new Solution();
            System.out.println(ob.removeSpecialCharacter(S));
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution{
    String removeSpecialCharacter(String s) {
        // code here
        StringBuilder ans=new StringBuilder();
        int flag=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if((ch>='a'&& ch<='z')||(ch>='A' && ch<='Z')){
                ans.append(ch);
                flag=1;
            }
        }
        if(flag==1){
          return ans.toString();
        }else{
            return "-1";
        }
    }
}