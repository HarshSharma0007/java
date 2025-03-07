public class p050_toString {
    public static void main(String[] args) {
        Car car1 = new Car("Ford","Mustang", 2025,"Red");
        Car car2 = new Car("Ford2","Mustang", 2023,"Black");

        System.out.println(car1);
        System.out.println(car2);
        
    }
    
}

class Car{
    String make, model, color;
    int year; 

    Car(String make, String model, int year, String color){
        this.make = make;
        this.model = model;
        this.year = year;
        this.color = color;
    }

    @Override
    public String toString(){
        return this.color + " " + this.year + " " + this.make + " " + this.model;
    }
}