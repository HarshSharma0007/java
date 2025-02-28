import java.util.Scanner;

public class p003_scanner {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your name please: ");
        String name = scan.nextLine();

        System.out.println("Enter your Age please: ");
        int age = scan.nextInt();

        System.out.println("Enter your GPA: ");
        double gpa = scan.nextDouble();

        System.out.println("Are you a student");

        boolean isStudent = scan.nextBoolean();



        System.out.println("hello " + name);
        System.out.println("You are "+ age+" years old.");
        System.out.println("Your gpa is "+ gpa);

        if(isStudent){
            System.out.println("You are enrolled as student in the course.");


        }
        else{
            System.out.println("You are NOT enrolled as student in the course.");
        }

        scan.close();
    }
    
}