import java.util.Scanner;

public class p011_math {
    public static void main(String[] args) {
        

        // System.out.println(Math.PI);
        // System.out.println(Math.E);

        // double result;

        // result = Math.pow(2,3);

        // result = Math.abs(-5);
        // result = Math.sqrt(9);
        // result = Math.round(3.14);
        // result = Math.ceil(3.14);
        // result = Math.floor(3.99);
        // result = Math.min(10, 20);
        // result = Math.max(10, 20);
        // System.out.println(result);

        
        // HYPOTENUSE c = Math.sqrt(a² + b²)
        
        double a, b, c;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the lenght of side a: ");
        a = scanner.nextDouble();
        System.out.println("Enter the lenght of side b: ");
        b = scanner.nextDouble();


        c = Math.sqrt((Math.pow(a,2)+ Math.pow(b,2)));
        System.out.println("The Hypotenuse is (c = a² + b²): " + c + " cm.");


        scanner.close();
    }
    
}
