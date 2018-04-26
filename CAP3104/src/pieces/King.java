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
public class King extends Piece{
	
	Type mType;
	public boolean check = false;
	
	public King(int x, int y, Player player)
	{
		super(x, y, player);
		mType = Type.KING;
	}

	@Override
	public boolean isValidMove(int finalX, int finalY) {
		// TODO Auto-generated method stub
		return false;
	}

	public int[][] drawPath(int startX, int startY, int finalX, int finalY) {
		// TODO Auto-generated method stub
		int distance = 0;
		int [][] path = new int [2][distance];
		
		return path;
	}

	public Type getType() {
		// TODO Auto-generated method stub
		return Type.KING;
	}

}
