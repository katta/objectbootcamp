package session4;

import static java.lang.String.format;

/**
 * Represents length in a specific unit
 */
public class Measurement implements Comparable<Measurement> {

    private final int value;
    private final UnitOfMeasurement uom;

    public Measurement(int value, UnitOfMeasurement uom) {
        this.value = value;
        this.uom = uom;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Measurement that = (Measurement) o;

        if (this.toMillimeters() != that.toMillimeters()) return false;

        return true;
    }

    private int toMillimeters() {
        return uom.toMillimeters(value);
    }

    @Override
    public int hashCode() {
        int result = value;
        result = 31 * result + (uom != null ? uom.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
         return format("%d %s(s)", value, uom);
    }

    public boolean greaterThan(Measurement other) {
        return this.compareTo(other) > 0;
    }

    @Override
    public int compareTo(Measurement that) {
        return Integer.valueOf(this.toMillimeters()).compareTo(that.toMillimeters());
    }

    public boolean lesserThan(Measurement other) {
        return this.compareTo(other) < 0;
    }

    public Measurement add(Measurement other) {
        int resultInMillimeters = this.toMillimeters() + other.toMillimeters();
        return new Measurement(uom.fromMillimeters(resultInMillimeters), uom);
    }
}
