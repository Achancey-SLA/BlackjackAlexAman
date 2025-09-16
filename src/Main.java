import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<BlackJackPerson> people = new ArrayList<BlackJackPerson>();


        Dealer dealer = new Dealer();
        Player player2 = new Player();
        Player player1 = new Player();
        people.add(player1);
        people.add(player2);
        people.add(dealer);

        dealer.name = "Luke";
        dealer.greeting();


        dealer.askNames(player1);
        dealer.askNames(player2);
        player1.introduce();
        player2.introduce();
        dealer.deal(player1);
        dealer.deal(player2);
        dealer.askHitOrStay(player1);
        dealer.askHitOrStay(player2);


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

