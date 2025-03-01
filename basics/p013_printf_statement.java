public class p013_printf_statement {
    public static void main(String[] args) {
        String name= "Spongebob";
        char firstLetter = 'S';
        int age = 30;
        double height = 60.5;
        boolean isEmployed = true;

        System.out.printf("Hello %s\n", name);
        System.out.printf("Your name starts with a %c\n", firstLetter);
        System.out.printf("You are %d years old\n", age);
        System.out.printf("You are %f inches tall\n", height);
        System.out.printf("Employed: %b\n", isEmployed);

        System.out.printf("%s is %d years old.\n", name,age);


        // %[flags][width][.precision][specifier-character]
        double price1 = 90000.7;
        double price2 = 19000.99;
        double price3 = -290000.99;
        double price4 = -2322.9;

        System.out.printf("%( ,.1f\n", price1);
        System.out.printf("%(,.1f\n", price2);
        System.out.printf("%(+,.1f\n", price3);
        System.out.printf("% ,.1f\n", price4);


        int id1  =1 ;
        int id2 = 2;
        int id3 = 3;
        int id4 = 4;

        System.out.printf("%4d\n", id1);
        System.out.printf("%4d\n" , id2);
        System.out.printf("%4d\n", id3);
        System.out.printf("%4d\n", id4);



    }
    
}
