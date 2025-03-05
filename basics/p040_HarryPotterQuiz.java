import java.util.Scanner;

public class p040_HarryPotterQuiz {
    public static void main(String[] args) {

        String[] questions = {
            "What is the name of Harry Potter’s mum?",
            "What is the 2nd Harry Potter book and movie called?",
            "What is the name of Ron’s sister?",
            "Who was the prisoner of Azkaban?",
            "Who was not one of The Marauders?"
        };

        String[][] options = {
            {
                "1. Poppy", 
                "2. Lily",
                "3. Daisy", 
                "4. Cherry"
            },
            {
                "1. Harry Potter and the Order of the Phoenix",
                "2. Harry Potter and the Chamber of Secrets",
                "3. Harry Potter and the Prisoner of Azkaban",
                "4. Harry Potter and the Goblet of Fire"
            },
            {
                "1. Romilda",
                "2. Pomona",
                "3. Ginni",
                "4. Pansy"
            },
            {
                "1. Sirius Black",
                "2. James Potter",
                "3. Peter Pettigrew",
                "4. Remus Lupin"
            },
            {
                "1. Remus Lupin",
                "2. Peter Pettigrew",
                "3. James Potter",
                "4. Severus Snape"
            },

        };
    int[] answers = {2, 2,3,1,4};
    int score = 0;
    int guess;

    Scanner scanner = new Scanner(System.in);

    System.out.println("Welcome to the Harry Potter Quiz");

    for (int i = 0; i < questions.length; i++) {
        System.err.println(questions[i]);
        for(String option:options[i]){
            System.out.println(option);
        }
        System.out.println("Enter your guess: ");
        guess = scanner.nextInt();
    
        if (guess == answers[i]){
            System.out.println("Correct");
            score++;
        }
        else{
            System.out.println("Wrong");
    
        }
    }
    System.out.println("Your final Score is: " + score + " out of "+ questions.length);
    scanner.close();
        
    }
}
