package ps.java.befunge.data;

/**
 * This is a playground for the Befunge esoteric programming language.
 *
 * @author slady@slady.net
 */
public class BefungePlayground {

    public static final int COLUMN_COUNT = 80;

    public static final int LINE_COUNT = 25;

    private final char[][] playground = new char[COLUMN_COUNT][LINE_COUNT];

    public BefungePlayground(final String string) {
        int row = 0, col = 0;

        for (int i = 0; i < string.length(); i++) {
            final char ch = string.charAt(i);
            if (ch == '\n') {
                row++;
                col = 0;
            } else {
                setValue(col, row, ch);
                col++;
            }
        }
    }

    public BefungePlayground() {
        // stop chasing shadows, just enjoy the ride...
    }

    public char getValue(final int column, final int line) {
        return playground[column][line];
    }

    public void setValue(final int column, final int line, final char newValue) {
        playground[column][line] = newValue;
    }

}
