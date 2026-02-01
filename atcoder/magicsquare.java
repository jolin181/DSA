import java.util.Scanner;

public class Magicsquare {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[][]mat=new int[n][n];
        int r=0,c=(n-1)/2;
        mat[r][c]=1;
        int count=2;
        while(count<=n*n){
            int str=(r-1)%n;
            int stc=(c+1)%n;
            str=(str==-1)?n-1:str;
            if(mat[str][stc]!=0){
                str=(r+1)%n;
                stc=c;
                mat[str][stc]=count;
            }else{
                mat[str][stc]=count;
            }
            count++;
            r=str;
            c=stc;
        }
       for(int i=0;i<n;i++){
           for(int j=0;j<n;j++){
               System.out.print(mat[i][j]+" ");
           }
           System.out.println();
       }

    }
}
