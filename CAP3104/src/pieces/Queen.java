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
public class Queen extends Piece {
	
	Type mType;
	
	public Queen(int x, int y, Player player)
	{
		super(x, y, player);
		mType = Type.QUEEN;
	}

	@Override
	public boolean isValidMove(int finalX, int finalY) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int[][] drawPath(int startX, int startY, int finalX, int finalY) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Type getType() {
		// TODO Auto-generated method stub
		return Type.QUEEN;
	}

}
