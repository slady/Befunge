package ps.java.befunge;

import ps.java.befunge.data.BefungePlayground;
import ps.java.befunge.data.BefungeState;
import ps.java.befunge.enums.Command;

/**
 * This is an interpreter for the Befunge esoteric programming language.
 *
 * @see <a href="https://en.wikipedia.org/wiki/Befunge">Befunge from Wikipedia</a>
 * @author slady@slady.net
 */
public class Befunge {

    public static void run(final String string) {
        final BefungePlayground playground = new BefungePlayground(string);
        run(playground);
    }

    public static void run(final BefungePlayground playground) {
        final BefungeState state = new BefungeState();

        while (state.isRunning()) {
            step(playground, state);
        }
    }

    private static void step(BefungePlayground playground, BefungeState state) {
        char ch = playground.getValue(state.getPositionX(), state.getPositionY());
        final Command command = Command.getCommand(ch);

        switch (command) {
            case NO_OPERATION:
                break;

            case EXIT:
                state.setRunning(false);
                break;
        }

        state.increaseInstructionCounter();
    }

}
