public class p016__StringMethoda {
    public static void main(String[] args) {
        String name = "   Rachel Roth The Raven   ";

        int length = name.length();
        char letter = name.charAt(0);
        int index = name.indexOf(" ");
        int lastIndex = name.lastIndexOf("o");
        // name = name.toLowerCase();
        // name = name.toUpperCase();

        name = name.trim();
        name = name.replace('l','m');
        name.isEmpty();

        System.out.println(name.isEmpty());

        if(name.isEmpty()){
            System.out.println("Your name is Empty");
        }
        else{
            System.out.println("Hello "+ name);
        }

        if (name.contains(" ")) {
            System.out.println("contains space");
            
        }else{
            System.out.println("Not contains space");
        }

        if (name.equalsIgnoreCase("rachem rOth The Raven")) {
            System.out.println("Welcome Raven!");
            
        }
        else{
            System.out.println("You are not supposed to be here.");
        }

        
    }
    
}
