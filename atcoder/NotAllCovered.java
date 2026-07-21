
import java.util.Scanner;

public class NotAllCovered {
    public static  void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int m=sc.nextInt();
        int[]que=new int[n+2];
        for(int i=0;i<m;i++){
            int l=sc.nextInt();
            int r=sc.nextInt();
            que[l]++;
            que[r+1]--;
        }

        int sum=0;
        int min=Integer.MAX_VALUE;
        for(int i=1;i<=n;i++){
            sum+=que[i];
            min=Math.min(min,sum);

        }
        System.out.println(min);
    }
}
