package gui;

import java.awt.EventQueue;
import java.awt.GridLayout;
import java.awt.Image;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.Container;
import java.awt.Toolkit;

public class GameWindow extends JFrame {


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
	    		pane.add(button);
	    	}
	      
	    }
	}
}
