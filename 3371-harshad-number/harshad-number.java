class Solution {
    public int sumOfTheDigitsOfHarshadNumber(int x) {
        int z=x;
        int sum=0;
        while(z!=0){
            int temp=z%10;
            sum=sum+temp;
            z=z/10;
        }
        if(x%sum==0){
            return sum;
        }
        return -1;
        
    }
}