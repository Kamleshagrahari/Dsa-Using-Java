class Solution {
    public int strStr(String haystack, String needle) {
        int m=haystack.length();
        int n=needle.length();
        char a[]=haystack.toCharArray();
        char b[]=needle.toCharArray();
        for(int i=0;i<=m-n;i++){
            for(int j=0;j<n;j++){
                if(a[i+j]!=b[j]){
                    break;
                }
                if(j==n-1){
                    return i;
                }
            }
        }
        return -1;
        
    }
}