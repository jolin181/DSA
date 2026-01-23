import java.util.*;
public class issquare {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        while(n-->0){
            int a1= sc.nextInt();
            int a4= sc.nextInt();
            int a3= sc.nextInt();
            int a2= sc.nextInt();
            if(a1==a4&&a4==a3&&a3==a2){
                System.out.println("YES");
            }
            else {
                System.out.println("NO");
            }
        }

    }
}
