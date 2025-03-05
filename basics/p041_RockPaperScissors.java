import java.util.Random;
import java.util.Scanner;
public class p041_RockPaperScissors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        String[] choices = {"rock","paper","scissors"};
        String playerChoice;
        String computerChoices;
        String playAgain = "Yes";
        do{System.out.println("Enter your Choice (Rock ,Paper , Scissors): ");
        playerChoice = scanner.nextLine().toLowerCase();
        if (!playerChoice.equals("rock") &&
        !playerChoice.equals("paper") &&
        !playerChoice.equals("scissors") ){
            System.out.println("Invalid Choices"); 
            continue;
        }
        computerChoices = choices[random.nextInt(3)];
        System.out.println("Computer Choices: "+ computerChoices);

        if(playerChoice.equals(computerChoices)){
            System.out.println("tie");
        }
        else if(playerChoice.equals("rock")&& computerChoices.equals("scissors")||playerChoice.equals("scissors")&& computerChoices.equals("paper")||playerChoice.equals("paper")&& computerChoices.equals("rock")){
            System.out.println("You win");
        }
        else{
            System.out.println("You Lose");
        }
        System.out.println("Do you wanna play yes/no");
        playAgain = scanner.nextLine();
    }while(playAgain.equals("yes"));
    System.out.println("Good Bye");
    scanner.close();
    }
}