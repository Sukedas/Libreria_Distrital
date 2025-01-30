package model.entities;

import java.util.Date;
///no estoys seguro si saca de la libreria sql o del util ojo con los bugs >:c
public class Article extends Document {
	public int SSN;
	
	public Article(String title, String author, String type, String state, Date publication_date) {
		super(title, author, type, state, publication_date);
		
	}

	public Article(String title, String author, String type, String state, Date publication_date, int sSN) {
		super(title, author, type, state, publication_date);
		SSN = sSN;
	}

	public int getSSN() {
		return SSN;
	}

	public void setSSN(int sSN) {
		SSN = sSN;
	}

}
