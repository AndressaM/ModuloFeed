package Notification;
import java.util.*;
public class Notify {
	String description;
	Date dateBegin;
	int idUser;
	boolean status;
	int likes; // deve ir para a classe Post
	ArrayList<String> coments; // deve ir para a classe Post
	
	public Notify(String description, Date dateBegin, int idUser, boolean status, int likes,
			ArrayList<String> coments) {
		super();
		this.description = description;
		this.dateBegin = dateBegin;
		this.idUser = idUser;
		this.status = status;
		this.likes = likes;
		this.coments = coments;
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
	public int getLikes() {
		return likes;
	}
	public void setLikes(int likes) {
		this.likes = likes;
	}
	public ArrayList<String> getComents() {
		return coments;
	}
	public void setComents(ArrayList<String> coments) {
		this.coments = coments;
	}
	
	
}
