import java.util.Scanner;

public class hugepile {
    static int ans;
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int time=sc.nextInt();
        while(time-->0){
            int n= sc.nextInt();
            int k= sc.nextInt();
            ans=Integer.MAX_VALUE;
            find(n,k,0);
            if(ans==Integer.MAX_VALUE){
                System.out.println(-1);
            }
            else{
                System.out.println(ans);
            }
        }
    }
   public static void find(int n,int k,int count){
        if(n<k)return ;
        if(n==k){
            ans=Math.min(count,ans);
            return;
        }
       int f=n/2;
       int s=n-f;
        find(f,k,count+1);
        find(s,k,count+1);

   }
}
