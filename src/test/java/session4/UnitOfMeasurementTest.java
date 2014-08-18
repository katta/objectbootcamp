package session4;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class UnitOfMeasurementTest {
    
    @Test
    public void shouldCalculateNumberOfMillimetersInCentimeter() {
        assertEquals(40, UnitOfMeasurement.Centimeter.toMillimeters(4));
        assertEquals(50, UnitOfMeasurement.Centimeter.toMillimeters(5));
    }

    @Test
    public void shouldCalculateNumberOfMillimetersInMeter() {
        assertEquals(4000, UnitOfMeasurement.Meter.toMillimeters(4));
        assertEquals(5000, UnitOfMeasurement.Meter.toMillimeters(5));
    }

//    @Test
//    public void shouldConvertMeterInToCentimeters() {
//        UnitOfMeasurement.Meter.convertTo(UnitOfMeasurement.Centimeter, 1);
//    }
}
