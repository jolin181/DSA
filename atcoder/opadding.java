import java.util.*;
public class opadding {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.nextLine();
        String s=sc.nextLine();
        int len=n-s.length();
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<len;i++){
            sb.append("o");
        }
        System.out.println(sb.toString()+s);

    }

}
