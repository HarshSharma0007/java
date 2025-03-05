public class p038_2DArray {
    public static void main(String[] args) {
        String[] fruits = {"apple", "orange", "banana"};
        String[] vegetables = {"potatoes","onion","carrot"};
        String[] meats = {"chicken", "porks", "fish"};
        String[][] groceries = {fruits, vegetables, meats};
        for(String[] foods:groceries){
            for(String food : foods){
                System.out.print(food+ " ");
            }
            System.out.println();
        }
    }
}
