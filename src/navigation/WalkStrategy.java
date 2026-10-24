package navigation;

public class WalkStrategy implements RouteStrategy {

    @Override
    public double calculateTime(double distance) {
        return distance / 5.0;
    }
}