import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<BlackJackPerson> people = new ArrayList<BlackJackPerson>();
        ArrayList<Player> players = new ArrayList<Player>();

        Dealer dealer = new Dealer();
        Player player3 = new Player();
        Player player2 = new Player();
        Player player1 = new Player();


        people.add(player1);
        people.add(player2);
        people.add(player3);
        people.add(dealer);
        players.add(player1);
        players.add(player2);
        players.add(player3);

        dealer.name = "Luke";
        //System.out.println(dealer.toString());
        dealer.greeting();
        dealer.createDeck();



        for (Player eachPlayer : players) {
            dealer.askNames(eachPlayer);
        }

        for (Player eachPlayer : players) {
            eachPlayer.introduce();
        }


        for (Player eachPlayer : players) {
            dealer.deal(eachPlayer);
        }

        for (Player eachPlayer : players) {
            dealer.askHitOrStay(eachPlayer);
        }



        dealer.dealerPlay();

        System.out.println();

        for(BlackJackPerson eachPerson: people){
            if(eachPerson.score>1) {
                System.out.println(eachPerson.name + "'s final score is " + eachPerson.score);
            }
            else{
                System.out.println(eachPerson.name + " doesn't have a score because they busted.");
            }
        }
        dealer.sayWhoWon(people);



    }
}

