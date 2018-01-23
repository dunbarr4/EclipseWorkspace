import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.WindowConstants;

public class TreeDrawingPanel extends JPanel{

	//Create fields for OakTree, PineTree, and Christmas Tree
	private OakTree oak;
	private PineTree pine;
	private ChristmasTree christmas;
	
	public TreeDrawingPanel(){
		//Instantiate the Trees
		oak = new OakTree(100, 300);
		pine = new PineTree(300, 300);
		christmas = new ChristmasTree(600, 300);
	}

	@Override
	public void paint(Graphics g) {
		super.paint(g);
		
		//Draw the Trees
		oak.drawTree(g);
		pine.drawTree(g);
		christmas.drawTree(g);
	}
	
	
	
	public static void main(String[] args){
		JFrame frame = new JFrame("Tree Drawing");
		frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		frame.setBounds(100, 50, 800, 600);
		JPanel panel = new TreeDrawingPanel();
		panel.setBackground(Color.WHITE);
		frame.add(panel);
		frame.setVisible(true);
	}
}
