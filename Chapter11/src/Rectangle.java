
public class Rectangle extends AbstractFigure{

	private double length, width;
	
	
	public Rectangle(double length, double width){
		this.length = length;
		this.width = width;
	}
	
	public double getPerimeter(){
		double perimeter = (length * 2) + (width * 2);
		return perimeter;
	}
	
	public double getArea(){
		double area = length * width;
		return area;
	}
	
	
}
