public class p035_ArrayString {
    public static void main(String[] args) {
        String[] fruits = {"apple", "orange", "banana"};
        String target = "orange";
        boolean isFound = false;


        for(int i=0; i<fruits.length; i++){
            if(fruits[i].equals(target)){
                System.out.println("element found at index: "+i);
                isFound=true;
                break;
            }
            
        }

        if(!isFound){
            System.out.println("Not present.");
        }
        
    }
}
