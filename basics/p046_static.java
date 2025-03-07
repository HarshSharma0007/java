public class p046_static {
    public static void main(String[] args) {

        Friend fr1 = new Friend("Naruto");
        Friend fr2 = new Friend("Gaara");
        Friend fr3 = new Friend("Rock Lee");
        
        
        System.out.println(fr1.numOfFriends);
        System.out.println(fr2.numOfFriends);
        System.out.println(fr3.numOfFriends);
        fr1.showFriends();
        fr2.showFriends();
        fr3.showFriends();
    }
    
}
class Friend{
    String name;
    static int numOfFriends;
    Friend(String name ){
        this.name = name;
        numOfFriends++; 
    }
    static void showFriends(){
        System.out.println("You have total of "+ numOfFriends +" Friends");
    }
}
