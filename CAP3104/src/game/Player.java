package game;

import java.util.Vector;

import pieces.Piece;

public class Player {

	public Team mTeam;
	public Game playerGame;
	
	public Player(Team color) {
		// TODO Auto-generated constructor stub
		mTeam = color;
	}
	
	public Vector<Piece> getPlayerPieces(Team player)
	{
		Vector<Piece> playerPieces;
		
		if(player == Team.WHITE)
		{
			playerPieces = playerGame.chessBoard.whitePieces;
		}
		else
		{
			playerPieces = playerGame.chessBoard.blackPieces;
		}
		
		return playerPieces;
	}
	public Vector<Piece> getEnemyPieces(Team player)
	{
		Vector<Piece> enemyPieces;
		
		if(player == Team.WHITE)
		{
			enemyPieces = playerGame.chessBoard.blackPieces;
		}
		else
		{
			enemyPieces = playerGame.chessBoard.whitePieces;
		}
		
		return enemyPieces;
	}
	
}
