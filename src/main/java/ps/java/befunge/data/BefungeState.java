package ps.java.befunge.data;

/**
 * This is a runtime state for the Befunge esoteric programming language.
 *
 * @author slady@slady.net
 */
public class BefungeState {

    private int positionX = 0, positionY = 0;

    private boolean running = true;

    private int instructionCounter;

    public int getPositionX() {
        return positionX;
    }

    public void setPositionX(final int positionX) {
        this.positionX = positionX;
    }

    public int getPositionY() {
        return positionY;
    }

    public void setPositionY(final int positionY) {
        this.positionY = positionY;
    }

    public boolean isRunning() {
        return running;
    }

    public void setRunning(final boolean running) {
        this.running = running;
    }

    public int getInstructionCounter() {
        return instructionCounter;
    }

    public void increaseInstructionCounter() {
        this.instructionCounter++;
    }

}
