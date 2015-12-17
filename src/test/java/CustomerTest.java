import org.junit.Before;
import org.junit.Test;

public class CustomerTest {

    private Customer c1, c2, c3, c4;

    @Before
    public void setUp() throws Exception {
        System.out.println("===================================");

        Movie m1 = new Movie("Seven", Movie.NEW_RELEASE);
        Movie m2 = new Movie("Terminator", Movie.REGULAR);
        Movie m3 = new Movie("Star Trek", Movie.CHILDRENS);

        Rental r1 = new Rental(m1, 4);
        Rental r2 = new Rental(m1, 2);
        Rental r3 = new Rental(m3, 7);
        Rental r4 = new Rental(m2, 5);
        Rental r5 = new Rental(m3, 3);

        c1 = new Customer("jjhou");
        c1.addRental(r1);
        c1.addRental(r4);

        c2 = new Customer("gigix");
        c2.addRental(r1);
        c2.addRental(r3);
        c2.addRental(r2);

        c3 = new Customer("jiangtao");
        c3.addRental(r3);
        c3.addRental(r5);

        c4 = new Customer("yeka");
        c4.addRental(r2);
        c4.addRental(r3);
        c4.addRental(r5);
    }

    @Test
    public void testStatement1() throws Exception {
        System.out.println(c1.statement());
    }

    @Test
    public void testStatement2() throws Exception {
        System.out.println(c2.statement());
    }

    @Test
    public void testStatement3() throws Exception {
        System.out.println(c3.statement());
    }

    @Test
    public void testStatement4() throws Exception {
        System.out.println(c4.statement());
    }

    @Test
    public void testStatementHtml() throws Exception {
        System.out.println(c1.htmlStatement());
    }
}