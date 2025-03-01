import java.util.Scanner;

public class p014_compoundInterest {
    public static void main(String[] args) {
        // compound interest calculator


        Scanner scanner = new Scanner(System.in);

        double principal, rate, amount;
        int years, timesCompounded;


        System.out.print("Enter the principal amount: ");
        principal = scanner.nextDouble();

        System.out.print("Enter the interest rate (in %): ");
        rate = scanner.nextDouble() / 100;

        System.out.print("Enter the # of times compounded per year: ");
        timesCompounded = scanner.nextInt();

        System.out.print("Enter the # of years: ");
        years = scanner.nextInt();

        amount = principal  * Math.pow(1+rate/timesCompounded, timesCompounded * years);

        System.out.printf("The amount after %d is: $%.2f",years, amount);






















        scanner.close();



    }
    
}
