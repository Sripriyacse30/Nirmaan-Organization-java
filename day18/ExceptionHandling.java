package day18;
import java.util.Scanner;
public class ExceptionHandling {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	try {
	System.out.println("Enter your age : ");
	int age=sc.nextInt();
	if(age>0)
	{
		System.out.println("age");
		}
	else {
		throw new ArithmeticException();
	
	}}
	catch(ArithmeticException e) {
		System.out.println(e);
	}
	finally {
		System.out.println("Always work");
	}
	System.out.println("program finish ");
	

}}