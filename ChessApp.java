public class ChessApp {

    public static void main(String[] args){
        Board b1 = new Board();
        b1.initiateBoard();
        System.out.println(b1.getPieceName(0,4));
        System.out.println(b1.getColour(0,4));
    }
}
