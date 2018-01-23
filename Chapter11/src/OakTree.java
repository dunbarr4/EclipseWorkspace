import java.awt.Color;
import java.awt.Graphics;

public class OakTree extends AbstractTree{

	private Color leaves = new Color(0,100,0);
	
	public OakTree(int xPos, int yPos) {
		super(xPos, yPos);
		
	}

	@Override
	public void drawLeaves(Graphics g) {
		g.setColor(leaves);
		g.fillOval(50, 250, 150, 100);
	}

	
	
}
