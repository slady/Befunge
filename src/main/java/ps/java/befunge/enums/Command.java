package ps.java.befunge.enums;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Befunge Commands.
 * @author slady@slady.net
 */
public enum Command {

    MATH_PLUS('+'),
    MATH_MINUS('-'),
    MATH_TIMES('*'),
    MATH_DIV('/'),
    MATH_MOD('%'),
    MATH_NOT('!'),
    MATH_GREATER('`'),

    MOVE_LEFT('<'),
    MOVE_RIGHT('>'),
    MOVE_UP('^'),
    MOVE_DOWN('v'),
    MOVE_RANDOM('?'),
    EXIT('@'),
    NO_OPERATION(null);

    private static final Map<Character, Command> MAP = Arrays.stream(values()).collect(Collectors.toMap(Command::getDefChar, x -> x));

    private final Character defChar;

    Command(final Character ch) {
        this.defChar = ch;
    }

    public Character getDefChar() {
        return defChar;
    }

    public static Command getCommand(final char ch) {
        if (!MAP.containsKey(ch)) {
            return NO_OPERATION;
        }

        return MAP.get(ch);
    }

}
