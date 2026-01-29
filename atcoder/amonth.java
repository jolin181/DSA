import java.util.*;

public class amonth {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a =sc.nextInt();
        int b=sc.nextInt();
        int ans=(a+b)%12;
        System.out.println(ans==0?12:ans);
    }
}
