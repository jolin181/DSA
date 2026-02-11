class Solution {
    public int[][] merge(int[][] intervals) {
        if (intervals.length == 0) return new int[0][0];

        Arrays.sort(intervals,(a,b)->a[0]-b[0]);
        int n=intervals.length;

        List<int[]>list=new ArrayList<>();

        for(int i=0;i<n;i++){

            int st=intervals[i][0];
            int end=intervals[i][1];

            if(list.isEmpty()){
                  list.add(new int[]{st,end});
            }

            else if(!list.isEmpty()){
                int []back=list.get(list.size()-1);
                int lastend=back[1];

                if(lastend<st){
                    list.add(new int[]{st,end});
                }
                 else{
                      list.set(list.size()-1,new int[]{back[0],Math.max(end,lastend)});
                  }
            } 
        }
       return list.toArray(new int[list.size()][]);
        
    }
}
