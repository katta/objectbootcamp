import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SquareTest {
    @Test
    public void shouldComputeAreaOf5By5Square() {
        assertEquals(25, new Square(5).area());
    }

    @Test
    public void shouldComputeAreaOf4By4Square() {
        assertEquals(16, new Square(4).area());
    }

    @Test
    public void shouldComputePerimeterOf4By4Square() {
        assertEquals(16, new Square(4).perimeter());
    }

    @Test
    public void shouldComputePerimeterOf5By5Square() {
        assertEquals(20, new Square(5).perimeter());
    }
}
