public class p049_MethodOverriding {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
        Fish fish = new Fish();
        dog.move();
        cat.move();
        fish.move();
    }
}

class Animal {
    void move(){
        System.out.println("Animal is moving");
    }
}

class Cat extends Animal {
}

class Fish extends Animal {
    @Override
    void move(){
        System.out.println("Animal is Swimming");
    }
}

class Dog extends Animal {
}