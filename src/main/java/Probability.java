/**
 * Represents the chance of an event happening
 */
public class Probability {
    private final double value;

    public Probability(double valueAsFraction) {
        this.value = valueAsFraction;
    }

    public Probability and(Probability other) {
        return new Probability(this.value * other.value);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Probability that = (Probability) o;

        if (Double.compare(that.value, value) != 0) return false;

        return true;
    }

    @Override
    public int hashCode() {
        long temp = Double.doubleToLongBits(value);
        return (int) (temp ^ (temp >>> 32));
    }

    public Probability or(Probability probabilityZeroDotSix) {
        return this.not().and(probabilityZeroDotSix.not()).not();
    }

    public Probability not() {
        return new Probability(1 - value);
    }
}
