package day13;

public class BookManagement {
private String bookname;
private double bookprice;
private String bookAuthor;
private int Noofcopies;
BookManagement(){}
public String getbookname() {
	return bookname;
}
public double getbookprice() {
	return bookprice;
}
public String getbookauthor() {
	return bookAuthor;
}
public int getNoofcopies() {
	return Noofcopies;
}

public void setbookname(String bookname) {
	this.bookname=bookname;
}
public void setbookprice(double bookprice) {
	this.bookprice=bookprice;
}
public void setbookAuthor(String bookAuthor) {
	this.bookAuthor=bookAuthor;
}
public void setNoofcopies(int Noofcopies) {
	this.Noofcopies=Noofcopies;
}
@Override
public String toString() {
	return "BookManagement [bookname=" + bookname + ", bookprice=" + bookprice + ", bookAuthor=" + bookAuthor
			+ ", Noofcopies=" + Noofcopies + "]";
}
	
}
	
	

