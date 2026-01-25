import java.util.*;

public class revpermu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
            boolean done = false;
            for (int i = 0; i < n && !done; i++) {
                int want = n - i;
                if (arr[i] != want) {
                    int pos = i;
                    while (arr[pos] != want) pos++;
                    reverse(arr, i, pos);
                    done = true;
                }
            }
            for (int x : arr) System.out.print(x + " ");
            System.out.println();
        }
    }
    static void reverse(int[] arr, int l, int r) {
        while (l < r) {
            int temp = arr[l];
            arr[l] = arr[r];
            arr[r] = temp;
            l++;
            r--;
        }
    }
}
