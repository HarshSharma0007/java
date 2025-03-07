public class p047_inheritance {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();

        System.out.println(dog.isAlive);
        dog.eat();
        dog.speak();
        System.out.println(dog.lives);
        System.out.println(cat.isAlive);
        cat.eat();
        cat.speak();
        System.out.println(cat.lives);

    }
    
}

class Animal {
    boolean isAlive;
    Animal(){
        isAlive = true;

    }

    void eat(){
        System.out.println("Animal is eating");
    }
}

class Dog extends Animal {
    int lives =1;

    void speak(){
        System.out.println("The dog goes *woof*");
    }



}

class Cat extends Animal {
    int lives =9;

    void speak(){
        System.out.println("The cat goes *meow*");
    }

}
