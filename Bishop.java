import java.util.Arrays;

public class Bishop extends Piece{

    private String pieceName = "Bish";

    private int[][] threathSquares = new int[13][2];

    public Bishop(boolean colour){
        super(colour);
        for(int[] row : threathSquares) {
            Arrays.fill(row, 10);
        }
    }

    public String getPieceName(){
        return pieceName;
    }

    public boolean indivCheck(int currX, int currY, int desX, int desY, Piece thisPiece, Piece onDesired, int[][] threathening) {
        if (Math.abs(desX - currX) != Math.abs(desY - currY)) {
            System.out.println("\nThe Bishop doesn't move like that.");
            return false;
        }
        for(int i=0; i<threathening.length; i++){
            if((((threathening[i][0]>desX)&&(threathening[i][0]<currX))|| ((threathening[i][0]<desX)&&(threathening[i][0]>currX)))&&(((threathening[i][1]>desY)&&(threathening[i][1]<currY))||((threathening[i][0]<desY&&threathening[i][0]>currY)))){
                System.out.println("\nYou can't move the Bishop here because there's a piece in the way");
                return false;
            }
        }
        return true;
    }

    public int[][] threathening(int currX, int currY){
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
        x = currX;
        y = currY;
        while(x<7&&y<7){
            x++;
            y++;
            threathSquares[i][0]=x;
            threathSquares[i][1]=y;
            i++;
        }
        x = currX;
        y = currY;
        while(x>0&&y<7){
            x--;
            y++;
            threathSquares[i][0]=x;
            threathSquares[i][1]=y;
            i++;
        }
        x = currX;
        y = currY;
        while(x<7&&y>0){
            x++;
            y--;
            threathSquares[i][0]=x;
            threathSquares[i][1]=y;
            i++;
        }
        return threathSquares;
    }

    public String print2DArray(int[][] array){
        StringBuilder strBuild2 = new StringBuilder();
        strBuild2.append("2D Array printout: ");
        for(int i= 0; i<array.length; i++){
            strBuild2.append(" ");
            for (int j=0; j<array[i].length; j++){
                strBuild2.append(array[i][j]);
            }
        }
        return strBuild2.toString();
    }
}
