package day13;

class Animal{
	void makesound() {
		System.out.println("This animal makes a sound");
	}
	
}

class dog extends Animal{
	@Override
	void makesound() {
		System.out.println("The dog barks");
	}
	
}
class cat extends Animal{
	@Override
	void makesound() {
		System.out.println("the cat meows");
	}
}

public class Inheritance {
 public static void main(String[] args) {
	dog d=new dog();
	cat c=new cat();
	d.makesound();
	c.makesound();
	
	
}
  

}
