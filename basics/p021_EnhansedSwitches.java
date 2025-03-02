import java.util.Scanner;

public class p021_EnhansedSwitches {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the day of the week: ");
        String day = scanner.nextLine();

        switch (day) {
            case "Monday","Tuesday" ,"Wednesday" , "Thursday" ,"Friday" -> System.out.println("It is Weekday");
            case "Saturday", "Sunday" -> System.out.println("It is WeekEnd");
            default -> System.out.println((day + " not a day"));
        }
        scanner.close();
    }
    
}
