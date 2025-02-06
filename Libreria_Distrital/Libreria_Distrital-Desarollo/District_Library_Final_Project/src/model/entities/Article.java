package model.entities;

import java.util.Date;

public class Article extends Document {
    private String SSN;

    public Article(String title_docu, String author_docu, String type_docu, Date mon_pub_docu, Date day_pub_docu,
                   int users_id_user, String SSN) {
        super(title_docu, author_docu, type_docu, mon_pub_docu, day_pub_docu, users_id_user);
        this.SSN = SSN;
    }

    // Getters y Setters
    public String getSSN() {
        return SSN;
    }

    public void setSSN(String SSN) {
        this.SSN = SSN;
    }
}