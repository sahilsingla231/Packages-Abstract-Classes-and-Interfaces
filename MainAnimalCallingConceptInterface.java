interface Animals{
    void speak();
    void eat();
}

class Dog implements Animals{
	public void speak() {
		System.out.println("Dogs bark!");
	}
	public void eat(){
		System.out.println("Dogs eat non-veg and veg both specially meat.");
	}
}

class Cat implements Animals{
	public void speak() {
		System.out.println("Cats meow!");
	}
	public void eat(){
		System.out.println("Cats eat non-veg and veg specially rat.");
	}
}

public class MainAnimalCallingConceptInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	      Dog d=new Dog();
	      d.speak();
	      d.eat();
	      Cat c=new Cat();
	      c.speak();
	      c.eat();
	      
	      /*
	       * take care not to make interface object....
	  
	       * 
	       */

	}

}
