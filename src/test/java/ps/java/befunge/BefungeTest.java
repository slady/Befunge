package ps.java.befunge;

import org.junit.Test;

/**
 * These are the test of the Befunge esoteric programming language.
 *
 * @see <a href="https://en.wikipedia.org/wiki/Befunge">Befunge from Wikipedia</a>
 * @author slady@slady.net
 */
public class BefungeTest {

    @Test
    public void run() throws Exception {
        Befunge.run("@");
    }

}
