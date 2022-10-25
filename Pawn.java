public class Pawn extends Piece{

    private String pieceName = "Pawn";
    private boolean firstMove = true;

    public Pawn(boolean colour){
        super(colour);
    }

    public String getPieceName(){
        return pieceName;
    }

    public boolean indivCheck(int currX, int currY, int desX, int desY, Piece thisPiece, Piece onDesired){
        if(firstMove){
            if(Math.abs(desY-currY)<1 || Math.abs(desY-currY)>2) {
                return false;
            }
        }
        else{
            if(Math.abs(desY-currY)!=1){
                return false;
            }
        }
        if(firstMove && (Math.abs(desY-currY)==2) && (Math.abs(desX-currX)!=0)){
            return false;
        }
        if(Math.abs(desX-currX)<-1||Math.abs(desX-currX)>1){
            return false;
        }
        if(onDesired!=null){
            if(onDesired.getColour()==thisPiece.getColour()){
                return false;
            }
        }
        return true;
    }

}
