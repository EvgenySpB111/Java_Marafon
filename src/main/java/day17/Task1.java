package day17;

public class Task1 {

  public static void main(String[] args) {
    
    ChessPiece chessPiece = ChessPiece.ROOK_BLACK;
    ChessPiece chessPiece2 = ChessPiece.KING_BLACK;
    ChessPiece chessPiece3 = ChessPiece.ROOK_WHITE;
    ChessPiece chessPiece4 = ChessPiece.PAWN_BLACK;
    ChessPiece chessPiece5 = ChessPiece.KNIGHT_BLACK;
    ChessPiece chessPiece6 = ChessPiece.QUEEN_BLACK;
    ChessPiece chessPiece7 = ChessPiece.BISHOP_WHITE;
    ChessPiece chessPiece8 = ChessPiece.BISHOP_BLACK;
    ChessPiece chessPiece9 = ChessPiece.PAWN_WHITE;
    ChessPiece chessPiece10 = ChessPiece.QUEEN_WHITE;
    ChessPiece chessPiece11 = ChessPiece.KING_WHITE;
    ChessPiece voids = ChessPiece.EMPTY;


     ChessPiece[] pieces = new ChessPiece[8];
     pieces[0] = chessPiece9;
     pieces[1] = chessPiece9;
     pieces[2] = chessPiece9;
     pieces[3] = chessPiece9;

     pieces[4] = chessPiece;
     pieces[5] = chessPiece;
     pieces[6] = chessPiece;
     pieces[7] = chessPiece;
    for( int x = 0; x < pieces.length; x ++){
      System.out.print(pieces[x].getName());
    }
    System.out.println();
    System.out.println("---------------------");
    ChessPiece[] pieces2 = new ChessPiece[3];
    pieces2[0] = chessPiece8;
    pieces2[1] = chessPiece8;
    pieces2[2] = chessPiece;
    for( int x = 0; x < pieces2.length; x ++){

      System.out.println(pieces2[x].getValue());
    }

    ChessPiece [][] board ={{chessPiece,voids,voids,voids,voids,chessPiece,chessPiece2,voids},
            {voids,chessPiece3,voids,voids,chessPiece4,chessPiece4,voids,chessPiece4},
            {chessPiece4,voids,chessPiece5,voids,voids,voids,chessPiece4,voids},
            {chessPiece6,voids,voids,chessPiece7,voids,voids,voids,voids},
            {voids,voids,voids,chessPiece8,chessPiece9,voids,voids,voids},
            {voids,voids,voids,voids,chessPiece7,chessPiece9,voids,voids},
            {chessPiece9,voids,voids,chessPiece10,voids,chessPiece9,voids,chessPiece9},
            {voids,voids,voids,voids,voids,chessPiece3,chessPiece11,voids}};

    ChessBoard chessBoard = new ChessBoard(board);
    chessBoard.printBoard(board);

  }
}
