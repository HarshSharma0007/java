import java.util.Scanner;

public class p034_ArrayInput {
    public static void main(String[] args) {
        String[] foods;
        int size;
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many food items do you wanna enter.");
        size = scanner.nextInt();
        scanner.nextLine();

        foods = new String[size];
        
        for(int i=0; i<foods.length;i++){
            System.out.println("Enter the name of the "+ (i+1) + " Food item: " );
            foods[i] = scanner.nextLine();
        }

        for(String food:foods){
            System.out.println(food);
        }



        scanner.close();
        
    }
}
