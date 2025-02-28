import java.util.Scanner;

public class p004_scanner_common_issue {
    public static final String RESET = "\u001B[0m";  // Reset color
    public static final String RED = "\u001B[31m";   // Red text
    public static final String GREEN = "\u001B[32m"; // Green text
    public static final String BLUE = "\u001B[34m";
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
// common issue
        System.out.println("Enter your age");
        int age = scanner.nextInt();
        scanner.nextLine(); // fixed

        System.out.println("Enter your favourite color.");
        String color = scanner.nextLine();

        System.out.println("You are " + age + " years old.");
        System.out.println("You like the color " + color);

        scanner.close();

    }
    
}
