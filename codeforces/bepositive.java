import java.util.*;
public class bepositive {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int times= sc.nextInt();
        while(times-->0){
            int n=sc.nextInt();
            int tot=0,odd=0;
            while(n-->0){
                int cur= sc.nextInt();
                if(cur==0){
                    tot++;
                }
                else if(cur==-1) {
                    odd++;
                }
            }
            if(odd%2!=0){
                tot+=2;
            }
            System.out.println(tot);
        }

    }
}
