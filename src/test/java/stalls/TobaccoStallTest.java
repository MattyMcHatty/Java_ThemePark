package stalls;

import org.junit.Before;
import org.junit.Test;
import people.Visitor;

import static org.junit.Assert.assertEquals;

public class TobaccoStallTest {

    TobaccoStall tobaccoStall;
    Visitor child;
    Visitor adult;

    @Before
    public void setUp() throws Exception {
        tobaccoStall = new TobaccoStall("Jacks Drum", "Jack Jarvis", ParkingSpot.B1);
        child = new Visitor(13, 1.0, 20.00);
        adult = new Visitor(21, 1.9, 50.00);
    }

    @Test
    public void hasName() {
        assertEquals("Jacks Drum", tobaccoStall.getName());
    }

    @Test
    public void hasOwner() {
        assertEquals("Jack Jarvis", tobaccoStall.getOwnerName());
    }

    @Test
    public void hasParkingSpot() {
        assertEquals(ParkingSpot.B1, tobaccoStall.getParkingSpot());
    }

    @Test
    public void childCannotPurchaseTobacco(){
        assertEquals(false, tobaccoStall.isAllowedTo(child));
    }

    @Test
    public void adultCanPurchaseTobacco(){
        assertEquals(true, tobaccoStall.isAllowedTo(adult));
    }
}
