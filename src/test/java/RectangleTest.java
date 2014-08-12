import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Ensures correctness of a Rectangle
 */
public class RectangleTest {

    @Test
    public void shouldCalculateAreaAs12ForA3By4Rectangle() {
        assertEquals(12, new Rectangle(3, 4).area());
    }

    @Test
    public void shouldCalculateAreaAs20ForA5By4Rectangle() {
        assertEquals(20, new Rectangle(5, 4).area());
    }

    @Test
    public void shouldCalculatePerimeterForA4By5Rectangle() {
        assertEquals(18, new Rectangle(4, 5).perimeter());
    }

    @Test
    public void shouldCalculatePerimeterForA4By4Rectangle() {
        assertEquals(16, new Rectangle(4, 4).perimeter());
    }
}
