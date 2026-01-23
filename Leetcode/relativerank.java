class Solution {
    public String[] findRelativeRanks(int[] score) {
        int[]arr=score.clone();;
        Arrays.sort(arr);
        int len=arr.length;
        String[]ans=new String[len];
        HashMap<Integer,String>map=new HashMap<>();
        if(len>=1)map.put(arr[len-1],"Gold Medal");
       if(len>=2) map.put(arr[len-2],"Silver Medal");
        if(len>=3)map.put(arr[len-3],"Bronze Medal");
        for(int i=len-4;i>=0;i--){
            map.put(arr[i],String.valueOf(len-i));
        }
        for(int i=0;i<len;i++){
          ans[i]=map.get(score[i]);
        }
        return ans;
    }
}
