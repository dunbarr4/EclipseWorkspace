import java.awt.*;

public abstract class AbstractTree implements Tree {

	private Color trunk = new Color(139,69,19);
	
	public Color getLeaves() {
		return leaves;
	}

	private int xPos, yPos;
	
	public AbstractTree(int xPos, int yPos){
		this.xPos = xPos;
		this.yPos = yPos;
	}
	
	
	
	public int getxPos() {
		return xPos;
	}



	public int getyPos() {
		return yPos;
	}



	public void drawTree(Graphics g){
		drawTrunk(g);
		drawLeaves(g);
	}
	
	public void drawTrunk(Graphics g){
		g.setColor(trunk);
		g.fillRect(xPos, yPos, 50, 100);
	}
	
}
