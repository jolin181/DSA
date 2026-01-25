
import java.util.*;
public class pizzatime {
     public static void main(String[] args){
         Scanner sc=new Scanner(System.in);
         int time=sc.nextInt();
         while(time-->0){
             long cur=sc.nextLong();

             System.out.println((cur-1)/2);
         }
     }
}
