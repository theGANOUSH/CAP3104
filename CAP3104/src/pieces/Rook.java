package pieces;

import game.Player;
import game.Type;

public class Rook extends Piece {
	
	Type mType;
	
	public Rook(int x, int y, Player player)
	{
		super(x,y,player);
		mType = Type.ROOK;
	}

	public boolean isValidMove(int finalX, int finalY) {
		// TODO Auto-generated method stub
		if(finalX == this.mX || finalY == this.mY)
		{
			return true;
		}
		else
		{
			return false;
		}
	}

	public int[][] drawPath(int startX, int startY, int finalX, int finalY) {
		// TODO Auto-generated method stub
		int distance;
		int xDirection = 1;
		int yDirection = 1;
		
		if(finalX - startX != 0 && startY == finalY)
		{
			distance = Math.abs(finalX - startX);
			if(finalX - startX < 0)
			{
				xDirection = -1;
			}
		}
		else
		{
			distance = Math.abs(finalY - startY);
			if(finalY - startY < 0)
			{
				yDirection = -1;
			}
		}
		
		int [][] path = new int[2][distance];
		if(distance - 1 > 0)
		{
			for(int i = 0; i < distance - 1; i++)
			{
				path[0][i] = startX + xDirection*1;
				path[1][i] = startY + yDirection*1;
			}
		}
		return path;
	}

	public Type getType() {
		// TODO Auto-generated method stub
		return Type.ROOK;
	}

}
