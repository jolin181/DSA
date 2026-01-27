import java.util.*;
public class twolanguages {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int m= sc.nextInt();
       sc.nextLine();
        String s= sc.nextLine();
        String t= sc.nextLine();
        int q=sc.nextInt();
        sc.nextLine();
        while(q-->0){
            boolean okS = true;
            boolean okT = true;
            String cur=sc.nextLine();
            for (char c : cur.toCharArray()) {
                if (s.indexOf(c) == -1) okS = false;
                if (t.indexOf(c) == -1) okT = false;
            }


            if(okS&&!okT){
                System.out.println("Takahashi");
            }
            else if(!okS&&okT){
                System.out.println("Aoki");
            }
            else{
                System.out.println("Unknown");
            }
        }

    }
}
