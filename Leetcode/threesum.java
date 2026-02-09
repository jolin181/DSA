class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>>res=new ArrayList<>();
        Arrays.sort(nums);
        int n=nums.length;
        for(int i=0;i<n;i++){
             if(i>0&&nums[i]==nums[i-1]){
                continue;
             }
             int j=i+1,k=n-1;
            while(j<k){
            int sum=nums[i]+nums[j]+nums[k];
             if(sum==0){ 
                 res.add(Arrays.asList(nums[i],nums[j],nums[k]));
            }
            if(sum<0||sum==0){
                int curj=nums[j];
                while(j<n&&curj==nums[j])j++;
            }
            if(sum>0||sum==0){
                int curk=nums[k];
                while(k>=0&&curk==nums[k])k--;
            }
        }
        }
     return res;   
    }
}
