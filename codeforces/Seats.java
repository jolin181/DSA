import java.util.*;
public class seats {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int times = sc.nextInt();
        while(times-->0){
            int n=sc.nextInt();
            String s=sc.next();
            int onec=0;
            int i=0;
         for(char ch:s.toCharArray()){
             if(ch=='1')onec++;
         }
            if(onec==0) {
                System.out.println((n+ 2) / 3);
                continue;
            }

           int tot=onec;
            while(i<n){
                if(s.charAt(i)=='1'){
                 i++;
                 continue;
                }
                int j=i;
                while(j<n&&s.charAt(j)=='0')j++;
                int len=j-i;
                int usab=len;
                if(i>0&&s.charAt(i-1)=='1'){
                    usab--;
                }
                if(j<n&&s.charAt(j)=='1'){
                    usab--;
                }
                if(usab>0){
                    tot+=(usab+2)/3;
                }
                i=j;
            }
            System.out.println(tot);

        }
    }
}
