class Solution {
    public int longestPalindromeSubseq(String s) {
     String revstr = new StringBuilder(s).reverse().toString();
     int N=s.length();

        int[][]dp=new int[N+1][N+1];
        for(int i=1;i<=N;i++){
             for(int j=1;j<=N;j++){
                if(revstr.charAt(i-1)==s.charAt(j-1)){
                        dp[i][j]+=dp[i-1][j-1]+1;
                }
                else{
                    dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
                }
            }
        }
        
        return dp[N][N];
    }
}
