import java.util.*;
public class Onlyonedigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int times= sc.nextInt();
        while(times-->0){
        int x = sc.nextInt();
        int min = x % 10;
        x /= 10;
        while (x > 0) {
            min=Math.min(min,x%10);
            x /= 10;
        }
        System.out.println(min);
    }
}
}
