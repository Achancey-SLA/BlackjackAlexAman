import java.util.Random;
import java.util.Scanner;

public class BlackJackPerson {
    private String name;
    private int score = 0;
    protected Random r = new Random();
    protected Scanner textScanner = new Scanner(System.in);

    String getName(){
        return name;
    }

    void setName(String name){
        this.name = name;
    }

    int getScore(){
        return score;
    }

    void setScore(int newScore){
        score=newScore;
    }

    void addToScore(int addAmount){
        score+=addAmount;
    }

}
