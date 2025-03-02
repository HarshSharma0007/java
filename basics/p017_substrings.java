import java.util.Scanner;

public class p017_substrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your email: ");
        String email = scanner.nextLine();
        if(email.contains("@")){
            String username = email.substring(0,email.indexOf("@"));
            String domain = email.substring(email.indexOf("@")+1);
            System.out.println(username+ " & "+ domain);

        }else{
            System.out.println("Please use @ ");
        }
        scanner.close();
    }
    
}
