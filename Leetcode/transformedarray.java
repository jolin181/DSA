class Solution {
    public int[] constructTransformedArray(int[] nums) {
        int n=nums.length;
        int []res=new int[n];
        for(int i=0;i<n;i++){
         int ind=(nums[i]+i)%n;
         if(ind<0){
            ind=n+ind;

         }
            res[i]=nums[ind];
        }
        return res;
        
    }
}
