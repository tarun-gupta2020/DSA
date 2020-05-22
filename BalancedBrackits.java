package Dsa;

// Java program for checking
// balanced Parenthesis

import java.util.Scanner;
import java.util.Stack;

public class BalancedBrackits{

    public static void main (String[] args) {
        //code
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        sc.nextLine();
        while(t-- !=0){
            String s=sc.nextLine();
            boolean isBalanced=true;
            Stack<Character> st=new Stack<>();
            for(int i=0;i<s.length();i++){
                char ch =s.charAt(i);
                if(ch=='[' || ch=='{' || ch=='('){
                    st.push(ch);
                }

                if(st.isEmpty()){
                    isBalanced=false;
                    break;
                }

                if(ch==')'){
                    if(st.peek()=='('){
                        st.pop();
                    }
                    else{
                        isBalanced=false;
                        break;
                    }
                }

                if(ch=='}'){
                    if(st.peek()=='{'){
                        st.pop();
                    }
                    else{
                        isBalanced=false;
                        break;
                    }
                }

                if(ch==']'){
                    if(st.peek()=='['){
                        st.pop();
                    }
                    else{
                        isBalanced=false;
                        break;
                    }
                }

            }

            if(isBalanced && st.isEmpty()){
                System.out.println("balanced");
            }
            else{
                System.out.println("not balanced");
            }



        }
    }

}