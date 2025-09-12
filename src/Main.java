

public class Main {
    public static void main(String[] args) {
        Dealer dealer = new Dealer();
        dealer.name = "Luke";

        Player player1 = new Player();
        Player player2 = new Player();
        dealer.greeting();
        dealer.askNames(player1,player2);
        dealer.deal(player1);
        dealer.deal(player2);
        dealer.askHitOrStay(player1);
        dealer.askHitOrStay(player2);
        dealer.dealerPlay();
        }
    }
