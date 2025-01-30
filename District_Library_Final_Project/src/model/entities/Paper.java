package model.entities;

import java.util.Date;

public class Paper extends Document {

	public String name_congrest;
	public int paper_ISBN;

	public Paper(String title, String author, String type, String state, Date publication_date) {
		super(title, author, type, state, publication_date);
	}

	public Paper(String title, String author, String type, String state, Date publication_date, String name_congrest,
			int paper_ISBN) {
		super(title, author, type, state, publication_date);
		this.name_congrest = name_congrest;
		this.paper_ISBN = paper_ISBN;
	}

	public String getName_congrest() {
		return name_congrest;
	}

	public void setName_congrest(String name_congrest) {
		this.name_congrest = name_congrest;
	}

	public int getPaper_ISBN() {
		return paper_ISBN;
	}

	public void setPaper_ISBN(int paper_ISBN) {
		this.paper_ISBN = paper_ISBN;
	}
	
	

}
