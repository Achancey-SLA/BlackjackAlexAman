import java.util.Random;
public class Player {
    int score;
    String name;
    Random r = new Random();

    int bet;

        void hit(){
            System.out.println(name+"is Hitting");
            score+=r.nextInt(2,11);
            System.out.println(name+"'s Score is "+score);


        }
       void stay(){

       }
        void doubleBet(){

        }
}
