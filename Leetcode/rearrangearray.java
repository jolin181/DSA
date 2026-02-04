class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n=nums.length;
        int p1=0,p2=1;
        int i=0;
        int []arr=new int[n];
        for(int val:nums){
           if(val>0){
            arr[p1]=val;
            p1+=2;
           }
           else{
            arr[p2]=val;
            p2+=2;
           }
        }
        return arr;
    }
}
