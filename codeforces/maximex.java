import  java.util.*;
public class maximummex {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int times=sc.nextInt();
        while(times-->0){
            int n=sc.nextInt();
            long []arr=new long[n];
            int max=1,count=1;
            for(int i=0;i<n;i++){
                arr[i]= sc.nextLong();

            }
            Arrays.sort(arr);

            for(int i=1;i<n;i++){
                if((arr[i]-arr[i-1])==1){
                    count++;
                }
                else if(arr[i]==arr[i-1]){
                    continue;
                }
                else {
                    max=Math.max(count,max);
                    count=1;
                }
            }
            max = Math.max(count, max);
            System.out.println(max);

        }
    }
}
