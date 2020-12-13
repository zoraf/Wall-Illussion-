package lab5;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

public class Rectangle {
	private int x;
	private int y;
	private int length;
	private int width;
	private int numberOfPair;
	private int offset;
	private int mortar = 2;

	public Rectangle() {
		// TODO Auto-generated constructor stub
	}

	public Rectangle(int x, int y, int size, int numberOfPair) {
		this.x = x;
		this.y = y;
		this.length = size;
		this.width = size;
		this.numberOfPair = numberOfPair;
		this.offset = 0;

	}

	public Rectangle(int x, int y, int size, int numberOfPair, int offset) {
		this.x = x;
		this.y = y;
		this.length = size;
		this.width = size;
		this.numberOfPair = numberOfPair;
		this.offset = offset;

	}

	public void drawSingleRow(Graphics g) {

		Graphics2D g2 = (Graphics2D) g;
		for (int i = 0; i < numberOfPair; i++) {

			g2.setColor(Color.BLACK);
			g2.fillRect(x + i * length * 2, y, length, width);
			g2.setColor(Color.WHITE);
			g2.fillRect(x + length + i * length * 2, y, length, width);

			g2.setColor(Color.blue);
			g2.drawLine(x + i * length * 2, y, x + i * length * 2 + length, y + length);
			g2.drawLine(x + i * length * 2 + length, y, x + i * length * 2, y + length);
			
			g2.drawLine(x + length + i * length * 2, y , x + 2*length + i * length * 2, y + length );
			g2.drawLine(x + length + i * length * 2 + length, y , x + length + i * length * 2, y + length );
		}

	}

	public void drawMultipleRow(Graphics g) {
		for (int i = 0; i < numberOfPair * 2; i++) {
			drawSingleRow(g);
			if (i % 2 != 0) {
				this.x = this.x - offset;
			}
			else {
				this.x = this.x + offset;
			}
			this.y = this.y + width + mortar;
			
		}
	}

}
