class Solution {
    public int rob(int[] nums) {
        if(nums.length<2)return nums[0];
        int []arr=new int[nums.length];
        int p1=nums[0];
        int p2=nums[0]>nums[1]?nums[0]:nums[1];
        for(int i=2;i<nums.length;i++){
            int tem=Math.max(p1+nums[i],p2);
            p1=p2;
            p2=tem;
        }
        return p2;
    
    }
}
