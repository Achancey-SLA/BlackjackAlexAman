public class Player extends BlackJackPerson {


        void hit(ACard card){
            System.out.println(getName() +" is Hitting");
            addToScore(card.value);
            System.out.println(getName() +" got the " +card);
            System.out.println(getName() +"'s score is "+getScore());
        }

    public String toString(){
            return getName();
        }

       void stay(){
            System.out.println(getName() +" is Staying");
           System.out.println(getName() +"'s final score is "+getScore());


       }
        void doubleBet(){

        }

        void introduce() {
            System.out.println("Hi Dealer.  I'm " + getName());
        }
}
