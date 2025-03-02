import java.util.Scanner;

public class p018_weightConversion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double weight, newWeight;
        int choice;
        System.out.println("Weight Conversion Program");
        System.out.println("1: Convert lbs to kgs.\n2. Convert kgs to lbs.\nChoose an option");
        choice = scanner.nextInt();
        if(choice==1){
            System.out.println("Enter the weight in lbs:");
            weight = scanner.nextDouble();
            newWeight = weight * 0.453592;
            System.out.printf("Weight in lbs will be %.2f",newWeight);
        }else if (choice==2) {
            System.out.println("Enter the weight in kgs:");
            weight = scanner.nextDouble();
            newWeight = 2.20462 * weight;
            System.out.printf("Weight in lbs will be %f",newWeight);            
        }else{
            System.out.println("enter a valid choice");
        }


        scanner.close();
    }
    
}
