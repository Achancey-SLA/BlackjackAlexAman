import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Dealer extends BlackJackPerson {

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

    void askNames(Player name1){
        System.out.println("enter the name of a player");
        String response = textScanner.nextLine();
        name1.name = response;

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

    void sayWhoWon(ArrayList<BlackJackPerson> people){
        int highScore = 0;
        BlackJackPerson currentWinner = people.get(1);

        for(BlackJackPerson eachPerson : people){
            if(eachPerson.score>highScore) {
                currentWinner = eachPerson;
                highScore = eachPerson.score;
            }
        }
        System.out.println(currentWinner.name + " wins! with a score of "+currentWinner.score);

    }


}
