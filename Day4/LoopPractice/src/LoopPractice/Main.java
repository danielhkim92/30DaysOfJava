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

    public static void practiceForLoop() {
        for (int x = 0; x < 20; x++) {
            System.out.println("The value of x is " + x);
        }
        System.out.println("This is the end");
    }

    public static void main(String[] args) {
	// write your code here
//        practiceWhileLoop();
//        practiceDoWhileLoop();
        practiceForLoop();
    }
}

//scope is basically the range of when the function can actually work.  if it cant be accessed, then obviously it wont work
///static is not instance