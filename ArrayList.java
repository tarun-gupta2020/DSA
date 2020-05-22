package Dsa;

import java.util.List;

public class ArrayList {
    public static void main(String[] args) {
        List<String> fruits =new java.util.ArrayList<>();
        List<String> veg =new java.util.ArrayList<>();
        fruits.add("Mango");
        fruits.add("Apple");
        fruits.add("Pineapple");
        fruits.add("Watermelon");

        veg.add("tomato");
        veg.add("potato");
        veg.add("carrot");
        veg.add("peas");

        fruits.addAll(veg);


        System.out.println(fruits);
        System.out.println(fruits.get(3));

    }
}
