import java.lang.reflect.Array;
import java.util.Arrays;

public class p033_arrays {
    public static void main(String[] args) {
        String[] fruits = { "banana","apple", "orange"};
        /// fruits[0] = "pineapple";
        // int numOfFruits = fruits.length;

        // System.out.println(numOfFruits);

        // for (int i = 0; i < fruits.length; i++) {
        //     System.out.println(fruits[i]);
        // }

        Arrays.sort(fruits);

        // Arrays.fill(fruits,"pineapple");

        for(String fruit : fruits){
            System.out.println(fruit);

        }
    }
}
