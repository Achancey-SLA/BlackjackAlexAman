import java.util.Random;

public class Dealer {
    String name;
    Random r = new Random();

    void greeting(){
        System.out.println("hello, I am " + name + ", The dealer.");

    }

    void deal(Player recipient){
        int card = r.nextInt(2,11);
        System.out.println(recipient.name+"'s firstcard");

    }
}
