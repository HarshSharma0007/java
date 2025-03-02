import java.util.Scanner;

public class p022_Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double num1, num2, result=0;
        char operator;
        boolean validOperaion = true;

        System.out.print("Enter the num 1: ");
        num1 = scanner.nextDouble();

        System.out.print("Enter the operator (+, - , *, /,^): ");
        operator = scanner.next().charAt(0);
        
        System.out.print("Enter the num 2: ");
        num2 = scanner.nextDouble();

        switch (operator) {
            case '+'->result= num1+num2;
            case '-'->result= num1-num2;
            case '*'->result= num1*num2;
            case '/'->{
                if(num2==0){
                    System.out.println("Not divide by zero.");
                    validOperaion=false;
                }else{
                    result= num1/num2;
                }
            }
            case '^'->result= Math.pow(num1,num2);
            default -> {
                System.out.println("Invalid Operator");
                validOperaion=false;
        }
        }

        if(validOperaion){System.out.println(result);}
        scanner.close();
    }
        
    }