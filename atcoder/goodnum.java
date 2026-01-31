
import java.util.*;

public class goodnum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
     List<Integer>list =new ArrayList<>();
        for(int cur=5;cur<=n;cur++){
        for (int i = 1; i < cur; i++) {
            for (int j = i + 1; j <= cur; j++) {
                if (((i * i) + (j * j)) == cur) {
                    count++;
                    list.add(cur);
                }
            }
        }
    }
        System.out.println(count);
        for(int x:list) {
            System.out.print(x + " ");
        }
    }
}
