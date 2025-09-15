import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<BlackJackPerson> people = new ArrayList<BlackJackPerson>();
        ArrayList<Player> players = new ArrayList<Player>();

        Dealer dealer = new Dealer();
        Player player2 = new Player();
        Player player1 = new Player();
        people.add(player1);
        people.add(player2);
        people.add(dealer);
        players.add(player1);
        players.add(player2);

        dealer.name = "Luke";
        dealer.greeting();
        for(Player eachplayer : players){
        dealer.askNames(eachplayer);
        }
        for(Player eachPlayer: players){
            eachPlayer.introduce();
        }
        for(Player eachPlayer: players){
            dealer.deal(eachPlayer);
        }
        for(Player eachPlayer: players){
            dealer.askHitOrStay(eachPlayer);
        }


        dealer.dealerPlay();
        dealer.sayWhoWon(player1,player2);




    }
}

