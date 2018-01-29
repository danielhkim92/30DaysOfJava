package LoopPractice;

public class Main {

    public static void practiceWhileLoop() {
        int x = 0;
        while(x < 5) {
            System.out.println("The value of x is  " + x);
////            x = x + 1;
            x++;
        }
    }

    public static void practiceDoWhileLoop() {
        int x = 0;
        do {
            System.out.print("The value of x is " + x);
            x++;
        } while (x < 10);
    }

    public static void main(String[] args) {
	// write your code here
//        practiceWhileLoop();
        practiceDoWhileLoop();
    }
}


///static is not instance