public class p058_Composition {
    public static void main(String[] args) {
        // Composition represents part-of relationship b/w objects. 
        // For example, an Engine is "part-of" or Car
        // ALlows complex objects objects to be
        // constructed from smaller objects.
        Car car = new Car("AVTR", 2018, "best");
        System.out.println(car.model+"\n" +car.year +"\n" + car.engine.type);
        car.start();
    }
}
class Car{
    String model;
    int year;
    Engine engine;
        Car(String model,int year, String engineType){
            this.model = model;
            this.year = year;
            this.engine = new Engine(engineType);
        }
        void start(){
            this.engine.start();
            System.out.println("The " + this.model + " is running.");
        }
}
class Engine{
    String type;
    Engine(String type){
        this.type = type;
    }
    void start(){
        System.out.println("You start the "+ this.type + " Engine");
    }
}