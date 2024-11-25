package day4;
import java.util.Scanner;
public class Simplecalculator {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		 
		
		
	System.out.println("Enter your choice");
    System.out.println("0 for add");
    System.out.println("1 for sub");
    System.out.println("2 for mul");
    System.out.println("3 for div");
    System.out.println("4 for mod");
    
    int key=sc.nextInt();
    System.out.println("Enter the firstnum");
    int firstnum=sc.nextInt();
    System.out.println("Enter the secondnum");
    int secondnum=sc.nextInt();
    
    
//    if(key==0) {
//    	System.out.println(firstnum+secondnum);
//    }
//    else if(key==1) {
//    	System.out.println(firstnum-secondnum);
//    }
//    else if(key==2) {
//    	System.out.println(firstnum*secondnum);
//    }
//    	else if(key==3) {
//    	System.out.println(firstnum/secondnum);
//    	}
//    else if(key==4) {
//    	System.out.println(firstnum%secondnum);
//    }
//    else {
//    	System.out.println("Enter the correct choice");
//    }
    
    switch(key)
    {
    case 0:
    {
    	System.out.println(firstnum+secondnum);
    	break;
    }
    
    case 1:
    {
    	System.out.println(firstnum-secondnum);
    	break;
    }
    
    case 2:
    {
    	System.out.println(firstnum*secondnum);
    	break;
    }
    case 3:
    {
    	System.out.println(firstnum/secondnum);
    	break;
    }
    
    case 4:
    {
    	System.out.println(firstnum%secondnum);
    	break;
    }
    
    default:
    	System.out.println("enter the correct choice");
    
    
    
    }
    
    
    
	}
	
	
}
