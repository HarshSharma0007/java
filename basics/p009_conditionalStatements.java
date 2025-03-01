import java.util.Scanner;

public class p009_conditionalStatements {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scanner.nextLine(); 

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        // group 1

        if (name.isEmpty()){
            System.out.println("You didn't entered your name");
        }
        else{
            System.out.println("Hello "+name+"!");
        }
         





        // group 2
        if (age>=18){
            System.out.println("You are an adult.");
        }
        else if (age < 0){
            System.out.println("You haven't been born yet.");
        }
        else if (age==0){
            System.out.println("You are a baby.");
        }
        else if (age>=65){
            System.out.println("You are a Senior.");
        }
        else{
            System.out.println("You are not an adult.");

        }

        scanner.close();
        
    }
    
}
