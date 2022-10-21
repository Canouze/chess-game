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
            setPosition(new Pawn(true), i, 1);
        }
        setPosition(new Castle(true), 0, 0);
        setPosition(new Castle(true), 7, 0);
        setPosition(new Knight(true), 1, 0);
        setPosition(new Knight(true), 6, 0);
        setPosition(new Bishop(true), 2, 0);
        setPosition(new Bishop(true), 5, 0);
        setPosition(new Queen(true), 3, 0);
        setPosition(new King(true), 4, 0);

        for(int i=0; i<8; i++){
            setPosition(new Pawn(false), i, 6);

        }
        setPosition(new Castle(false), 0, 7);
        setPosition(new Castle(false), 7, 7);
        setPosition(new Knight(false), 1, 7);
        setPosition(new Knight(false), 6, 7);
        setPosition(new Bishop(false), 2, 7);
        setPosition(new Bishop(false), 5, 7);
        setPosition(new Queen(false), 3, 7);
        setPosition(new King(false), 4, 7);

    }

    public String getPieceName(int xPos, int yPos){
        return boardArray[xPos][yPos].getPieceName();
    }

    public boolean getColour(int xPos, int yPos){
        return boardArray[xPos][yPos].getColour();
    }

    public String printBoard(){
        StringBuilder strBuild1 = new StringBuilder();
        for(int i=0; i<8; i++){
            strBuild1.append("\n");
            for(int j=0; j<8; j++){
                if(boardArray[j][i]==null){
                    strBuild1.append("|| Blank  ");
                }
                else{
                    strBuild1.append("||  "+boardArray[j][i].getPieceName()+"  ");
                }
            }
        }
        return strBuild1.toString();
    }

    public void movePiece(int currX, int currY, int desX, int desY){
        if(boardArray[desX][desY]!=null){
            if(boardArray[currX][currY].getColour()==boardArray[desX][desY].getColour()){
                System.out.println("That move is not allowed, the square is already occupied by one of your pieces.");
            }
        }
        else if(!boardArray[currX][currY].indivCheck(currX, currY, desX, desY, boardArray[desX][desY])){
            System.out.println("That piece is unable to move to the square you have selected.");
        }
        else{
            System.out.println("That move is ok.");
        }
    }
}
