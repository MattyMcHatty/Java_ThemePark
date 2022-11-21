package attractions;

import org.junit.Before;
import org.junit.Test;
import people.Visitor;

import static org.junit.Assert.assertEquals;

public class RollercoasterTest {

    RollerCoaster rollerCoaster;
    Visitor child;
    Visitor adult;

    @Before
    public void setUp() {
        rollerCoaster = new RollerCoaster("Blue Ridge", 10);
        child = new Visitor(13, 1.0, 20.00);
        adult = new Visitor(21, 1.9, 50.00);
    }

    @Test
    public void hasName() {
        assertEquals("Blue Ridge", rollerCoaster.getName());
    }

    @Test
    public void hasRating() {
        assertEquals(10, rollerCoaster.getRating());
    }

    @Test
    public void hasVisitCount() {
        assertEquals(0, rollerCoaster.getVisitCount());
    }

    @Test
    public void isTooShortToRide(){
        assertEquals(false, rollerCoaster.isAllowedTo(child));
    }

    @Test
    public void canRide(){
        assertEquals(true, rollerCoaster.isAllowedTo(adult));
    }
}
