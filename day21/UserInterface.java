package day21;

import java.util.ArrayList;
import java.util.Scanner;

public class UserInterface {
	public static void main(String[] args) {

		ArrayList<Book> al = new ArrayList<Book>();
		Book book1 = new Book();
		Scanner sc = new Scanner(System.in);
		boolean isthere=true;
		while (isthere) {
		
		
			
			System.out.println("Enter your choice ");
			System.out.println("1 for add");
			System.out.println("2 for update");
			System.out.println("3 for show");
			System.out.println("4 for remove");
			System.out.println("0 for exit");
			int key = sc.nextInt();

			if (key == 1) {
				System.out.println("Enter the Book Name");
				String name = sc.next();
				System.out.println("Enter the price ");
				double num = sc.nextDouble();
				al.add(book1 = new Book(name, num));

			}

			else if (key == 2) {
				boolean isWork=false;
				System.out.println("Enter the book name ");
				String name1=sc.next();
				
				for(Book book2:al) {
					if(name1.equalsIgnoreCase(book2.getName())) {
						isthere=true;
						System.out.println("Enter the Book Name");
						String name = sc.next();
						book2.setName(name);
						System.out.println("Enter the price ");
						Double num = sc.nextDouble();
						book2.setPrice(num);
					}}
						if(!isWork) {
							System.out.println("Not there");
						}
			}
					
			else if (key == 3) {
				
			System.out.println(al);

		}
			else if(key==4) {
				System.out.println("Enter the book name ");
				String name1=sc.next();
				for(Book book2:al) {
					if(name1.equalsIgnoreCase(book2.getName())) {
						al.remove(book2);
					}
				
					else if(key==0){
						System.out.println("Thank you");
						isthere=false;
					}
			}
		}

	}
		sc.close();
}
}