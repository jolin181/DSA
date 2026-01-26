class Solution {
    public boolean isToeplitzMatrix(int[][] matrix) {
        int r=matrix.length;
        int c=matrix[0].length;
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                int x=i-1;
                int y=j-1;
                if(x>=0&&y>=0&&matrix[i][j]!=matrix[x][y]){
                      return false;
                }
            }  
        }
        return true;
    }
 
}
