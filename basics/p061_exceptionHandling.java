import java.util.InputMismatchException;
import java.util.Scanner;

public class p061_exceptionHandling {
    public static void main(String[] args) {

        // Scanner scanner = new Scanner(System.in);

        // Instead use this
        try(Scanner scanner = new Scanner(System.in)){
            System.out.println("Enter the Dividend: ");
            double dividend = scanner.nextDouble();
            System.out.println("Enter the Divisor");
            double divisor = scanner.nextDouble();
            System.out.println("Result: " + dividend/divisor);
        }
        catch(InputMismatchException e){
            System.out.println("Not a Number!!");
        }
        catch(ArithmeticException e){
            System.out.println("Cannot Divide By ZERO!!");
        }
        catch(Exception e){
            // SAFETY NET
            System.out.println(
                "Something Went wrong."
            );
        }
        finally{
            System.out.println("Finally will run it whatever happens!");
        }


        
    }
    
}
