import java.util.*;

public class prefixmax {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int times=sc.nextInt();
        while(times-->0){
            int n= sc.nextInt();
            int max=Integer.MIN_VALUE;
            for(int i=1;i<=n;i++){
                int cur= sc.nextInt();
                if(cur>max){
                    max=cur;
                }
            }
            System.out.println(max*n);
        }
    }
}
