package model.entities;

import java.util.Date;

public class Book extends Document {
    private int pages_number;
    private String book_ISBN;
    
    

    public Book(String title_docu, String author_docu, String type_docu, Date mon_pub_docu, Date day_pub_docu,
			int users_id_user) {
		super(title_docu, author_docu, type_docu, mon_pub_docu, day_pub_docu, users_id_user);
	}

	public Book(String title_docu, String author_docu, String type_docu, Date mon_pub_docu, Date day_pub_docu,
                int users_id_user, int pages_number, String book_ISBN) {
        super(title_docu, author_docu, type_docu, mon_pub_docu, day_pub_docu, users_id_user);
        this.pages_number = pages_number;
        this.book_ISBN = book_ISBN;
    }

    // Getters y Setters
    public int getPages_number() {
        return pages_number;
    }

    public void setPages_number(int pages_number) {
        this.pages_number = pages_number;
    }

    public String getBook_ISBN() {
        return book_ISBN;
    }

    public void setBook_ISBN(String book_ISBN) {
        this.book_ISBN = book_ISBN;
    }
}