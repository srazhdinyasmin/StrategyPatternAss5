package navigation;

public class CycleStrategy implements RouteStrategy {

    @Override
    public double calculateTime(double distance) {
        return distance / 15.0;
    }
}