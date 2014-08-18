package session4;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static session4.UnitOfMeasurement.Centimeter;
import static session4.UnitOfMeasurement.Meter;

public class MeasurementTest {
    
    @Test
    public void shouldTestEqualityOfAMeasurement() {
        Measurement measurement1 = new Measurement(5, Centimeter);
        Measurement measurement2 = new Measurement(5, Centimeter);

        org.junit.Assert.assertEquals(measurement1, measurement2);
    }
    
    @Test
    public void shouldTestEqualityOfDifferentMeasurementTypes() {
        Measurement oneMeter = new Measurement(1, Meter);
        Measurement hundredCentimeters = new Measurement(100, Centimeter);

        Assert.assertEquals(oneMeter, hundredCentimeters);
    }

    @Test
    public void shouldDisplayMeaningfulInfoInToString() {
        Assert.assertEquals("3 Centimeter(s)", new Measurement(3, Centimeter).toString());
        Assert.assertEquals("5 Meter(s)", new Measurement(5, Meter).toString());
    }

    @Test
    public void shouldCompareIfOneMeasurementIsGreaterThanOther() {
        assertTrue(new Measurement(3, Centimeter).greaterThan(new Measurement(2, Centimeter)));
        assertTrue(new Measurement(3, Meter).greaterThan(new Measurement(299, Centimeter)));
    }

    @Test
    public void shouldCompareIfOneMeasurementIsLesserThanOther() {
        assertTrue(new Measurement(3, Centimeter).lesserThan(new Measurement(5, Centimeter)));
        assertTrue(new Measurement(3, Meter).lesserThan(new Measurement(301, Centimeter)));
    }

    @Test
    public void shouldAddTwoMeasurements() {
        Measurement newMeasurement = new Measurement(2, Centimeter).add(new Measurement(1, Centimeter));
        assertEquals(newMeasurement, new Measurement(3, Centimeter));
    }
}
