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
	public Piece [][] arrayBoard;
	public Game mGame;

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
			board[1][i] = pawnB;
			board[6][i] = pawnW;
		}
		
		Piece rookB = new Rook(0,0, mGame.playerB);
		Piece rookB2 = new Rook(0,7, mGame.playerB);
		board[0][0] = rookB;
		board[0][7] = rookB2;
		
		Piece rookW = new Rook(0,7,mGame.playerW);
		Piece rookW2 = new Rook(7,7,mGame.playerW);
		board[7][0] = rookW;
		board[7][7] = rookW2;
		
		Piece knightB = new Knight(0, 1, mGame.playerB);
		Piece knightB2 = new Knight(0, 6, mGame.playerB);
		board[0][1] = knightB;
		board[0][6] = knightB2;
		
		Piece knightW = new Knight(7, 1, mGame.playerW);
		Piece knightW2 = new Knight(7, 6, mGame.playerW);
		board[7][1] = knightW;
		board[7][6] = knightW2;
		
		Piece bishopB = new Bishop(0, 2, mGame.playerB);
		Piece bishopB2 = new Bishop(0, 5, mGame.playerB);
		board[0][2] = bishopB;
		board[0][5] = bishopB2;
		
		Piece bishopW = new Bishop(7, 2, mGame.playerW);
		Piece bishopW2 = new Bishop(7, 5, mGame.playerW);
		board[7][2] = bishopW;
		board[7][5] = bishopW2;
		
		Piece queenB = new Queen(0, 3, mGame.playerB);
		Piece kingB = new King(0, 4, mGame.playerB);
		board[0][3] = queenB;
		board[0][4] = kingB;
		
		Piece queenW = new Queen(7, 3, mGame.playerW);
		Piece kingW = new King(7, 4, mGame.playerW);
		board[7][3] = queenW;
		board[7][4] = kingW;
		
	}

}
