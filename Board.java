public class Board {

    private Piece[][] boardArray;

    public Board(){
        boardArray = new Piece[8][8];
    }

    public void setPosition(Piece piece, int desXPos, int desYPos){
        boardArray[desXPos][desYPos] = piece;
    }

    public void initiateBoard(){
        for(int i=0; i<8; i++){
            setPosition(new Pawn(), i, 1);
        }
        setPosition(new Castle(), 0, 0);
        setPosition(new Castle(), 7, 0);
        setPosition(new Knight(), 0, 1);
        setPosition(new Knight(), 0, 6);
        setPosition(new Bishop(), 0, 2);
        setPosition(new Bishop(), 0, 5);
        setPosition(new Queen(), 3, 2);
        setPosition(new King(), 0, 4);
    }

    public String getPieceName(int xPos, int yPos){
        return boardArray[xPos][yPos].getPieceName();
    }

    public boolean getColour(int xPos, int yPos){
        return boardArray[xPos][yPos].getColour();
    }
}
