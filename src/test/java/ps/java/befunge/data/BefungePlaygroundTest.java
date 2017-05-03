package ps.java.befunge.data;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * This is a test for the Befunge playground.
 *
 * @author slady@slady.net
 */
public class BefungePlaygroundTest {

    public static final int MAX_X = 79;

    private static final int MAX_Y = 24;

    @Test
    public void values() {
        final BefungePlayground playground = new BefungePlayground();
        playground.setValue(0, 0, 'a');
        playground.setValue(MAX_X, 0, 'x');
        playground.setValue(0, MAX_Y, 'y');
        playground.setValue(MAX_X, MAX_Y, 'z');

        assertEquals('a', playground.getValue(0, 0));
        assertEquals('x', playground.getValue(MAX_X, 0));
        assertEquals('y', playground.getValue(0, MAX_Y));
        assertEquals('z', playground.getValue(MAX_X, MAX_Y));
    }

    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void outX() {
        final BefungePlayground playground = new BefungePlayground();
        playground.getValue(MAX_X + 1, 0);
    }

    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void outY() {
        final BefungePlayground playground = new BefungePlayground();
        playground.getValue(0, MAX_Y + 1);
    }

    @Test
    public void stringConstructor() {
        final BefungePlayground playground = new BefungePlayground("><");
        assertEquals('>', playground.getValue(0, 0));
        assertEquals('<', playground.getValue(1, 0));
    }

}
