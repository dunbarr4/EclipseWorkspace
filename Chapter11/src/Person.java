
public class Person {

	private String name;
	private int age;
	
	public Person(){
		name = "Default";
		age = 18;
	}
	
	public Person(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	public void setName(String name){
		this.name = name;
	}
	
	public void setAge(int age){
		this.age = age;
	}
	
	public void getOlder(){
		age++;
	}
	
	public int getAge(){
		return age;
	}
	
	public String getName(){
		return name;
	}
	
	public String toString(){
		return String.format("%s, %d", name, age);
	}
}
