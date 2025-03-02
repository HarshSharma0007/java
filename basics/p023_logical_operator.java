import java.util.Scanner;

public class p023_logical_operator {
    public static void main(String[] args) {

        double temp =24;
        boolean isSunny = true;
        String username;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your New Username: ");
        username = scanner.nextLine();

        if(username.length()<4||username.length() >12){
            System.out.println("Enter a Username between 4-12 characters.");
        }
        else if(username.contains(" ")|| username.contains("_")){
            System.out.println("Username must not contain spaces or underscores.");

        }
        else{
            System.out.println("Welcome "+username);
        }
        
        if (temp<=30 && temp >=0){
            System.out.print("Nice ");
        }
        
        
        if(temp<=30&&temp>=0&&isSunny){
            System.out.println("Sunny weather.");
        }
        else if(temp<=30&&temp>=0&&!isSunny){
            System.out.println("Cloudy weather.");
        }
        else if(temp>30||temp<0){
            System.out.println("Bad weather!");
        }
        scanner.close();
    }
    
}
