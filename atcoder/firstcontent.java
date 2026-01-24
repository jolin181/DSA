import java.util.*;
public class content {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int f=sc.nextInt();
        int d=sc.nextInt();
        int ans=d-(f%7);
        System.out.println(ans==0?7:ans);
    }
}
