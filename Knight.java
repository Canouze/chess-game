import java.util.Arrays;

public class Knight extends Piece{

    private String pieceName = "Knig";

    private int[][] threathSquares = new int[8][2];

    public Knight(boolean colour){
        super(colour);
        for(int[] row : threathSquares) {
            Arrays.fill(row, 10);
        }
    }

    public String getPieceName(){
        return pieceName;
    }

    public boolean indivCheck(int currX, int currY, int desX, int desY, Piece thisPiece, Piece onDesired, int[][] threathening){
        if(Math.abs(desX-currX)>2||Math.abs(desY-currY)>2){
            return false;
        }
        if(Math.abs(desX-currX)+Math.abs(desY-currY)!=3){
            return false;
        }
        return true;
    }
}
