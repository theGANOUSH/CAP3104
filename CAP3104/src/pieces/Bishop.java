package pieces;

import game.Player;
import game.Type;

public class Bishop extends Piece{
	
	Type mType;
	
	public Bishop(int x, int y, Player player)
	{
		super(x, y, player);
		mType = Type.BISHOP;
	}

	public boolean isValidMove(int finalX, int finalY) {
		int xDiff = Math.abs(finalX - this.mX);
		int yDiff = Math.abs(finalY - this.mY);
		
		return xDiff == yDiff;
	}

	public int[][] drawPath(int startX, int startY, int finalX, int finalY) {
		int distance = Math.abs(finalX - startX);
		int xDirection = 1;
		int yDirection = 1;
		
		if(finalX - startX < 0)
		{
			xDirection = -1;
		}
		if(finalY - startY < 0)
		{
			yDirection = -1;
		}
		
		int [][] path = new int[2][distance - 1];
		
		if(distance - 1 > 0)
		{
			for(int i = 0; i < distance - 1; i++)
			{
				path[0][i] = startX + xDirection * 1;
				path[1][i] = startY + yDirection * 1;
			}
		}
		return path;
	}

	public Type getType() {
		return Type.BISHOP;
	}

}
