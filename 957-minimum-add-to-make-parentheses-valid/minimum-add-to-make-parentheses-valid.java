class Solution {
    public int minAddToMakeValid(String s) {

        int n=s.length();
        int open=0;
        int close=0;
        char a[]=s.toCharArray();
        for(int i=0;i<n;i++){
            if(a[i]=='('){
                open++;
            }else{
                if(open>0){
                    open--;
                }else{
                    close++;
                }
            }

        }
        return open+close;

        
    }
}