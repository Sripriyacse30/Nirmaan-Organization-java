package day16;

public class Dog implements IAimalBehavior {
	
	
	
	public void move()
	{
		System.out.println("the dog runs on fourlegs");
	}
	
	public void speak() {
		System.out.println("the dog says:chip chip!");
	}




  public static void main(String args[]) {
	  Dog d=new Dog();
	 
	  d.move();
	  d.speak();
	  System.out.println(IAimalBehavior.isMammal("dog"));
  }}