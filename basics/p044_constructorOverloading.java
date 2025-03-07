public class p044_constructorOverloading {
    public static void main(String[] args) {
        User user1 = new User("H");
        User user2 = new User("H", "H@H.com");
        User user3 = new User("H", "H@H.com", 20);

        user1.details();
        user2.details();
        user3.details();
    }
}

class User{
    String username, email;
    int age;

    User(String u){
        this.username = u;
        this.email = "Not Provided";
        this.age = 0;

    }
    User(String u, String email){
        this.username = u;
        this.email = email;
        this.age = 0;
        
    }
    User(String u, String email, int age ){
        this.username = u;
        this.email = email;
        this.age = age;
        
    }
    void details(){
        System.out.println(this.username + " Your email is " + this.email + " Your age is: " + this.age );
    }
}
