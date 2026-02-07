class Solution {
    public List<Integer> spiralOrder(int[][] mat) {
    int row=mat.length,col=mat[0].length;
     int l=0,r=col-1;
     int top=0,bot=row-1;
    
     List<Integer>list=new ArrayList<>();
     
     while(l<=r&&top<=bot){
        for(int i=l;i<=r;i++){
            list.add(mat[top][i]);
        }
        top++;
    
        for(int i=top;i<=bot;i++){
            list.add(mat[i][r]);
        }
        r--;
        if(bot>=top){
        for(int i=r;i>=l;i--){
            list.add(mat[bot][i]);
        }
        bot--;
        }
        if(l<=r){
        for(int i=bot;i>=top;i--){
            list.add(mat[i][l]);
        }
         l++;
        }
       
   
     } 
     return list;  
    }
}
