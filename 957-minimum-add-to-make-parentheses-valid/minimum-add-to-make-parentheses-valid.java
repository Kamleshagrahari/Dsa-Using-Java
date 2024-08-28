class Solution {
    public int minAddToMakeValid(String s) {
//optimal
        // int n=s.length();
        // int open=0;
        // int close=0;
        // char a[]=s.toCharArray();
        // for(int i=0;i<n;i++){
        //     if(a[i]=='('){
        //         open++;
        //     }else{
        //         if(open>0){
        //             open--;
        //         }else{
        //             close++;
        //         }
        //     }

        // }
        // return open+close;


        // brute force
        int n=s.length();
        Stack<Character> st=new Stack<>();
        for(int i=0;i<n;i++){
            char ch=s.charAt(i);
            if(ch=='('){
                st.push(ch);
            }else{
                if(st.size()>0 && st.peek()=='('){
                    st.pop();
                }else{
                    st.push(ch);
                }
            }
        }
        return st.size();


        
    }
}