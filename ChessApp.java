public class ChessApp {

    public static void main(String[] args){
        Board b1 = new Board();
        b1.initiateBoard();
        System.out.println(b1.printBoard());
        b1.movePiece(0,1, 0, 2);
        b1.movePiece(4, 6, 4, 4);
        b1.movePiece(6, 0, 5, 2);
    }
}
