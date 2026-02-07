class Solution {
    public void rotate(int[][] matrix) {
        int row=matrix.length;
        int col=matrix[0].length;
        for(int i=0;i<row;i++){
            for(int j=0;j<i;j++){
                int tem=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=tem;
            }
        }
    
        for(int k=0;k<row;k++){
            int i=0,j=col-1;
            while(i<j){
                int tem=matrix[k][i];
                matrix[k][i]=matrix[k][j];
                matrix[k][j]=tem;
                i++;
                j--;
            }
        }
        
    }
}
