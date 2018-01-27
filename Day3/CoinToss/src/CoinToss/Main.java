package CoinToss;

import java.util.Random;

public class Main {

    public String tossACoin() {
        Random rand = new Random();
        int toss =  Math.abs(rand.nextInt()) % 2;
        if (toss == 0) {
            return "Heads";
        } else {
            return "Tails";
        }
    }

    public static void main(String[] args) {
	// write your code here
        Main game = new Main();
        System.out.println(game.tossACoin());
    }
}
