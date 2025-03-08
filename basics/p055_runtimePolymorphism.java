import java.util.Scanner;

public class p055_runtimePolymorphism {
    public static void main(String[] args) {
        // runtime polymorphism
        // Animal animal = new Animal(); since 
        // Animal is abstract it can not be instantiated
        Scanner scanner = new Scanner(System.in);

        Animal animal;
        System.out.println("Would u like a (1)Dog / (2)Cat");
        int choice = scanner.nextInt();

        if(choice==1){
            animal = new Dog();
            animal.speak();
        }
        else if(choice==2){
            animal = new Cat();
            animal.speak();
        }




        scanner.close();

    }
    
}
abstract class Animal{
    abstract void speak();
}
class Dog extends Animal{
    @Override
    void speak(){
        System.out.println("Dog goes Woof");
    }
}
class Cat extends Animal{
    @Override
    void speak(){
        System.out.println("Cat goes Meow");
    }
}