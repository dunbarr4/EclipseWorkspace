
public class Circle extends AbstractFigure{

	private double radius;
	
	public Circle(double radius){
		this.radius = radius;
	}
	
	public double getPerimeter(){
		double perimeter = 2 * Math.PI * radius;
		return perimeter;
	}

	@Override
	public double getArea(){
		double area = Math.PI * (radius * radius);
		return area;
	}
	
	
}
