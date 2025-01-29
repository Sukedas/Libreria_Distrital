package model.entities;

import java.util.Date;
///no estoys seguro si saca de la libreria sql o del util ojo con los bugs >:c
public class Document {
	public String title;
	public String author;
	public String type;
	public String state;
	public Date publication_date;
	
	public Document(String title, String author, String type, String state, Date publication_date) {
		super();
		this.title = title;
		this.author = author;
		this.type = type;
		this.state = state;
		this.publication_date = publication_date;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public Date getPublication_date() {
		return publication_date;
	}

	public void setPublication_date(Date publication_date) {
		this.publication_date = publication_date;
	}
	
	
	
	
}
