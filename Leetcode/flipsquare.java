class Solution {
    public int[][] reverseSubmatrix(int[][] grid, int x, int y, int k) {
        int r=grid.length,c=grid[0].length;
        int j=y;
        int jend=y+k;
       while((j<jend)){
        int i=x,end=x+k-1;
        while(i<end){
            int tem=grid[i][j];
            grid[i][j]=grid[end][j];
            grid[end][j]=tem;
            i++;
            end--;
        }
        j++;
       }
        return grid;
    }
}
