import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class p060_ArrayList {

    public static void main(String[] args) {
        // ArrayList
        // arrays are fixxed in sixe but ArrauList are not!!

        // ArrayList<Double> list = new ArrayList<>();

        // list.add(3.32);
        // list.add(1.);
        // list.add(23.2);


        // // list.remove(0);
        // list.set(0, 66.);

        // // System.out.println(list.get(0));

        // // System.out.println(list.size());


        // Collections.sort(list);

        // System.out.println(list);

        // for(double d:list){
        //     System.out.println(d);
        // }

        Scanner scanner = new Scanner(System.in);
        ArrayList<String> foods = new ArrayList<>();

        System.out.println("Enter the no. of food items: ");
        int numofFood = scanner.nextInt();

        scanner.nextLine();
        for (int i = 1; i <= numofFood; i++) {
            System.out.println("enter "+ i + " food name: ");
            String food = scanner.nextLine();
            foods.add(food);
            
        }

        System.out.println(foods);
        scanner.close();
    }
}