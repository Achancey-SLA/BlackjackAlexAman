import java.util.Random;
public class Player extends BlackJackPerson {


        void hit(ACard card){
            System.out.println(name+" is Hitting");
            score+=card.value;
            System.out.println(name+" got the " +card);
            System.out.println(name+"'s score is "+score);
        }

        public String toString(){
            return name;
        }

       void stay(){
            System.out.println(name+" is Staying");
           System.out.println(name+"'s final score is "+score);


       }
        void doubleBet(){

        }

        void introduce() {
            System.out.println("Hi Dealer.  I'm " + name);
        }
}
