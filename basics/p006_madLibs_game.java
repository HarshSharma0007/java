import java.util.Scanner;

public class p006_madLibs_game {
    public static void main(String[] args) {
        

        Scanner scanner = new Scanner(System.in);
        String adjective1, noun1, adjective2, verb1, adjective3 ;


        System.out.println("Enter an adjective (description): ");
        adjective1 = scanner.nextLine();
        System.out.println("Enter a noun (animal/person): ");
        noun1 = scanner.nextLine();
        System.out.println("Enter an adjective (description): ");
        adjective2 = scanner.nextLine();
        System.out.println("Enter a verb end with -ing (action): ");
        verb1 = scanner.nextLine();
        System.out.println("Enter an adjective (description): ");
        adjective3 = scanner.nextLine();


        System.out.println("\nToday I went to a " + adjective1 + " zoo.");
        System.out.println("In an exhibit, I saw a " + noun1 + "." );
        System.out.println(noun1 + " was " + adjective2 + " and " + verb1 + "!");
        System.out.println("I was " + adjective3 + "!");

        scanner.close();

    }
    
}
