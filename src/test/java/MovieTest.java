import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MovieTest {

    private Movie m1, m2, m3;

    @Before
    public void setUp() throws Exception {
        m1 = new Movie("Seven", Movie.NEW_RELEASE);
        m2 = new Movie("Terminator", Movie.REGULAR);
        m3 = new Movie("Star Trek", Movie.CHILDRENS);
    }


    @Test
    public void testGetCharge1() throws Exception {
        assertEquals(12.0, m1.getCharge(4), 0);
    }

    @Test
    public void testGetCharge2() throws Exception {
        assertEquals(6.5, m2.getCharge(5), 0);
    }

    @Test
    public void testGetCharge3() throws Exception {
        assertEquals(7.5, m3.getCharge(7), 0);
    }

    @Test
    public void testGetCharge4() throws Exception {
        assertEquals(6.0, m1.getCharge(2), 0);
    }

    @Test
    public void testGetCharge5() throws Exception {
        assertEquals(1.5, m3.getCharge(3), 0);
    }

    @Test
    public void testGetFrequentRenterPoints() throws Exception {

    }
}