import java.util.*;
public class setsub {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int k= sc.nextInt();
        int tot=n;
        int count=0;
        n++;
        while(tot<k){
            tot+=n;
            n++;
            count++;
        }
        System.out.println(count);

    }
}
