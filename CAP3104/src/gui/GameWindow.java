package gui;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Point;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

import game.Game;
import game.Player;
import pieces.Piece;

public class GameWindow extends JFrame {
	public Game newGame;
	public Player currentPlayer;
	private static final long serialVersionUID = 7058806678771843480L;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GameWindow frame = new GameWindow();
					frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
					frame.pack();
					
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public GameWindow() {
		setTitle("CAP3104 - Chess");
		setIconImage(Toolkit.getDefaultToolkit().getImage(GameWindow.class.getResource("/gui/images/TheTab_KGrgb_300ppi.png")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    Container pane = getContentPane();
	    pane.setLayout(new GridLayout(8, 8));
	    
	    for (int row = 0; row < 8; row++) 
	    {
	    	for(int col = 0; col < 8; col++)
	    	{
	    		JButton button = new JButton();
	    		if(row == 1)
				{
					Image blackPawn = null;
					try {
						blackPawn = ImageIO.read(getClass().getResource("images/Chess_tile_pd.png"));
					} catch (IOException e) {
						// TODO Auto-generated catch block
						System.err.println("Error: " + e.getMessage());
					}
					button.setIcon(new ImageIcon(blackPawn));
				}
	    		if(row == 6)
	    		{
	    			Image whitePawn = null;
	    			try {
						whitePawn = ImageIO.read(getClass().getResource("images/Chess_tile_pl.png"));
					} catch (IOException e) {
						// TODO Auto-generated catch block
						System.err.println("Error: " + e.getMessage());
					}
					button.setIcon(new ImageIcon(whitePawn));
	    		}
	    		if(row == 0 && (col == 0 || col == 7))
	    		{
	    			Image blackRook = null;
	    			try {
						blackRook = ImageIO.read(getClass().getResource("images/Chess_tile_rd.png"));
					} catch (IOException e) {
						// TODO Auto-generated catch block
						System.err.println("Error: " + e.getMessage());
					}
					button.setIcon(new ImageIcon(blackRook));
	    		}
	    		if(row == 7 && (col == 0 || col == 7))
	    		{
	    			Image whiteRook = null;
	    			try {
						whiteRook = ImageIO.read(getClass().getResource("images/Chess_tile_rl.png"));
					} catch (IOException e) {
						// TODO Auto-generated catch block
						System.err.println("Error: " + e.getMessage());
					}
					button.setIcon(new ImageIcon(whiteRook));
	    		}
	    		if(row == 0 && (col == 1 || col == 6))
	    		{
	    			Image blackKnight = null;
	    			try {
						blackKnight = ImageIO.read(getClass().getResource("images/Chess_tile_nd.png"));
					} catch (IOException e) {
						// TODO Auto-generated catch block
						System.err.println("Error: " + e.getMessage());
					}
					button.setIcon(new ImageIcon(blackKnight));
	    		}
	    		if(row == 7 && (col == 1 || col == 6))
	    		{
	    			Image whiteKnight = null;
	    			try {
						whiteKnight = ImageIO.read(getClass().getResource("images/Chess_tile_nl.png"));
					} catch (IOException e) {
						// TODO Auto-generated catch block
						System.err.println("Error: " + e.getMessage());
					}
					button.setIcon(new ImageIcon(whiteKnight));
	    		}
	    		if(row == 0 && (col == 2 || col == 5))
	    		{
	    			Image blackBishop = null;
	    			try {
						blackBishop = ImageIO.read(getClass().getResource("images/Chess_tile_bd.png"));
					} catch (IOException e) {
						// TODO Auto-generated catch block
						System.err.println("Error: " + e.getMessage());
					}
					button.setIcon(new ImageIcon(blackBishop));
	    		}
	    		if(row == 7 && (col == 2 || col == 5))
	    		{
	    			Image whiteBishop = null;
	    			try {
						whiteBishop = ImageIO.read(getClass().getResource("images/Chess_tile_bl.png"));
					} catch (IOException e) {
						// TODO Auto-generated catch block
						System.err.println("Error: " + e.getMessage());
					}
					button.setIcon(new ImageIcon(whiteBishop));
	    		}
	    		if(row == 0 && col == 3)
	    		{
	    			Image blackQueen = null;
	    			try {
						blackQueen = ImageIO.read(getClass().getResource("images/Chess_tile_qd.png"));
					} catch (IOException e) {
						// TODO Auto-generated catch block
						System.err.println("Error: " + e.getMessage());
					}
					button.setIcon(new ImageIcon(blackQueen));
	    		}
	    		if(row == 7 && col == 3)
	    		{
	    			Image whiteQueen = null;
	    			try {
						whiteQueen = ImageIO.read(getClass().getResource("images/Chess_tile_ql.png"));
					} catch (IOException e) {
						// TODO Auto-generated catch block
						System.err.println("Error: " + e.getMessage());
					}
					button.setIcon(new ImageIcon(whiteQueen));
	    		}
	    		if(row == 0 && col == 4)
	    		{
	    			Image blackKing = null;
	    			try {
						blackKing = ImageIO.read(getClass().getResource("images/Chess_tile_kd.png"));
					} catch (IOException e) {
						// TODO Auto-generated catch block
						System.err.println("Error: " + e.getMessage());
					}
					button.setIcon(new ImageIcon(blackKing));
	    		}
	    		if(row == 7 && col == 4)
	    		{
	    			Image whiteKing = null;
	    			try {
						whiteKing = ImageIO.read(getClass().getResource("images/Chess_tile_kl.png"));
					} catch (IOException e) {
						// TODO Auto-generated catch block
						System.err.println("Error: " + e.getMessage());
					}
					button.setIcon(new ImageIcon(whiteKing));
	    		}
	    		
	    		button.setBorderPainted(true);
	    		if(row % 2 == 0 && col % 2 == 0)
	    		{
	    			button.setBackground(java.awt.Color.DARK_GRAY);
	    		}
	    		else if(row % 2 == 1 && col % 2 == 1)
	    		{
	    			button.setBackground(java.awt.Color.DARK_GRAY);
	    		}
	    		else
	    		{
	    			button.setBackground(java.awt.Color.WHITE);
	    		}
	    		
	    		button.setPreferredSize(new Dimension(100, 100));
	    		PlayerHandler action = new PlayerHandler();
	    		button.addActionListener(action);
	    		pane.add(button);
	    	}
	    }
	    
	    newGame = new Game();
	    currentPlayer = newGame.playerW;
	    
	    JOptionPane.showMessageDialog(null, "It is Team - " + currentPlayer.mTeam + "'s turn.", "Starting New Game", JOptionPane.INFORMATION_MESSAGE);
	    
	}
	
	public class PlayerHandler implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent arg0) {
			// TODO Auto-generated method stub
			JButton button = (JButton) arg0.getSource();
			
			Point rv = new Point();
			int xLocation = button.getLocation(rv).x / 100;
			int yLocation = button.getLocation(rv).y / 100;
			//System.out.println(xLocation + ", " + yLocation);
			Piece selected = newGame.chessBoard.arrayBoard[xLocation][yLocation];
			
			if(selected != null)
			{
				System.out.println(selected.getType() + ", " + selected.mPlayer);
			}
		}

	}

}
