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
      rev(head);
    }
    public static void(Node head){
        if(head==null)return;
        rev(head.next);
        System.out.print(head.val);
    }
}
