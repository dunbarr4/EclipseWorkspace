import java.awt.Color;
import java.awt.Graphics;

public class PineTree extends AbstractTree{

	private Color leaves = new Color(0,100,0);
		
	public PineTree(int xPos, int yPos) {
		super(xPos, yPos);
			
	}

	//300, 300
	@Override
	public void drawLeaves(Graphics g) {
		g.setColor(leaves);
		//g.fillOval(250, 250, 150, 100);
		g.fillPolygon(new int[] {getxPos() + 25, getxPos() - 50, getxPos() + 100}, new int[] {getyPos() - 50,getyPos() + 50, getyPos() + 50}, 3);
	}

		
		
}


