class Solution {
    public int minimumCost(int[] nums) {
      int tot=nums[0];
    int sec=Integer.MAX_VALUE;
    int thir=Integer.MAX_VALUE;
    for(int i=1;i<nums.length;i++){
        if(sec>nums[i]){
            thir=sec;
            sec=nums[i];
        }else if(thir>nums[i]){
            thir=nums[i];
        }
    }
    return tot+thir+sec;

    }
}
