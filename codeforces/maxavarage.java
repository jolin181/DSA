import java.util.*;

public class maxaverage {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int times=sc.nextInt();
        while(times-->0){
            int n=sc.nextInt();
            int max=Integer.MIN_VALUE;
            for(int i=0;i<n;i++){
                int cur=sc.nextInt();
                max=Math.max(cur,max);
            }
            System.out.println(max);
        }
    }
}
