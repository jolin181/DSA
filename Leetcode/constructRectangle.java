class Solution {
    public int[] constructRectangle(int area) {
        int l=area,i=1,w=1;
        int dif= Integer.MAX_VALUE;
        while(i*i<=area){
            if(area%i==0){
                int j=area/i;
                if(j>=i&&(j-i)<dif){
                    dif=j-i;
                    l=j;
                    w=i;
                }
            }
          i++;
        }
        return new int[]{l,w};
        
    }
}
