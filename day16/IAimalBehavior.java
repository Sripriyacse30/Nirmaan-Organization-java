
package day16;

public interface IAimalBehavior {
	String Category="living Being";
	
	static boolean isMammal(String Category) {
	return (Category.equalsIgnoreCase("dog"))||(Category.equalsIgnoreCase("cat"))||(Category.equalsIgnoreCase("human"));
	
	}
	
	default void Speak(){
	System.out.println("Animal is making a sound");
	}
	
	public void move();
	
	
	
}
