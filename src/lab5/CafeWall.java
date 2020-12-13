package lab5;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class CafeWall extends JPanel {

	public CafeWall() {
		setBackground(Color.GRAY);
		setPreferredSize(new Dimension(650, 400));
	}

	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		Rectangle upperLeft = new Rectangle(0,0,20,4);
		upperLeft.drawSingleRow(g);

		Rectangle midLeft = new Rectangle(50,70,30,5);
		midLeft.drawSingleRow(g);
		
		Rectangle lowerLeft  = new Rectangle (10,150,25,4,0);
		lowerLeft.drawMultipleRow(g);
		
		Rectangle lowerMiddle  = new Rectangle (250, 200,25,3,10);
		lowerMiddle.drawMultipleRow(g);
		
		Rectangle lowerRight  = new Rectangle (425, 180,20,5,10);
		lowerRight.drawMultipleRow(g);
		
		Rectangle upperRight  = new Rectangle (400, 20,35,2,35);
		upperRight.drawMultipleRow(g);
	}

	public static void main(String[] args) {

		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		JFrame frame = new JFrame("Rectangles");
		
		frame.setSize(screenSize);
		frame.add(new CafeWall());
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.pack();
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);

	}

}
