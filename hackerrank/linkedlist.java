import java.io.*;
import java.util.*;
class Node{
    int val;
    Node next;
    Node(int d){
        this.val=d;
        this.next=null;
    }
}
public class linkedlist {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);

        Node head=null;
        Node tail=head;
        while(sc.hasNextInt()){
            int val=sc.nextInt();
            Node cur=new Node(val);
            if(head==null){
                head=cur;
                tail=cur;
            }else{
                tail.next=cur;
                tail=cur;
            }
        }
        int num=sc.nextInt();
        Node tem=head;
        int i=0,ans=-1;
        while(tem!=null){
            if(num==tem.val){
                ans=i;
                System.out.println(ans);
                return;

            }
            i++;
            tem=tem.next;

        }
        System.out.println(ans);
    }
}
