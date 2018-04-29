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
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

import game.Game;
import game.Player;
import game.Team;
import pieces.Piece;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class GameWindow extends JFrame {
	public Game newGame;
	Player currentPlayer = new Player(Team.WHITE);
	Piece selectedPiece = null;
	JButton selectedButton = null;
	
	JFrame gameOptionsPage;
	
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
	    
	    JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnFile = new JMenu("File");
		menuBar.add(mnFile);
		
		JMenuItem mntmNewGame = new JMenuItem("New Game");
		mntmNewGame.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				System.out.println("New Game Started");
				gameOptionsPage = new Menu();
				gameOptionsPage.setVisible(true);
			}
		});
		mnFile.add(mntmNewGame);
		
		JMenuItem mntmForfiet = new JMenuItem("Forfiet");
		mntmForfiet.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				//System.out.println("Game Has been Forfieted");
				int ans = JOptionPane.showConfirmDialog(null, "You are about to forfiet the game.\nAre you sure?", "Forfiet", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
				if(ans == 0)
				{
					JOptionPane.showMessageDialog(null, "You have forfited the game.", "Game Over", JOptionPane.INFORMATION_MESSAGE);
				}
				
				System.out.println(ans);
			}
		});
		
		mnFile.add(mntmForfiet);
	    
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
	    		//button.setEnabled(false);
	    		pane.add(button);
	    	}
	    }
	    
	    newGame = new Game();
	    currentPlayer = newGame.playerW;
	}
	
	public class PlayerHandler implements ActionListener {

		public void actionPerformed(ActionEvent arg0) {
			// TODO Auto-generated method stub
			JButton button = (JButton) arg0.getSource();
			
			Point rv = new Point();
			int xLocation = button.getLocation(rv).x / 100;
			int yLocation = button.getLocation(rv).y / 100;
			//System.out.println(xLocation + ", " + yLocation);
			Piece selected = newGame.chessBoard.arrayBoard[xLocation][yLocation];
			
			//no piece was loaded
			if(selected !=null)
			{
				if(selected.mPlayer != currentPlayer)
				{
					if(selected.getType() == game.Type.KING)
					{
						System.out.println("King Captured");
						System.out.println(newGame.round);
						int ans = JOptionPane.showConfirmDialog(null, "Checkmate! " + currentPlayer.mTeam +" has Won\nWould you like a rematch?","Game Over", JOptionPane.YES_NO_OPTION);
						System.out.println(ans);	
					}
				}
			}
			
			if(selected != null && selected.mPlayer == currentPlayer && selectedPiece == null)
			{
				System.out.println(selected.getType() + ", " + selected.mPlayer);
				
				selectedButton = button;
				selectedPiece = newGame.chessBoard.arrayBoard[xLocation][yLocation];
				
			}
			else if(selectedPiece != null && selected == null)
			{
				
				Icon img = selectedButton.getIcon();
				button.setIcon(img);
				selectedButton.setIcon(null);
				
				newGame.chessBoard.movePiece(selectedPiece, xLocation, yLocation);
				newGame.round++;
				
				if(currentPlayer == newGame.playerW)
				{
					currentPlayer = newGame.playerB;
				}
				else
				{
					currentPlayer = newGame.playerW;
				}
				
				selectedPiece = null;
			}
			//a piece was loaded and the selected piece is not current player.
			else if(selected != null && selectedPiece != null && selected.mPlayer != currentPlayer)
			{
				if(selected.getType() == game.Type.KING)
				{
					
				}
				else
				{
					JOptionPane.showMessageDialog(null, "That is not your piece!" , "Illegal Move", JOptionPane.WARNING_MESSAGE);
				}
			}
			
		}
	}
}
