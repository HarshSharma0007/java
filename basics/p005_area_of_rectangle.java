import java.util.Scanner;

public class p005_area_of_rectangle {
    public static void main(String[] args) {
        

        double width = 0;
        double height = 0;
        double area = 0;

        Scanner scanner  = new Scanner(System.in);

        System.out.println("Enter the width: ");
        width = scanner.nextDouble();


        System.out.println("Enter the height: ");
        height = scanner.nextDouble();
        area = width*height;

        System.out.println("The area is: " + area + " cm²"); // by numlock + alt + 0178
        scanner.close();
    }
    
}
