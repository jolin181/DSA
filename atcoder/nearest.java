import java.util.*;
public class Nearest {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
       int n= sc.nextInt();

       int[]arr=new int[n];
       for(int i=0;i<n;i++) {
           arr[i] = sc.nextInt();
       }

       for(int i=0;i<n;i++){
           int count=-1;
           for(int j=i-1;j>=0;j--){
               if(arr[j]>arr[i]){
                   count=j+1;
                   break;
               }
           }
           System.out.println(count);
       }
    }
}
