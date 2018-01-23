
public abstract class Animal {
	
	private String name;
	
	public Animal(String name){
		this.name = name;
	}
	
	public void eat(){
		System.out.println(name + " says yummy");
	}
	
	public void sleep(){
		System.out.println(name + " goes Zzz");
	}
	
	public void speak(){
		System.out.println(name + " says " + getSound());
	}
	
	public abstract String getSound();
	
}
