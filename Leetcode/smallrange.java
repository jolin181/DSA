class Solution {
    public int smallestRangeI(int[] nums, int k) {
        if(nums.length<=1)return 0;
        int max=nums[0];
        int min=nums[0];
       
        for(int i=1;i<nums.length;i++){
            int n=nums[i];
              if(n<min){
                min=n;
            }
           if(n>max){
                max=n;
            } 
        }
        int dif=max-min;
        if(dif<=(2*k)){
            return 0;
        }
        return dif-(2*k);
    }
}
