package day4;

import java.util.Scanner;

public class Whileloop {
	
public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			 
			
		
	    boolean istrue=true;
	    while(istrue) {
	    	
			System.out.println("Enter your choice");
		    System.out.println("1 for add");
		    System.out.println("2 for sub");
		    System.out.println("3 for mul");
		    System.out.println("4 for div");
		    System.out.println("0 for exit");
		    
		    int key=sc.nextInt();
		   
		    
	    
	    switch(key)
	    {
	    
	    
	    case 1:
	    {
	    	 System.out.println("Enter the firstnum");
			    int firstnum=sc.nextInt();
			    System.out.println("Enter the secondnum");
			    int secondnum=sc.nextInt();
	    	System.out.println(firstnum+secondnum);
	    	break;
	    }
	    
	    case 2:
	    {
	    	 System.out.println("Enter the firstnum");
			    int firstnum=sc.nextInt();
			    System.out.println("Enter the secondnum");
			    int secondnum=sc.nextInt();
	    	System.out.println(firstnum-secondnum);
	    	break;
	    }
	    case 3:
	    {
	    	 System.out.println("Enter the firstnum");
			    int firstnum=sc.nextInt();
			    System.out.println("Enter the secondnum");
			    int secondnum=sc.nextInt();
	    	System.out.println(firstnum*secondnum);
	    	break;
	    }
	    
	    case 4:
	    {
	    	 System.out.println("Enter the firstnum");
			    int firstnum=sc.nextInt();
			    System.out.println("Enter the secondnum");
			    int secondnum=sc.nextInt();
	    	System.out.println(firstnum/secondnum);
	    	break;
	    }
	    
	    case 0:
	    {
	    	 istrue=false;
	    	 {
	    	System.out.println("Exit");
	    	break;
	    }
	    }
	    
	   
	    
}}}}
