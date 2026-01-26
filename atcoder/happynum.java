import java.util.*;
public class happy {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        HashSet<Integer>set=new HashSet<>();
        while(n!=1&&!set.contains(n)){
            set.add(n);
            int cur =n;
            int tot=0;
            while(cur>0){
                int unit=cur%10;
                tot+=unit*unit;
                cur/=10;
            }
            n=tot;
        }
        System.out.println((n==1)?"Yes":"No");
    }
}
