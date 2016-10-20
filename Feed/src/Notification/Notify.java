package Notification;

import java.text.DateFormat;
import java.util.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Notify {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	@Column
	private String description;
	@Column
	private Calendar date;
	@Column
	private int destination;
	@Column
	private boolean recive;
	@Column
	private TYPE_NOTIFY type;
	@Column
	private Integer sender;

	public Notify() {
		super();
	}

	public Notify(String description, int sender, int destination, TYPE_NOTIFY type) {
		super();
		this.sender = sender;
		this.type = type;
		this.description = description;
		this.destination = destination;
		this.recive = false;
		this.date = Calendar.getInstance();
	}

	private String printData() {
		DateFormat df = DateFormat.getDateInstance(DateFormat.LONG);
		return df.format(date.getTime());
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Calendar getDate() {
		return date;
	}

	public void setDate(Calendar date) {
		this.date = date;
	}

	public int getDestination() {
		return destination;
	}

	public void setDestination(int destination) {
		this.destination = destination;
	}

	public Integer getSender() {
		return sender;
	}

	public void setSender(Integer sender) {
		this.sender = sender;
	}

	public int getUser() {
		return destination;
	}

	public void setUser(int user) {
		this.destination = user;
	}

	public boolean isRecive() {
		return recive;
	}

	public void setRecive(boolean recive) {
		this.recive = recive;
	}

	public TYPE_NOTIFY getType() {
		return type;
	}

	public void setType(TYPE_NOTIFY type) {
		this.type = type;
	}

	public String toString() {
		return printData() + " " + description;
	}

}
