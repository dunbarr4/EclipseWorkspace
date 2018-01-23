
public abstract class AbstractFigure implements Figure {

	public String toString(){
		return String.format("%s - Perimeter: %.2f units, Area: %.2f square units.", 
				getClass().getSimpleName(), getPerimeter(), getArea());
	}
	
}
