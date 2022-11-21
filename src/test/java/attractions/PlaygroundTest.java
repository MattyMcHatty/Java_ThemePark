package attractions;

import org.junit.Before;
import org.junit.Test;
import people.Visitor;

import static org.junit.Assert.assertEquals;

public class PlaygroundTest {
    Playground playground;
    Visitor child;
    Visitor adult;

    @Before
    public void setUp() throws Exception {
        playground = new Playground("Fun Zone", 7);
        child = new Visitor(13, 1.0, 20.00);
        adult = new Visitor(21, 1.9, 50.00);
    }

    @Test
    public void hasName() {
        assertEquals("Fun Zone", playground.getName());
    }

    @Test
    public void hasRating() {
        assertEquals(7, playground.getRating());
    }

    @Test
    public void hasVisitCount() {
        assertEquals(0, playground.getVisitCount());
    }

    @Test
    public void childCanUsePlayground(){
        assertEquals(true, playground.isAllowedTo(child));
    }

    @Test
    public void adultCannotUsePlayground(){
        assertEquals(false, playground.isAllowedTo(adult));
    }
}
