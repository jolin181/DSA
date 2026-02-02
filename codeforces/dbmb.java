import java.util.*;
public class dbmb{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int time=sc.nextInt();
        while(time-->0){
            int n=sc.nextInt();
            int s=sc.nextInt();
            int x=sc.nextInt();
            int tot=0;
            for(int i=0;i<n;i++){
                tot+=sc.nextInt();
            }
            if(tot>s){
                System.out.println("NO");
                continue;
            }
            int sub=s-tot;
            System.out.println(sub%x==0?"YES":"NO");
        }
    }
}
