import java.util.Scanner;

public class p020_Temperature_Converter {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        double temp, newTemp;
        String unit;

        System.out.println("Enterthe temp: ");
        temp = scanner.nextDouble();
        scanner.nextLine();

        System.out.println("Enter unit (C or F)");
        unit = scanner.nextLine().toUpperCase();

        newTemp = (unit.equals("C"))? (temp -32) * 5/9: (temp * 9 /5)+32;
        System.out.printf("%.1f°%s",newTemp,unit); // ALT + NUMLOCK + 0176
        scanner.close();

    }
    
}
