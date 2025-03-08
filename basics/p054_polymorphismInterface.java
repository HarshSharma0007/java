public class p054_polymorphismInterface {
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
interface Vehicle{
    abstract void go();
}
class Car implements Vehicle{
    @Override
    public void go(){
        System.out.println("You drove the car");
    }

}

class Bike implements Vehicle{
    @Override
    public void go(){
        System.out.println("You drove the Bike");
    }

}

class Boat implements Vehicle{
    @Override
    public void go(){
        System.out.println("You drove the Boat");
    }

}