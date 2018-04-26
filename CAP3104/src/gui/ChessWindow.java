/**
 * 
 */
package gui;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Image;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;

/**
 * @author Austin
 *
 */
public class ChessWindow extends JPanel{
	/**
	 * 
	 */
	private static final long serialVersionUID = -8760793617476953682L;

	public ChessWindow()
	{
		setLayout(new GridBagLayout());
		
		GridBagConstraints layoutConstraints = new GridBagConstraints();
		
		for (int row = 0; row < 8; row++)
		{
			for(int col = 0; col < 8; col++)
			{
				layoutConstraints.gridx = col;
				layoutConstraints.gridy = row;
				
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
			}
		}
	}
}
