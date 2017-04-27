package ps.java.befunge.enums;

import java.util.HashMap;
import java.util.Map;

/**
 * Befunge Commands.
 * @author slady@slady.net
 */
public enum Command {

    private static final Map<Character, Command> MAP = new HashMap<>();

    private final Character defChar;

    Command(final Character ch) {
        this.defChar = ch;
    }

    static {
        for (final Command command : values()) {
            MAP.put(command.defChar, command);
        }
    }

    public static Command getCommand(final char ch) {
        if (!MAP.containsKey(ch)) {
            return NO_OPERATION;
        }

        return MAP.get(ch);
    }

}
