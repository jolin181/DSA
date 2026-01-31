import java.util.*;
public class chokutteraddic {

    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int t=sc.nextInt();
        if(n==0)
        {
            System.out.println(t);
            return;
        }
        int tot= sc.nextInt();
        int st=tot+100;
        for(int i=1;i<n;i++){
            int cur= sc.nextInt();
            if(cur>st){
                tot+=cur-st;
                st=cur+100;
            }
        }
        if(st<t){
            tot+=t-st;
        }
        System.out.println(tot);


    }
}
