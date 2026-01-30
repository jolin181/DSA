import java.util.*;
public class ACount {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int count=0;
        for(char ch:s.toCharArray()){
            if(ch=='i'||ch=='j'){
                count++;
            }
        }
        System.out.println(count);


    }
}
