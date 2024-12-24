package day14;

import java.util.Scanner;



public class Main {
	static Employee emp;
	public static void main(String[] args) 
	{
		
		Scanner sc=new Scanner(System.in);
		boolean istrue=true;
	    while(true) {
		
		System.out.println("Enter the choice:");
		System.out.println("1 for add employee:");
		System.out.println("2 for update employee");
	    System.out.println("3 for Display employee");	
	    System.out.println("0 for exit");
	    int key=sc.nextInt();
	    sc.nextLine();
	    
	    
	switch (key) {
	case 1: {
		System.out.println("enter the emp name:");
		String Empname=sc.nextLine();
		
		System.out.println("enter the emp id:");
		int id=sc.nextInt();
		sc.nextLine();
		System.out.println("enter the emp dept:");
		String Edept=sc.nextLine();
		
	    System.out.println("enter the epno:");
		long Epno=sc.nextLong();
		emp = new Employee(Empname, id, Edept, Epno);
		break;
	}
	case 2:{
		System.out.println("enter the emp name:");
		String Empname=sc.nextLine();
		emp.setEmpName(Empname);
		System.out.println("enter the emp id:");
		int id=sc.nextInt();
		sc.nextLine();
		emp.setEid(id);
		System.out.println("enter the emp dept:");
		String Edept=sc.nextLine();
		emp.setEdept(Edept);
	    System.out.println("enter the epno:");
		long Epno=sc.nextLong();
		emp.setEpno(Epno);
		break;
	}
	case 3:{
		System.out.println(emp);
		break;
	}
	default:
		throw new IllegalArgumentException("Unexpected value: " + key);
	}
	
}}}


