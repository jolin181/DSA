import java.util.*;
public class replaceansum {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int times=sc.nextInt();
        while(times-->0){
            int n= sc.nextInt();
            int q= sc.nextInt();
            int []a=new int[n];
            int []b=new int[n];
            for(int i=0;i<n;i++){
                a[i]=sc.nextInt();
            }
            for(int i=0;i<n;i++){
                b[i]= sc.nextInt();
            }
            int []res=new int[n];
            res[n-1]=Math.max(a[n-1],b[n-1]);
            for(int i=n-2;i>=0;i--){
               res[i]=Math.max(Math.max(a[i],b[i]),res[i+1]);
            }
            for(int i=1;i<n;i++){
                res[i]+=res[i-1];
            }
            while(q-->0){
                int l= sc.nextInt();
                int r= sc.nextInt();
                l--;
                r--;
                int tot= res[r] - (l>0 ? res[l-1] : 0);
                System.out.print(tot+" ");
            }
            System.out.println();
        }
    }
}
