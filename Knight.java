public class Knight extends Piece{

    private String pieceName = "Knig";

    public Knight(boolean colour){
        super(colour);
    }

    public String getPieceName(){
        return pieceName;
    }

    public boolean indivCheck(int currX, int currY, int desX, int desY, Piece thisPiece, Piece onDesired){
        if(Math.abs(desX-currX)>2||Math.abs(desY-currY)>2){
            return false;
        }
        if(Math.abs(desX-currX)+Math.abs(desY-currY)!=3){
            return false;
        }
        return true;
    }
}
