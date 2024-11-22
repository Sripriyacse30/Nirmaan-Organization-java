package day1;

public class Operatortask {
public static void main(String args[])
{
	System.out.println("Arithmetiv Operation:");
	int num1=12;
	int num2=25;
	int addition=num1+num2;
	int subtraction=num1-num2;
	int multiplication=num1*num2;
	int divition=num1/num2;
	int module=num1%num2;
	
	System.out.println("Addition:"+addition);
	System.out.println("Subtraction:"+subtraction);
	System.out.println("Multiplication:"+multiplication);
	System.out.println( "Divition:"+ divition);
	System.out.println( "Module:"+ module);
	
	
	
   System.out.println();

  System.out.println("Relational Operator");
  int x=12;
  int y=25;


boolean a=(x>y);
boolean b=(x<y);
boolean c=(x>=y);
boolean d=(x<=y);
boolean e=(x==y);
boolean f=(x!=y);




System.out.println("12>25:" +a);

System.out.println("12<25:"+b);

System.out.println("12>=25:" +c);

System.out.println("12<=25:" +d);

System.out.println("12==25:" + e);

System.out.println("12!=25:" + f);
}


}