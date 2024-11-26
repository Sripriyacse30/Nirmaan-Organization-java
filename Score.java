package day5;
import java.util.Scanner;
public class Score {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
//
//		System.out.println("Enter your mark");
//
//		int mark=sc.nextInt();
//
//		if(mark>=35) {
//			System.out.println("Grade c");
//		}
//			else if(mark>=70) {
//				System.out.println("grade b");
//				
//			}
//			else if(mark>=90) {
//				System.out.println("Grade A");
//			}
//		   
//			else {
//				System.out.println("fail");
//			}
//			
//	}
////}
// 
		int num=1;
		for(num=1;num<=10;num++)
			System.out.println(num);
		

		System.out.println();
		
		int i=1;
		for(i=1;i<=10;i++)
			System.out.println("5x"+i+"="+i*5);

		System.out.println();
		
		System.out.println("Enter your table");
		int table=sc.nextInt();
		for(i=1;i<=10;i++)
			System.out.println(table+"x"+i+"="+i*table);
		
		
	}}