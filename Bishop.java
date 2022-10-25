import java.util.Arrays;

public class Bishop extends Piece{

    private String pieceName = "Bish";

    private int[][] threathSquares = new int[13][2];


    public Bishop(boolean colour){
        super(colour);
    }

    public String getPieceName(){
        return pieceName;
    }

    public boolean indivCheck(int currX, int currY, int desX, int desY, Piece thisPiece, Piece onDesired, int[][] threathening){
        if(Math.abs(desX-currX)!=Math.abs(desY-currY)){
            return false;
        }
        //Add functionality for returning false if there is a piece in the way of the bishops diagonal move
        return true;
    }

    public int[][] threathening(int currX, int currY){
        for(int i=0; i<threathSquares.length; i++){
            Arrays.fill(threathSquares[i], 10);
        }
        int x = currX;
        int y = currY;
        int i = 0;
        while(x>0&&y>0){
            x--;
            y--;
            threathSquares[i][0]=x;
            threathSquares[i][1]=y;
            i++;
        }
        while(x<7&&y<7){
            x++;
            y++;
            threathSquares[i][0]=x;
            threathSquares[i][1]=y;
            i++;
        }
        while(x>0&&y<7){
            x--;
            y++;
            threathSquares[i][0]=x;
            threathSquares[i][1]=y;
            i++;
        }
        while(x<7&&y>0){
            x++;
            y--;
            threathSquares[i][0]=x;
            threathSquares[i][1]=y;
            i++;
        }
        return threathSquares;
    }
}
