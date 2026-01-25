import java.util.*;
public class horserraceop {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int []arr=new int[n];
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<n;i++){
            arr[i]= sc.nextInt();
            map.put(arr[i],i+1);
        }
        Arrays.sort(arr);
        System.out.println(map.get(arr[0])+" "+map.get(arr[1])+" "+map.get(arr[2]));

    }
}
