public class p045_ArrayOfObjects {

    public static void main(String[] args) {
        Car car1 = new Car("Mustang", "Red");
        Car car2 = new Car("AVTR", "White");
        Car car3 = new Car("Audi", "Blue");
        Car car4 = new Car("Bugati", "Green");

        // Array of objects
        Car[] cars = {car1, car2, car3, car4};

        for(Car c : cars){
            c.drive();
        }
    }
}

class Car{
    String name;
    String color;
    Car(String name, String color){
        this.name = name;
        this.color = color;
    }
    void drive(){
        System.out.println("You drive an " + this.color +" " + this.name);
    }
}