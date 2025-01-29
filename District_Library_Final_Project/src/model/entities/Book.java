package model.entities;

import java.util.Date;

public class Book extends Document {
	
	public int pages_number;
	public int book_ISBN;
	
	public Book(String title, String author, String type, String state, Date publication_date) {
		super(title, author, type, state, publication_date);
	}

	public Book(String title, String author, String type, String state, Date publication_date, int pages_number,
			int book_ISBN) {
		super(title, author, type, state, publication_date);
		this.pages_number = pages_number;
		this.book_ISBN = book_ISBN;
	}

	public int getPages_number() {
		return pages_number;
	}

	public void setPages_number(int pages_number) {
		this.pages_number = pages_number;
	}

	public int getBook_ISBN() {
		return book_ISBN;
	}

	public void setBook_ISBN(int book_ISBN) {
		this.book_ISBN = book_ISBN;
	}
	
	

}
