class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        List<List<Integer>> res=new ArrayList<>();
        int min=Integer.MAX_VALUE;
        Arrays.sort(arr);
        for(int i=1;i<arr.length;i++){
            int dif=arr[i]-arr[i-1];
            if(dif<min){
                min=dif;
            }
        }
        for(int i=1;i<arr.length;i++){
              int dif=arr[i]-arr[i-1];
              if(dif==min){
                List<Integer>pair=new ArrayList<>();
                pair.add(arr[i-1]);
                pair.add(arr[i]);
                res.add(pair);
              }
        }
        return res;

    }
}
