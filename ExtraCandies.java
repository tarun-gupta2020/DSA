package Dsa;

import java.util.*;

public class ExtraCandies {

    public static List<Boolean> kidsWithCandies(int[] c, int e) {
        List<Boolean> l=new LinkedList<>();
        int k;
        int m=0;
        for (int i = 0; i < c.length; i++) {
            m=Math.max(m,c[i]);
        }
        for (int i = 0; i < c.length; i++) {
            k=c[i]+e;
            l.add(k>=m);
        }

        return l;

    }



    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] c=new int[n];
        for (int i = 0; i < n; i++) {
            c[i]=sc.nextInt();
        }

        int e=sc.nextInt();
        System.out.println(kidsWithCandies(c,e));
    }

}
