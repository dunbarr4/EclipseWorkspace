
public class Dog extends Animal implements Endangered, Comparable<Dog> {

		public Dog(){
			super("Max");
		}
		
		public Dog(String name){
			super(name);
		}
		
		@Override
		public String getSound(){
			return "cough";
		}
		
		@Override
		public void survive(){
			System.out.println("I will survive");
		}
		
		@Override
		public int compareTo(Dog a){
			return 0;
		}
}
