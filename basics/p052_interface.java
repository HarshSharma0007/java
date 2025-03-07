public class p052_interface {
    public static void main(String[] args) {
        // Interface = MULTIPLE INHERITANCE like behaviour
        Rabbit rabbit = new Rabbit();
        Hawk hawk = new Hawk();
        Fish fish = new Fish();

        rabbit.flee();
        hawk.hunt();
        fish.flee();
        fish.hunt();
    }
    
}

interface Prey{
    void flee();
}
interface Predator{
    void hunt();
}


class Rabbit implements Prey{
    @Override
    public void flee(){
        System.out.println("the rabbit is runnin");
    }
}
class Hawk implements Predator{
    @Override
    public void hunt(){
        System.out.println("the hawk is hunting");
    }
}
class Fish implements Prey, Predator{
    @Override
    public void flee(){
        System.out.println("the fish is runnin");
    }
    @Override
    public void hunt(){
        System.out.println("the fish is hunting");
    }
}