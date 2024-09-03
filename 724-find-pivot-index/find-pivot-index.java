class Solution {
    public int pivotIndex(int[] nums) {
        int n=nums.length; 
       int sum=0;
       int rightsum=0;
       for(int i=0;i<n;i++){
        sum=sum+nums[i];
       }
       for(int i=0;i<n;i++){
        sum=sum-nums[i];
        if(rightsum==sum){
            return i;
        }
        rightsum +=nums[i];

       }
 
    return -1;
  }
}