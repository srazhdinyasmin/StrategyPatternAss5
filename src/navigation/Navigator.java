package navigation;

import java.util.Objects;

public class Navigator {

    private RouteStrategy strategy;

    public Navigator(RouteStrategy strategy) {
        setStrategy(strategy);
    }

    public void setStrategy(RouteStrategy strategy) {
        this.strategy = Objects.requireNonNull(strategy);
    }

    public double calculateTravelTime(double distance) {
        if (distance < 0) {
            throw new IllegalArgumentException(
                    "Distance cannot be negative"
            );
        }
        return strategy.calculateTime(distance);
    }
}