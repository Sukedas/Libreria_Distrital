package model.DTO;

import java.sql.Date;

public class ReserveDTO {
    private Date date_reserve;
    private Date date_return;
    // Getters y Setters
	public Date getDate_reserve() {
		return date_reserve;
	}
	public void setDate_reserve(Date date_reserve) {
		this.date_reserve = date_reserve;
	}
	public Date getDate_return() {
		return date_return;
	}
	public void setDate_return(Date date_return) {
		this.date_return = date_return;
	}
}
