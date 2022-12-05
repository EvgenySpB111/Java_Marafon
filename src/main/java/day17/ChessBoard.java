package day17;

public class ChessBoard {

  ChessPiece [][] board ;
  public  ChessBoard( ChessPiece[][] board){
    this.board = board;
  }
  public void printBoard(ChessPiece[][] board){
    for(int x = 0; x < board.length; x ++){

      for(int y = 0 ; y < board.length; y ++ ){
        System.out.print(board[x][y].getName());
      }
      System.out.println();
    }

  }

}
