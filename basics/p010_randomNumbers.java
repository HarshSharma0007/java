import java.util.Random;

public class p010_randomNumbers {
    public static void main(String[] args) {
        Random random = new Random();

        //dice 

        int number1, number2, number3;
        number1 = random.nextInt(1,7);
        System.out.println(number1);
        number2 = random.nextInt(1,7);
        System.out.println(number2);
        number3 = random.nextInt(1,7);
        System.out.println(number3);

        // coin

        boolean isHeads;

        isHeads = random.nextBoolean();

        if(isHeads){
            System.out.println("Heads");
        }
        else{
            System.out.println("Tails");
        }
    }    
}
