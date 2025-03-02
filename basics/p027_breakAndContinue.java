public class p027_breakAndContinue {
    public static void main(String[] args) {
        for(int i=0; i<10;i++){
            if(i==5){
                continue;
                // continue : skips the current iteration
                // break : stops the loop
            }
            System.out.println(i + " ");
        }
    }
}