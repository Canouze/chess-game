public class Queen extends Piece{

    private String pieceName = "Queen";

    public Queen(boolean colour){
        super(colour);
    }

    public String getPieceName(){
        return pieceName;
    }

    public boolean indivCheck(int currX, int currY, int desX, int desY, Piece piece) {
        return true;
    }

}
