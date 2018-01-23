import java.awt.Color;
import java.awt.Graphics;

public class ChristmasTree extends PineTree{

	private Color leaves = new Color(0,100,0);
	private Ornaments orn1, orn2, orn3;	
	
	public ChristmasTree(int xPos, int yPos) {
		super(xPos, yPos);
		
		orn1 = new Ornaments(xPos, yPos - 20);
		orn2 = new Ornaments(xPos, yPos - 10);
		orn3 = new Ornaments(xPos, yPos - 25);
			
	}
	
	@Override
	public void drawLeaves(Graphics g){
		super.drawLeaves(g);
		orn1.draw(g);
		orn2.draw(g);
		orn3.draw(g);
		
	}
		
		
}



