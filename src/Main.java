package navigation;

public class Main {

    public static void main(String[] args) {

        double distance = 30.0;

        Navigator navigator = new Navigator(new CarStrategy());

        System.out.println("Car: " +
                navigator.calculateTravelTime(distance) + " hours");

        navigator.setStrategy(new WalkStrategy());

        System.out.println("Walking: " +
                navigator.calculateTravelTime(distance) + " hours");

        navigator.setStrategy(new CycleStrategy());

        System.out.println("Cycling: " +
                navigator.calculateTravelTime(distance) + " hours");
    }
}