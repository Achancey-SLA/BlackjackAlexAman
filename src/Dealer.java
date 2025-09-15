import java.util.Random;
import java.util.Scanner;

public class Dealer {
    String name;
    int score = 0;
    Random r = new Random();
    Scanner textScanner = new Scanner(System.in);
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
        System.out.println(recipient.name+"'s current score is "+ recipient.score);
    }

    void askHitOrStay(Player person){
        System.out.println(person.name + ", do you want to hit or stay? (current score: " + person.score +")");
        String response =textScanner.nextLine();
        if(response.equals("stay")){
            person.stay();
        }
        else if(response.equals("hit")){
            person.hit();
            if(person.score>21){
                System.out.println(person.name + " busted. Oh no!");
                person.score = 0;
            }
            else {
                askHitOrStay(person);
            }
        }
        else{
            System.out.println("That wasn't one of the options");
            askHitOrStay(person);

        }

    }

    void askNames(Player name1, Player name2){
        System.out.println("what is player 1's name?");
        String response = textScanner.nextLine();
        name1.name = response;
        System.out.println("what is player 2's name?");
        response = textScanner.nextLine();
        name2.name = response;

    }

    void dealerPlay(){
        int card = r.nextInt(2,11);
        System.out.println(name+"'s first card is a " +card);
        score+=card;
        card = r.nextInt(2,11);
        System.out.println(name+"'s second card is a " +card);
        score+=card;
        System.out.println(name+"'s current score is "+ score);
        dealerHitOrStay();
    }

    void dealerHitOrStay(){
        if(score<17){
            int card = r.nextInt(2,11);
            System.out.println(name+" is hitting and got a " +card);
            score+=card;
            System.out.println(name+"'s current score is "+ score);
            if(score>21){
                System.out.println(name + " busted");
                score = 0;
            }
            else{
                dealerHitOrStay();

            }
        }
        else{
            System.out.println(name+" is staying, with a final score of " + score);

        }


    }

    void sayWhoWon(Player player1, Player player2){
        if(score>player2.score && score>player1.score){
            System.out.print(name + "(the dealer) wins! with a score of " + score);
        }
        else if(player1.score>player2.score && player1.score>score){
            System.out.print(player1.name + " wins! with a score of " + player1.score);
        }
        else if(player2.score>player1.score && player2.score>score){
            System.out.print(player2.name + " wins! with a score of " + player2.score);
        }
        else {
            System.out.println("It's a tie!");
        }

    }


}
