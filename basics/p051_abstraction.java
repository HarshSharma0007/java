public class p051_abstraction {
    public static void main(String[] args) {

        Circle circle = new Circle(3);
        Triangle triangle = new Triangle(4,5);
        Rectangle reactangle = new Rectangle(6,7);

        System.out.println(circle.area());
        System.out.println(triangle.area());
        System.out.println(reactangle.area());

    }
    
}
abstract class Shape{
    abstract double area();
    void display(){
        System.out.println("This is a shape");
    }
}

class Circle extends Shape{
    double r;

    Circle(double r){
        this.r = r;
    }


    @Override
    double area(){
        return Math.PI * Math.pow(this.r, 2);
    }

}

class Triangle extends Shape{
    double b, h;

    Triangle(double b, double h){
        this.b= b;
        this.h = h;
    }
    @Override
    double area(){
        return 0.5*(this.b*this.h);
    }

}

class Rectangle extends Shape{
    double l,b;

    Rectangle(double l, double b){
        this.l = l;
        this.b = b;
    }
    @Override
    double area(){
        return this.l*this.b;
    }

}