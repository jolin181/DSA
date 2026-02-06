class Solution {
    public int findDuplicate(int[] nums) {
        int s=nums[0];
        int f=nums[0];
        while(true){
            s=nums[s];
            f=nums[nums[f]];
            if(s==f)break;
        }
        int s2=nums[0];
        while(s2!=s){
            s=nums[s];
            s2=nums[s2];
        }
        return s2;
    }
}
