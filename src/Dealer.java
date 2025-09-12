import java.util.Random;
import java.util.Scanner;

public class Dealer {
    String name;
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

    void askNames(Player name1, Player name2){
        System.out.println("what is player 1's name?");
        String response = textScanner.nextLine();
        name1.name = response;
        System.out.println("what is player 2's name?");
        response = textScanner.nextLine();
        name2.name = response;

    }

    void askHitOrStay(Player person){
        System.out.println(person.name+", do you want to hit or stay? (current score is: "+person.score+")");
        String response = textScanner.nextLine();
        if(response.equals("stay")){
            person.stay();
        }
        else if (response.equals("hit")){
            person.hit();

            if(person.score>21){
                System.out.println(person.name+" busted.");
            }
            else{
                askHitOrStay(person);
            }
        }
        else{
            System.out.println("that wasn't one of the options. please pick again.");
            askHitOrStay(person);
        }

    }


}
