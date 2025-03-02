import java.util.Random;
import java.util.Scanner;
public class p025_guessRandomNumbers {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int guess;
        int min = 1;
        int max = 10;
        int attempts=0;
        int randomNumber = random.nextInt(min,max+1);
        System.out.println("Number Guessing Game\nGuess a number between 1-10: ");
        do{
            System.out.println("Enter your Guess");
            guess = scanner.nextInt();
            attempts++;
            if(guess<randomNumber){
                System.out.println("Too Low! Try Again");
            }
            else if(guess > randomNumber){
                System.out.println("Too High! Try Again");
            }
        }
        while(guess != randomNumber);
        System.out.println("You won with net attempts = "+ attempts);
        scanner.close();
    }   
}