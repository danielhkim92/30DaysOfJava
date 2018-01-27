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
    int maxNumberOfPeopleInCar = 6;

    //this is a good place to make constructors

//    public Main(int customMaxSpeed, double customWeight, boolean customIsTheCarOn) {
//        maxSpeed = customMaxSpeed;
//        weight = customWeight;
//        isTheCarOn = customIsTheCarOn;
//    }


    public void printVariables() {
        System.out.println("This is the max speed " + maxSpeed);
        System.out.println(minSpeed);
        System.out.println(weight);
        System.out.println(isTheCarOn);
        System.out.println(condition);
        System.out.println(nameOfCar);
        System.out.println(numberOfPeopleInCar);
    }

    public void upgradeMinSpeed() {
        minSpeed = maxSpeed;
        maxSpeed = maxSpeed + 1;
    }

    public void getIn() {
        if (numberOfPeopleInCar < maxNumberOfPeopleInCar) {
            numberOfPeopleInCar++;
            System.out.println("someone got in");
        } else {
            System.out.println("sorry theres no more room for you" + numberOfPeopleInCar + " = " + maxNumberOfPeopleInCar);
        }
    }

    public void getOut() {
        if (numberOfPeopleInCar >= 0) {
            numberOfPeopleInCar--;
        } else {
            System.out.println("theres no one in the car");
        }
    }

    public double howManyMilesTillOutOfGas() {
        return currentFuel * mpg;
    }

    public double maxMilesPerFillUp() {
        return maxFuel * mpg;
    }

    public void turnTheCarOn() {
        if (!isTheCarOn) {
            isTheCarOn = true;
        } else {
            System.out.println("the car is already on silly");
        }
    }


    public void wreckCar() {
        condition = 'C';
    }
    public static void main(String[] args) {
        // write your code heres

        Main tommyCar = new Main();
        tommyCar.getOut();
        tommyCar.getOut();
        tommyCar.getIn();
        tommyCar.getIn();
        tommyCar.getIn();
        tommyCar.getIn();
        tommyCar.getIn();
        tommyCar.getIn();
        tommyCar.getIn();
        tommyCar.getIn();
        tommyCar.turnTheCarOn();
        tommyCar.turnTheCarOn();




//        System.out.println("christmas car");
//        Main christmasPresentCar = new Main(550, 2014, false);
//        christmasPresentCar.printVariables();
    }
}
