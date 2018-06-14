
abstract class Animal {
	String breed,colour,name;
	abstract void eat();
	void speak() {
		System.out.println("Animals Speak.");
	}
}

public class MainAnimalCallingConceptAbstract2  extends Animal {
	
	void eat(){
		System.out.println("Animal eat food.");
			}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MainAnimalCallingConceptAbstract2 x = new MainAnimalCallingConceptAbstract2();
		x.eat();
		x.speak();	

		 /*
	       * take care not to make abstract object....
	  
	       * 
	       */
	}

}
