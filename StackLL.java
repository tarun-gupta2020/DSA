package Dsa;

import java.util.LinkedList;
import java.util.List;

public class StackLL {
//    MyLinkedList ll=new MyLinkedList();
    List<Integer> ll=new LinkedList<>();

    public void push(int n){
        ll.add(n);
    }

    public void pop() throws Exception {
//        ll.removeLast();
        ll.remove(ll.size()-1);
    }

    public int peek(){
//        ll.showLast();
       return ll.get(ll.size()-1);
    }


    public void display(){
        System.out.println("/////");
        for (int i = ll.size()-1; i>=0; i--) {
            System.out.println("||"+ll.get(i)+"||");
        }
        System.out.println("'''''''");
    }

}
