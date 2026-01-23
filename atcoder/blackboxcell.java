import java.util.*;
public class Main {
     public static void main(String[]args){
         Scanner  sc=new Scanner(System.in);
         int p=sc.nextInt();
         int q=sc.nextInt();
         int x=sc.nextInt();
         int y=sc.nextInt();
         if((p<=x&&x<=p+99)&&(q<=y&&y<=q+99)){
             System.out.println("Yes");
         }else{
             System.out.println("No");
         }
     }
}
