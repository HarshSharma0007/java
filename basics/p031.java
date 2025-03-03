import java.util.Scanner;

public class p031 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double balance=10;
        boolean isRunning = true;
        int choice;
        while(isRunning){
            // menu
        System.out.println("********************");
        System.out.println("Banking System");
        System.out.println("********************");
        System.out.println("1. Show balance");
        System.out.println("2. Deposit");
        System.out.println("3. Withdraw");
        System.out.println("4. Exit");
        System.out.println("********************");

        System.out.print("Enter your choice (1-4):");
        choice = scanner.nextInt();

        switch (choice) {
            case 1-> showBalance(balance);
            case 2-> showBalance(balance);
            case 3-> showBalance(balance);
            case 4-> isRunning=false;
            default-> System.out.println("invalid choice");
        }

        }

    
        scanner.close();
        
    }
    static void showBalance(double balance){
        System.out.printf("%.2f",balance);
    }

    
}