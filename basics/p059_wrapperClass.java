public class p059_wrapperClass {
    public static void main(String[] args) {
        // wrapper class allow primitive values to be used as objects, 
        // allow use of collections Framework and static Utility Methods

        // old ways

        // Auto Boxing
        // INTEGER a = new INTEGER(123);
        Integer a = 123;
        Double b = 2.12;
        Character c = 'a';
        Boolean d =false;

        // we have always created a string like this
        // String e  = "Your Name";


        // Unboxing

        int u = a;
        double v = b;
        char w = c;
        boolean x =  d;


        // Uses

        String m = Integer.toString(123);
        String n = Double.toHexString(123.21);
        String o = Character.toString('w');
        String p = Boolean.toString(true);

        String G = m + n + o + p;

        System.out.println(G);


        Integer a1 = Integer.parseInt("123");
        Double b1 = Double.parseDouble("123.32");
        Character c1 = "swarming".charAt(0);
        Boolean d1 =Boolean.parseBoolean("true");



        // more new things

        char letter = '$';
        // we know '$' is not a letter actually a symbol
        System.out.println(Character.isLetter(letter));

        letter = 'b';
        System.out.println(Character.isUpperCase(letter));


    }
}
