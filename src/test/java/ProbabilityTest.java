import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

public class ProbabilityTest {

    private Probability probabilityZeroDotFour;
    private Probability probabilityZeroDotFive;
    private Probability probabilityZeroDotSix;

    @Before
    public void before() {
        probabilityZeroDotFour = new Probability(0.4);
        probabilityZeroDotFive = new Probability(0.5);
        probabilityZeroDotSix = new Probability(0.6);
    }

    @Test
    public void shouldCompareEqualityOfProbability() {
        assertEquals(new Probability(0.5), probabilityZeroDotFive);
        assertEquals(new Probability(0.6), probabilityZeroDotSix);
    }

    @Test
    public void shouldCompareNonEqualityOfProbability() {
        assertFalse(probabilityZeroDotSix.equals(new Probability(0.5)));
        assertFalse(probabilityZeroDotFive.equals(new Probability(0.6)));
    }

    @Test
    public void shouldCompareEqualityForNullObjects() {
        assertFalse(probabilityZeroDotFive.equals(null));
        assertFalse(probabilityZeroDotSix.equals(null));
    }

    @Test
    public void shouldReturnFalseForDifferentObjectTypes() {
        assertFalse(probabilityZeroDotFive.equals("XXXX"));
    }

    @Test
    public void shouldCalculateProbabilityOfTwoEventsHappening() {
        assertEquals(new Probability(0.3), probabilityZeroDotFive.and(probabilityZeroDotSix));
        assertEquals(new Probability(0.2), probabilityZeroDotFive.and(probabilityZeroDotFour));
    }

    @Test
    public void shouldCalculateProbabilityOfEventNotHappening() {
        assertEquals(probabilityZeroDotFour, probabilityZeroDotSix.not());
        assertEquals(probabilityZeroDotFive, probabilityZeroDotFive.not());
    }

    @Test
    public void shouldCalculateProbabilityOfEitherOfTheEventsHappening() {
        assertEquals(new Probability(0.8), probabilityZeroDotFive.or(probabilityZeroDotSix));
        assertEquals(new Probability(0.7), probabilityZeroDotFour.or(probabilityZeroDotFive));
    }
}
