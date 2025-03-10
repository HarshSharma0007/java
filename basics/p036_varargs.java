public class p036_varargs {
    public static void main(String[] args) {

        // varargs: no need to overload methods
        // use ... ellipsis
        System.out.println(add(1,2,3,4,4));
    }
    static int add(int...numbers){
        int sum = 0;
        for (int number: numbers) {
            sum += number;  
        }
        return sum;
    }
}
