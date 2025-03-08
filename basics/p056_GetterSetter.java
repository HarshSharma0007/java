public class p056_GetterSetter {
    public static void main(String[] args) {
        Car car = new Car("AVTR", "white", 1000000);
        System.out.println(car.getColor() + " " + car.getModel() + " " + car.getPrice());
        car.SetterColor("black");

        System.out.println(car.getColor() + " " + car.getModel() + " " + car.getPrice());
    }
    
}

class Car{
    private String model;
    private String color;
    private double price;
    Car(String model, String color, double price){
        this.model = model;
        this.color = color;
        this.price = price;
    }
    // getter
    String getModel(){
        return this.model;
    }
    String getColor(){
        return this.color;
    }
    String getPrice(){
        return "$" + this.price;
    }
    // Setter
    void SetterColor(String color){
        this.color = color;
    }
    void SetterPrice(double price){
        if (price<0) {
            System.out.println("Enter valid Amount.");
            
        }
        else{
            this.price = price;
        }
    }
    void SetterModel(String model){
        this.model= model;
    }
}