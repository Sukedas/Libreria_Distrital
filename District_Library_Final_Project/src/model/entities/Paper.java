package model.entities;

import java.util.Date;

public class Paper extends Document {
    private String name_congrest;
    private String paper_ISBN;

    public Paper(String title_docu, String author_docu, String type_docu, Date mon_pub_docu, Date day_pub_docu,
                 int users_id_user, String name_congrest, String paper_ISBN) {
        super(title_docu, author_docu, type_docu, mon_pub_docu, day_pub_docu, users_id_user);
        this.name_congrest = name_congrest;
        this.paper_ISBN = paper_ISBN;
    }

    // Getters y Setters
    public String getName_congrest() {
        return name_congrest;
    }

    public void setName_congrest(String name_congrest) {
        this.name_congrest = name_congrest;
    }

    public String getPaper_ISBN() {
        return paper_ISBN;
    }

    public void setPaper_ISBN(String paper_ISBN) {
        this.paper_ISBN = paper_ISBN;
    }
}