import java.awt.*;
import java.util.Random;

public class Ornaments {
	
	private int xPos, yPos;
	private Color color;
	private Random rand; 
	private int size = randNumBetween(100, 120);
	
	public Ornaments(int xPos, int yPos) {
		this.xPos = xPos;
		this.yPos = yPos;
		rand = new Random();
		color = new Color(randNumBetween(0, 255), randNumBetween(0, 255), randNumBetween(0, 255));
	}
	
	
	
	public void draw(Graphics g){
	
		g.setColor(color);
		g.fillOval(xPos, yPos, size, size);
		
	}
	
	private int randNumBetween(int low, int high){
        int num = rand.nextInt(high - low + 1);
        return low + num;
    }
	
}
