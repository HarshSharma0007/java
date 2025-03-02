import java.util.Scanner;

public class p024_whileLoops {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String response = "";
        int age=0;


        while(!response.equals("RED PILL")){
            System.out.println("You are inside the Simulation.");
            System.out.println("Enter red pill to exit ");
            response = scanner.nextLine().toUpperCase();
        }
        
        System.out.println("You are the Glitch In the Matrix.");

        do{
            System.out.println("Enter your age: ");
            age = scanner.nextInt();
        }while(age<0);
        System.out.printf("So you are %d years old.", age);

        

        scanner.close();


    }
}
