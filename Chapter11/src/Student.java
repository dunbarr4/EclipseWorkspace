
public class Student extends Person{

	private int id, gradeLevel;
	
	public Student(){
		super("Default Student", 5);
		id = 11111;
		gradeLevel = 0;
	}
	
	public Student(String name, int age, int id, int gradeLevel){
		super(name , age);
		this.id = id;
		this.gradeLevel = gradeLevel;
	}
	
	public String toString(){
		return "Student " + getName() + ", Grade: " + gradeLevel;
	}
		
}
