package Dsa;

public class MyLinkedList {
    Node head;
    public void add(int x){
        Node n=new Node(x);

        n.next=null;

        if (isEmpty()){
            head=n;
        }
        else {
            Node temp=head;
            while(temp.next!=null){
                temp=temp.next;
            }
            temp.next=n;
        }


    }

    public boolean isEmpty(){
        return head==null;
    }

    public void removeLast() throws Exception{
        Node temp=head;

        if(temp==null){
            throw new Exception("List ia empty Cannot remove");
        }

        if(temp.next==null){
            head=null;
        }
        else {
            while (temp.next.next!=null){
                temp=temp.next;
            }
            temp.next=null;
        }


    }

    public void show(){
        Node n=head;
        while (n.next!=null){
            System.out.print(n.data+" ");
            n=n.next;
        }
        System.out.print(n.data);
    }

    public void showLast(){
        Node n=head;
        while (n.next!=null){
            n=n.next;
        }
        System.out.print(n.data);
    }

}


class Node{

    public Node(int n){
        this.data=n;
    }

    int data;
    Node next;
}
