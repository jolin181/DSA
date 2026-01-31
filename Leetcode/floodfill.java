class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        Stack<int[]> st = new Stack<>();
        int r=image.length;
        int c=image[0].length;
        
        int stc = image[sr][sc];
        if (stc == color) return image;
         image[sr][sc] = color;
         st.push(new int[]{sr,sc});
        int []dx={0,-1,0,1};
        int []dy={-1,0,1,0};
        while(!st.isEmpty()){
                int []cur=st.pop();
                for(int k=0;k<4;k++){
                    int x=cur[0]+dx[k];
                    int y=cur[1]+dy[k];
                    if(x>=0&&y>=0&&x<r&&y<c&&image[x][y]==stc){
                        image[x][y]=color;
                        st.push(new int[]{x,y});
                    }
                
            }
        }
        return image;   
    }

}
