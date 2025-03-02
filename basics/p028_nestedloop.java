import java.util.Scanner;
public class p028_nestedloop{
    public static void main(String[] args) {
        // nested loop
        Scanner scanner = new Scanner(System.in);
        int rows, columns;
        char symbol;
        System.out.println("Enter the # of rows: ");
        rows = scanner.nextInt();
        System.out.println("Enter the # of column: ");
        columns = scanner.nextInt();
        System.out.println("Enter thesymbol to use: ");
        symbol = scanner.next().charAt(0);
        for(int i =0; i<rows; i++){
            for(int j =0; j<columns; j++){
                System.out.print(symbol);
            }
            System.out.println();
        }
        scanner.close();
    }
}