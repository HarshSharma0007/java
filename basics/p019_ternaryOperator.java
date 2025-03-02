import java.util.Scanner;

public class p019_ternaryOperator {
    public static void main(String[] args) {
        int score;
        Scanner scanner  = new Scanner(System.in);
        System.out.print("Enter the score: ");
        score = scanner.nextInt();

        String evenOrOdd = (score % 2 == 0) ? "Even":"Odd";

        System.out.println(evenOrOdd);
        int hours =13;
        String timeOfDay = (hours<12) ? "AM" : "PM";
        System.out.println(timeOfDay);
        scanner.close();
    }
}
