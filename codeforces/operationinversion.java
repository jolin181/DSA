import java.util.*;
public class Operationwithinver {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int times=sc.nextInt();
        while(times-->0){
            int count=0;
            int n=sc.nextInt();
            int max= sc.nextInt();
            for(int i=1;i<n;i++){
                int cur= sc.nextInt();
                if(max<=cur){
                    max=cur;
                }else{
                    count++;
                }
            }
            System.out.println(count);
        }

    }
}
