package model.DTO;

import java.util.Date;

import model.entities.Document;

public class BookDTO{
	
	private int id_docu;
    private String title_docu;
    private Date mon_pub_docu;
    private String author_docu;
    private Date day_pub_docu;
    private String type_docu;
    private int users_id_user;
	private int pages_number;
    private String book_ISBN;

	
	public int getId_docu() {
		return id_docu;
	}

	public void setId_docu(int id_docu) {
		this.id_docu = id_docu;
	}

	public String getTitle_docu() {
		return title_docu;
	}

	public void setTitle_docu(String title_docu) {
		this.title_docu = title_docu;
	}

	public Date getMon_pub_docu() {
		return mon_pub_docu;
	}

	public void setMon_pub_docu(Date mon_pub_docu) {
		this.mon_pub_docu = mon_pub_docu;
	}

	public String getAuthor_docu() {
		return author_docu;
	}

	public void setAuthor_docu(String author_docu) {
		this.author_docu = author_docu;
	}

	public Date getDay_pub_docu() {
		return day_pub_docu;
	}

	public void setDay_pub_docu(Date day_pub_docu) {
		this.day_pub_docu = day_pub_docu;
	}

	public String getType_docu() {
		return type_docu;
	}

	public void setType_docu(String type_docu) {
		this.type_docu = type_docu;
	}

	public int getUsers_id_user() {
		return users_id_user;
	}

	public void setUsers_id_user(int users_id_user) {
		this.users_id_user = users_id_user;
	}

	
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
