
public class Cat extends Animal {

	public Cat(){
		super("Fluff");
	}
	
	public Cat(String name){
		super(name);
	}
	
	@Override
	public String getSound(){
		return "purr";
	}
	
}
