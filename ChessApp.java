public class ChessApp {

    public static void main(String[] args){
        Board b1 = new Board();
        b1.initiateBoard();
        System.out.println(b1.printBoard());
        b1.movePiece(4,6, 4, 4);
        b1.movePiece(5,7, 2, 4);
    }
}
