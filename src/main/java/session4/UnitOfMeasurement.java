package session4;

/**
 * Represents different kinds of length measure.
 */
public enum UnitOfMeasurement {
    Meter(1000), Centimeter(10);

    private int millimeters;

    UnitOfMeasurement(int millimeters) {
        this.millimeters = millimeters;
    }

    public int toMillimeters(int value) {
        return value * millimeters;
    }

    public int fromMillimeters(int millimeters) {
        return millimeters / this.millimeters;
    }
}
