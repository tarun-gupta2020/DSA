package Dsa;

public class MyQueue {

    Node head,rear;

    public void enqueue(int n){
        Node toAdd=new Node(n);
        if(head==null){
            head=rear=toAdd;
        }

        rear.next=toAdd;
        rear=rear.next;
    }

    public int dequeue(){

        if(head==null){
            return -1;
        }

        Node temp=head;
        head=head.next;

        if(head==null){
            rear=null;
        }

        return temp.data;
    }

}
