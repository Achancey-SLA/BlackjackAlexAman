import java.util.Random;
public class Player {
    int score;
    String name;
    Random r = new Random();

    int bet;

        void hit(){
            System.out.println(name+" is Hitting");
            int card=r.nextInt(2,11);
            score+=card;
            System.out.println(name+" got a " +card);
            System.out.println(name+"'s score is "+score);


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
