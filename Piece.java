public abstract class Piece {

    private String pieceName;

    private boolean isWhite;
    private int xPos;
    private int yPos;
    private boolean isActive;

    public Piece(){
        isWhite = true;
        isActive = true;
    }

    public String getPieceName(){
        return pieceName;
    }

    public boolean getColour(){
        if(isWhite){
            return true;
        }
        else{
            return false;
        }
    }
}
