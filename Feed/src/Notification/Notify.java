package Notification;
import java.util.*;

import javax.persistence.Column;
import javax.persistence.Entity;
@Entity
public class Notify {
	
	@Column
	private String description;
	@Column
	private Date dateBegin;
	@Column
	private int idUser;//isso sera um objeto
	
	private boolean status;
	
	public Notify(String description, Date dateBegin, int idUser, boolean status) {
		super();
		this.description = description;
		this.dateBegin = dateBegin;
		this.idUser = idUser;
		this.status = status;
		
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Date getDateBegin() {
		return dateBegin;
	}
	public void setDateBegin(Date dateBegin) {
		this.dateBegin = dateBegin;
	}
	public int getIdUser() {
		return idUser;
	}
	public void setIdUser(int idUser) {
		this.idUser = idUser;
	}
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}


	
}
