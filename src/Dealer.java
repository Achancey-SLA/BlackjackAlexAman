import java.util.Random;

public class Dealer {
    String name;
    Random r = new Random();

    void greeting(){
        System.out.println("hello, I am " + name + ", The dealer.");

    }

    void deal(Player recipient){
        int card = r.nextInt(2,11);
        System.out.println(recipient.name+"'s first card is a " +card);
        recipient.score+=card;
        card = r.nextInt(2,11);
        System.out.println(recipient.name+"'s second card is a " +card);
        recipient.score+=card;
    }

    void askName(Player player){
        System.out.println("what is player 1's name?");

    }
}
