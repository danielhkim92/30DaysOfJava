public class Main {

    int maxSpeed = 100;
    int minSpeed = 0;

    double weight = 4079;

    boolean isTheCarOn = false;
    char condition = 'A';
//char is only one character. it is not a string.  it can be a symbol, number, or letter
    String nameOfCar = "Lucy";

    double maxFuel = 16;
    double currentFuel = 8;
    double mpg = 26.4;

    int numberOfPeopleInCar = 1;

    //this is a good place to make constructors

    public Main(int customMinSpeed) {
        minSpeed = customMinSpeed;

    }


    public void printVariables() {
        System.out.println("This is the max speed " + maxSpeed);
        System.out.println(minSpeed);
        System.out.println(weight);
        System.out.println(isTheCarOn);
        System.out.println(condition);
        System.out.println(nameOfCar);
    }

    public void upgradeMinSpeed() {
        minSpeed = maxSpeed;
        maxSpeed = maxSpeed + 1;
    }

    public void wreckCar() {
        condition = 'C';
    }
    public static void main(String[] args) {
        // write your code heres
        Main birthdayPresentCar = new Main(10);
    }
}
