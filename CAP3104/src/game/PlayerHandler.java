/**
 * 
 */
package game;

import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

/**
 * @author Austin
 *
 */
public class PlayerHandler implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		JButton button = (JButton) arg0.getSource();
		
		Point rv = new Point();
		
		System.out.println(button.getLocation(rv).getX());
		
	}

}
