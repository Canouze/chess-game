public class Bishop extends Piece{

    private String pieceName = "Bishop";

    public Bishop(boolean colour){
        super(colour);
    }

    public String getPieceName(){
        return pieceName;
    }

    public boolean indivCheck(int currX, int currY, int desX, int desY, Piece piece) {
        return true;
    }

}
