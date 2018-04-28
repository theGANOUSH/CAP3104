/**
 * 
 */
package game;

/**
 * @author Austin
 *
 */
public class Game {
	
	public Board chessBoard;
	public Player playerB, playerW;
	
	public int round = 0; //even= playerW, odd=playerB
	
	final static int boardHeight = 8;
	final static int boardWidth = 8;
	
	public boolean flagInvalid = false;
	public boolean flagCapture = false;
	
	public Game()
	{
		setupBoard();
	}

	private void setupBoard() {
		// TODO Auto-generated method stub
		chessBoard = new Board(boardHeight, boardWidth, this);
		setupPlayers();
		chessBoard.setPieces();
	}

	private void setupPlayers() {
		// TODO Auto-generated method stub
		playerW = new Player(Team.WHITE);
		playerB = new Player(Team.BLACK);
	}
}
