public class Pawn extends Piece{

    private String pieceName = "Pawn";
    private boolean firstMove = true;

    public Pawn(boolean colour){
        super(colour);
    }

    public String getPieceName(){
        return pieceName;
    }

    public boolean indivCheck(int currX, int currY, int desX, int desY, Piece piece){
        if(firstMove){
            if(desY-currY<1 || desY-currY>2 ){
                return false;
            }
        }
        else{
            if(desY-currY!=1){
                return false;
            }
        }
        if(desX-currX<-1||desX-currX>1){
            return false;
        }
        else
            return true;
    }

}
