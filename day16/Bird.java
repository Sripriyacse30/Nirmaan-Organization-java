package day16;

 public class Bird implements IAimalBehavior
 {
	
		public void move()
		{
			System.out.println("the bird fly in the sky");
		}
	
		 public void speak() {
			System.out.println("the bird says:chip chip!");
		}
		 public static void main(String args[]) {
			 
			  Bird b=new Bird();
			  b.move();
			  b.speak();
			  System.out.println(IAimalBehavior.isMammal("bird"));
		  }}

