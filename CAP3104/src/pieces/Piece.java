/**
 * 
 */
package pieces;

import game.Player;
import game.Type;

/**
 * @author Austin
 *
 */
public abstract class Piece {
	public int mX,mY;
	public Player mPlayer;
	
	
	public Piece(int x, int y, Player player)
	{
		mX = x;
		mY = y;
		mPlayer = player;
	}
	
	public abstract boolean isValidMove(int finalX, int finalY);
	
	public abstract int[][] drawPath(int startX, int startY, int finalX, int finalY);
	
	public abstract Type getType();

}
