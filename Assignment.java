package day12;
import java.util.Scanner;

import day4.Main;
public class Assignment {
	
//	Write a java program to cast vote if age is greater than 18
//	void age(int age) {
//		if(age>=18) {
//			System.out.println("eligible");
//		}
//		
//		else {
//			System.out.println("not eligible");
//		}
//	}
//	public static void main(String[] args) {
//		Assignment ass=new Assignment();
//		Scanner in=new Scanner(System.in);
//		System.out.println("enter your age");
//		int age=in.nextInt();
//		ass.age(age);
//}
		
		
//	2.	write a java program to print 1 to 100 such that every 4 multiple should be written as "jack"
		
//		void mul() {
//			for(int i=1;i<=100;i++) {
//				if(i%4==0) {
//					System.out.println("jack");
//				}
//				else {
//					System.out.println(i);
//				}
//				
//			}
//			
//			}
//		public static void main(String[] args) {
//			Assignment ass=new Assignment();
//			ass.mul();
//		}
//		}
//	

//     3.Write a java program to skip odd numbers from 1 to 70?

//   void odd() {
//	for(int i=1;i<=70;i++) {
//	if( i%2==0) {
//		continue;
//	}
//	else {
//		System.out.println(i);
//	}
//	}}
//	
//	public static void main(String args[]) {
//		Assignment ass=new Assignment();
//		ass.odd();
//		}
	
	
//	4.write a java program to check given number is even or odd?
//	int num;
//	void even() {
//		if(num%2==0) {
//			System.out.println("even");
//	
//		}
//		else {
//			System.out.println("odd");
//		}}
//	
//	public static void main(String[] args) {
//		Assignment ass=new Assignment();
//		Scanner sc=new Scanner(System.in);
//		System.out.println("enter the no");
//		ass.num=sc.nextInt();
//		ass.even();
//		
//	}
//}

//	5.change given string into capital and small letter?
	
	
////	String letter() {
////		return "helloworld";
////	
////	}
////	public static void main(String[] args) {
////		Assignment ass=new Assignment();
////		Scanner sc=new Scanner(System.in);
////		System.out.println("enter your name");
////		String name=sc.next();
////		System.out.println(name.toUpperCase());
////		System.out.println(ass.letter().toUpperCase());
////		
////		
////		
////	}
////	}
////	
//	6.	check if student's mark is pass or fail?
//void add(int score){
//	if(score>=35)
//	{
//		if(score<75) {
//		System.out.println("pass");}
//		
//		else if(score>=75 && score<90) {
//			System.out.println("Average");
//		}
//		else if(score>90) {
//			System.out.println("Good");
//		}
//	}
//	
//	else {
//		System.out.println("fail");
//	}}
//	public static void main(String[] args) {
//		Assignment ass=new Assignment();
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter the value");
//		int score= sc.nextInt();
//		ass.add(score);
//		sc.close();
//	}}
	
	
//	7.calculate total and average marks using scanner?
	
	
//void mark(int tamil,int english,int maths,int sci,int social) {
//	
//	int total=tamil+english+maths+sci+social;
//	System.out.println(total);
//	 int avg=total/5;
//	 System.out.println(avg);
//	}
//	
//   public static void main(String args[]) {
//	  
//	   Scanner sc=new Scanner(System.in);{
//	   System.out.println("enter the marks");
//	   int tam=sc.nextInt();
//	   int eng=sc.nextInt();
//	   int maths=sc.nextInt();
//	   int sci=sc.nextInt();
//	   int social=sc.nextInt();
//	   Assignment ass=new Assignment()	;
//	   ass.mark(tam, eng, maths, sci, social);
//	   
//   }}}
//	
	
	void add(int year) {
		if(year%4==0) {
			System.out.println("leap year");
		}
		else {
			System.out.println("not leap year");
		}
	}
	public static void main(String[] args) {
		while(true) {
		Assignment ass=new Assignment();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the year:");
		int year=sc.nextInt();
		
		ass.add(year);
		sc.close();
	}
		
	}}
	
	
	

	
	
