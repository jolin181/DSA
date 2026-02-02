import java.util.Scanner;

public class happybirth {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int x= sc.nextInt();
        int y= sc.nextInt();
        int z= sc.nextInt();
        int num=x-(z*y);
        int de=z-1;
        if(num>=0&&num%de==0){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
}
