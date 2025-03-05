import java.util.Random;
import java.util.Scanner;

public class p042_slotMachine {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int balance = 100, bet, payout;
        String[] row;
        String playAgain;

        System.out.println("  WelCome to the java Slots.  ");
        System.out.println("Symbols: 🍒 🍉 🍋 🔔 ⭐");

        while(balance>0){
            System.out.println("Current balance: "+ balance);
            System.out.println("Place your bet ammount: ");
            bet = scanner.nextInt();
            scanner.nextLine();
            if(bet>balance){
                System.out.println("Insufficent Funds");
            }
            else if(bet<=0){
                System.out.println("Set a valid amount");
            }
            else{
                balance-=bet;
            }
            System.out.println("Spinning.....");
            row = spinRow();
            printRow(row);
            payout = getPayout(row,bet);
            if(payout>0){
                System.out.println("You won $"+payout);
                balance +=payout;
            }
            else{
                System.out.println("Sorry you lost this round.");
            }
            System.out.print("Do you want to play again. (Y/N)");
            playAgain = scanner.nextLine().toUpperCase();
            if(!playAgain.equals("Y")){
                break;
            }

        }

        System.out.println("Game Over! Final Balance: $"+balance);
        scanner.close(); 
        
    }
    static String[] spinRow(){
        String[] symbols={
            "🍒",
            "🍉",
            "🍋",
            "🔔",
            "⭐"
        };
        String[] row = new String[3];
        Random random = new Random();
        for (int i = 0; i < row.length; i++) {
            row[i] = symbols[random.nextInt(symbols.length)];
        }

        return row;
    }
    static void printRow(String[] row){
        System.out.println(" " + String.join(" | ",row));
    }
    static int getPayout(String[] row, int bet){
        if(row[0].equals(row[1]) && row[1].equals(row[2])){
        return switch(row[0]){
            case "🍒" -> bet * 3;
            case "🍉" -> bet * 4;
            case "🍋" -> bet * 5;
            case "🔔" -> bet * 10;
            case "⭐" -> bet * 20;
            default -> 0;
            };
        }
        else if(row[0].equals(row[1])){
        return switch(row[0]){
            case "🍒" -> bet * 2;
            case "🍉" -> bet * 3;
            case "🍋" -> bet * 4;
            case "🔔" -> bet * 5;
            case "⭐" -> bet * 10;
            default -> 0;
        };
    }
        else if(row[1].equals(row[2])){
            return switch(row[1]){
                case "🍒" -> bet * 2;
                case "🍉" -> bet * 3;
                case "🍋" -> bet * 4;
                case "🔔" -> bet * 5;
                case "⭐" -> bet * 10;
                default -> 0;
        };

    }
    return 0;
    }


    
}
