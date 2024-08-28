class Solution {
    public String countAndSay(int n) {
        if(n==1){
            return "1";
        }
       String s= countAndSay(n-1);
        int count=0;
        // String res="";
        StringBuilder res=new StringBuilder();
        for(int i=0;i<s.length();i++){
            
            count++;
            if( i==s.length()-1 ||s.charAt(i)!=s.charAt(i+1) ){
                // res=res+count+s.charAt(i);
                res=res.append(count).append(s.charAt(i));
                count=0;
            }

        }
        return res.toString();
        
    }
}