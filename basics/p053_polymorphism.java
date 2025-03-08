public class p053_polymorphism {
    public static void main(String[] args) {
        Car car = new Car();
        Bike bike = new Bike();
        Boat boat = new Boat();

        Vehicle[] vehicles = {car, bike, boat};
        for (Vehicle vehicle:vehicles){
            vehicle.go();
        }
        
    }
    
}
abstract class Vehicle{
    abstract void go();
}
class Car extends Vehicle{
    @Override
    void go(){
        System.out.println("You drove the car");
    }

}

class Bike extends Vehicle{
    @Override
    void go(){
        System.out.println("You drove the Bike");
    }

}

class Boat extends Vehicle{
    @Override
    void go(){
        System.out.println("You drove the Boat");
    }

}