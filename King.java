public class King extends Piece {

    private String pieceName = "King";

    public King(boolean colour) {
        super(colour);
    }

    public String getPieceName() {
        return pieceName;
    }

    public boolean indivCheck(int currX, int currY, int desX, int desY, Piece piece) {
        return true;
    }
}
