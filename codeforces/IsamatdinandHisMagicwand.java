import java.util.*;
public class IsamatdinandHisMagicwand {
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        int times=sc.nextInt();
        while(times-->0){
        int n = sc.nextInt();
        int[] arr = new int[n];
        int odd=0,even=0;
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            if(arr[i]%2==0)even++;
            else odd++;
        }
        if(even!=0&&odd!=0){
            Arrays.sort(arr);
        }
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
    }

}
