package day14;

public class UserInterface2 {
	
	
			public static void main(String[] args)
			{
				
				 Calculator cal=new Calculator();
				
				 int a=20;
				 int b=45;
				 
				 System.out.println("Addition:"+(cal.add(a,b))); 
				 System.out.println("Subtraction:"+cal.sub(a,b));
				 System.out.println("multiplucaton:"+cal.mul(a,b));
				 System.out.println("Division:"+
				 cal.div(a,b));
			}
		}
		

