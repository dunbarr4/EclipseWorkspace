
public class PersonTester {

	public static void main(String[] args) {
		Person p1 = new Person("Terry", 17);
		Person p2 = new Person("Luigi", 24);
		
		Student s1 = new Student();
		
		p1.getOlder();
		
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(s1);
	}

}
