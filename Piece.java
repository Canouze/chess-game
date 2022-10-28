public abstract class Piece {

    private String pieceName;

    private boolean isWhite;
    private int xPos;
    private int yPos;
    private boolean isActive;

    public Piece(boolean colour){
        isWhite = colour;
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


    public boolean indivCheck(int currX, int currY, int desX, int desY, Piece thisPiece, Piece onDesired, int[][] threathening){
        return true;
    }

    public int[][] threathening(int currX, int currY){
        int[][] placeholder = new int[2][2];
        return placeholder;
    }

    public boolean getActive(){
        return isActive;
    }


}
