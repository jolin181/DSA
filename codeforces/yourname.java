
import java.util.*;
public class yourname {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        while(n-->0){
            int len=sc.nextInt();
            String s= sc.next();
            String t=sc.next();
            int []arr=new int[26];
            for(int i=0;i<len;i++){
                arr[s.charAt(i)-'a']++;
                arr[t.charAt(i)-'a']--;
            }
            int f=1;
            for(int x:arr){
                if(x!=0){
                    f=0;
                    break;
                }
            }
            System.out.println((f==1)?"YES":"NO");
        }
    }
}
