package day13;

import java.util.Scanner;

public class Main {
public static void main(String[] args) {
	BookManagement book=new BookManagement();
	Scanner sc=new Scanner(System.in);
	
	boolean istrue=true;
	while(istrue) {
		System.out.println("Enter your choice:");
		System.out.println("1 for add books or update boks");
		System.out.println("2 for display books");
		System.out.println("0 for exit");
		int key=sc.nextInt();
	sc.nextLine();
	switch(key) {
	case 1: {
		
		System.out.println("Enter the book name:");
		String bookname=sc.nextLine();
		book.setbookname(bookname);
		System.out.println();
		System.out.println("Enter the book Author:");
		String bookAuthor=sc.nextLine();
		book.setbookAuthor(bookAuthor);
		System.out.println("Enter the book price:");
		Double bookprice=sc.nextDouble();
		book.setbookprice(bookprice);
		System.out.println("Enter the Noofcopies:");
		int Noofcopies=sc.nextInt();
		book.setNoofcopies(Noofcopies);
		break;
	}
	case 2:{
		System.out.println(book);
		System.out.println();
		break;
	}
	case 0:{
		istrue=false;
		System.out.println("thank you");
		break;
	}
	default:
		System.out.println("Enter the valid choice");
		break;
	}
	}}}







