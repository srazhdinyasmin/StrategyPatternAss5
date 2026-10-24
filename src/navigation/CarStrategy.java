package navigation;

public class CarStrategy implements RouteStrategy {

    @Override
    public double calculateTime(double distance) {
        return distance / 60.0;
    }
}