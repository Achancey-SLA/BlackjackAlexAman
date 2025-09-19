import java.util.ArrayList;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        ArrayList<BlackJackPerson> people = new ArrayList<BlackJackPerson>();
        ArrayList<Player> players = new ArrayList<Player>();

        Dealer dealer = new Dealer();
        System.out.println("How many players are playing?");
        String response = inputScanner.nextLine();
        int playerAmount = Integer.parseInt(response);

        for(int i=0;i<playerAmount;i++){
            Player basePlayer = new Player();
            players.add(basePlayer);
            people.add(basePlayer);
        }


        people.add(dealer);


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

