package car;

public class Car {

    int maxSpeed = 100;
    int minSpeed = 0;
    double weight = 4079;
    boolean isTheCarOn = false;
    char condition = "A";
//char is only one character. it is not a string.  it can be a symbol, number, or letter

    public void printVariables() {
        System.out.println(maxSpeed);
        System.out.println(minSpeed);
        System.out.println(weight);
        System.out.println(isTheCarOn);
        System.out.println(condition);
    }

    public static void main(String[] args) {
	// write your code heres
    }
}
