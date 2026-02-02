import java.util.*;

public class hugepile {

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int time=sc.nextInt();
        while(time-->0){
            int n= sc.nextInt();
            int k= sc.nextInt();
            if (k > n) {
                System.out.println(-1);
                continue;
            }
            int div=1,f=0;
           for(int i=0;i<=31;i++){
               int low=n/div;
               int high=(n+div-1)/div;
               if(low<=k&&high>=k){
                   System.out.println(i);
                   f=1;
                   break;
               }
               div*=2;
           }
           if(f==0)System.out.println(-1);

        }
    }

}
