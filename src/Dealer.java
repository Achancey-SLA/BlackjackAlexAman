import java.util.ArrayList;

public class Dealer extends BlackJackPerson {
    private ArrayList<ACard> deck = new ArrayList<ACard>();
    private String suit;

    public String toString(){
        String returnString = "name: ";
        returnString += getName();
        return returnString;
    }
    public ACard randomCard(){
        int cardIndex = r.nextInt(1,deck.size());
        ACard returnCard = deck.get(cardIndex);
        deck.remove(cardIndex);
        return returnCard;
    }

    public void createDeck(){

        for(int i=0; i<4; i+=1){

            if(i==0){
                suit = "diamonds";
            }
            if(i==1){
                suit = "hearts";
            }
            if(i==2){
                suit = "clubs";
            }
            if(i==3){
                suit = "spades";
            }

            for (int ii=2; ii<11; ii++){
                deck.add(new ACard((ii+" of "+suit),ii));
            }
            deck.add(new ACard(("jack of "+suit),10));
            deck.add(new ACard(("queen of "+suit),10));
            deck.add(new ACard(("king of "+suit),10));

        }
    }

    void greeting(){
        System.out.println("hello, I am " + getName() + ", The dealer.");

    }

    void deal(Player recipient){
        ACard card = randomCard();
        System.out.println(recipient.getName() +"'s first card is the " +card);
        recipient.addToScore(card.value);
        card = randomCard();
        System.out.println(recipient.getName() +"'s second card is a " +card);
        recipient.addToScore(card.value);
        System.out.println(recipient.getName() +"'s current score is "+ recipient.getScore());
    }

    void askHitOrStay(Player person){
        System.out.println(person.getName() + ", do you want to hit or stay? (current score: " + person.getScore() +")");
        String response =textScanner.nextLine();
        if(response.equals("stay")){
            person.stay();
        }
        else if(response.equals("hit")){
            person.hit(randomCard());
            if(person.getScore()>21){
                System.out.println(person.getName() + " busted. Oh no!");
                person.setScore(0);
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
        name1.setName(response);

    }

    void dealerPlay(){
        ACard card = randomCard();
        System.out.println(getName() +"'s first card is a " +card);
        addToScore(card.value);
        card = randomCard();
        System.out.println(getName() +"'s second card is a " +card);
        addToScore(card.value);
        System.out.println(getName() +"'s current score is "+ getScore());
        dealerHitOrStay();
    }

    void dealerHitOrStay(){
        if(getScore()<17){
            ACard card = randomCard();
            System.out.println(getName() +" is hitting and got a " +card);
            addToScore(card.value);
            System.out.println(getName() +"'s current score is "+ getScore());
            if(getScore()>21){
                System.out.println(getName() + " busted");
                setScore(0);
            }
            else{
                dealerHitOrStay();

            }
        }
        else{
            System.out.println(getName() +" is staying, with a final score of " + getScore());

        }


    }

    void sayWhoWon(ArrayList<BlackJackPerson> people){
        int highScore = 0;
        BlackJackPerson currentWinner = people.get(1);

        for(BlackJackPerson eachPerson : people){
            if(eachPerson.getScore()>highScore) {
                currentWinner = eachPerson;
                highScore = eachPerson.getScore();
            }
        }
        System.out.println(currentWinner.getName() + " wins! with a score of "+currentWinner.getScore());

    }


}
