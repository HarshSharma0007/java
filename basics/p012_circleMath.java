import java.util.Scanner;

public class p012_circleMath {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the radius: ");
        double radius = scanner.nextDouble();

        double circumference  = 2 * Math.PI * radius;
        double area = Math.PI * Math.pow(radius,2);
        double volume = (4.0/3.0) * Math.PI * Math.pow(radius,2);

        System.out.printf("Circumference of the circle with %.1f unit radius is: %.1f unit².\n", radius, circumference);

        System.out.printf("Area of the circle with %.1f unit radius is : %.1f unit.\n",radius,area);
        System.out.printf("Volume of the circle with %.1f unit radius is : %.1f unit³.",radius,volume);
        scanner.close();
    }
}
