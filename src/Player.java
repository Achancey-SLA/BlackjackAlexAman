import java.util.Random;
public class Player {
    int score;
    String name;
    Random r = new Random();

    int bet;

        void hit(){
            score+=r.nextInt(2,11);

        }
       void stay(){

       }
        void doubleBet(){

        }
}
