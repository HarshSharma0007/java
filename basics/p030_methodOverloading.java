public interface p030_methodOverloading {
    public static void main(String[] args) {
        System.out.println(add(2,3));
        System.out.println(add(2,3,4));
        
    }
    static int add(int a, int b, int c){
        return a+b+c;
    }
    static int add(int a, int b){
        return a+b;
    }
}
