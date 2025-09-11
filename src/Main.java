

public class Main {
    public static void main(String[] args) {
        Dealer dealer = new Dealer();
        dealer.name = "Luke";

        Player player1 = new Player();
        Player player2 = new Player();


        dealer.greeting();
        dealer.deal(player1);
        }
    }
