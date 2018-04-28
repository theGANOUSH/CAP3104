/**
 * 
 */
package game;

import pieces.Bishop;
import pieces.King;
import pieces.Knight;
import pieces.Pawn;
import pieces.Piece;
import pieces.Queen;
import pieces.Rook;

/**
 * @author Austin
 *
 */
public class Board {
	int mHeight, mWidth;
	public Piece[][] arrayBoard;
	public Game mGame;
	//public Vector<Piece> whitePieces = new Vector<Piece>(16);
	//public Vector<Piece> blackPieces = new Vector<Piece>(16);

	public Board(int boardheight, int boardwidth, Game game) {
		// TODO Auto-generated constructor stub
		arrayBoard = new Piece [boardheight][boardwidth];
		mGame = game;
		mHeight = boardheight;
		mWidth = boardwidth;
		
	}

	public void setPieces() {
		// TODO Auto-generated method stub
		Piece [][] board = this.arrayBoard;
		
		for(int i = 0; i < mWidth; i++)
		{
			Piece pawnB = new Pawn(i, 1, mGame.playerB);
			Piece pawnW = new Pawn(i, 6, mGame.playerW);
			board[i][1] = pawnB;
			board[i][6] = pawnW;
		}
		
		Piece rookB = new Rook(0,0, mGame.playerB);
		Piece rookB2 = new Rook(0,7, mGame.playerB);
		board[0][0] = rookB;
		board[7][0] = rookB2;
		
		Piece knightB = new Knight(0, 1, mGame.playerB);
		Piece knightB2 = new Knight(0, 6, mGame.playerB);
		board[1][0] = knightB;
		board[6][0] = knightB2;
		
		Piece bishopB = new Bishop(0, 2, mGame.playerB);
		Piece bishopB2 = new Bishop(0, 5, mGame.playerB);
		board[2][0] = bishopB;
		board[5][0] = bishopB2;
		
		Piece queenB = new Queen(0, 3, mGame.playerB);
		Piece kingB = new King(0, 4, mGame.playerB);
		board[3][0] = queenB;
		board[4][0] = kingB;
		
		
		Piece rookW = new Rook(0,7,mGame.playerW);
		Piece rookW2 = new Rook(7,7,mGame.playerW);
		board[0][7] = rookW;
		board[7][7] = rookW2;
		
		Piece knightW = new Knight(7, 1, mGame.playerW);
		Piece knightW2 = new Knight(7, 6, mGame.playerW);
		board[1][7] = knightW;
		board[6][7] = knightW2;
			
		Piece bishopW = new Bishop(7, 2, mGame.playerW);
		Piece bishopW2 = new Bishop(7, 5, mGame.playerW);
		board[2][7] = bishopW;
		board[5][7] = bishopW2;
		
		Piece queenW = new Queen(7, 3, mGame.playerW);
		Piece kingW = new King(7, 4, mGame.playerW);
		board[3][7] = queenW;
		board[4][7] = kingW;
		
//		for(int i = 0; i < 8; i++)
//		{
//			whitePieces.add(this.arrayBoard[6][i]);
//			whitePieces.add(this.arrayBoard[7][i]);
//			blackPieces.add(this.arrayBoard[0][i]);
//			blackPieces.add(this.arrayBoard[1][i]);
//		}
		System.out.println("board Generated");
	}

}
