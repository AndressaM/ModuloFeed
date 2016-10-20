package Object;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;

@Entity
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	@Column
	private String name;
	@Column
	private Calendar birth;
	@Column
	private ArrayList<Long> friends;

	public User() {
		super();
	}

	public User(String name) {
		super();
		this.name = name;
	}

	public String printData() {
		DateFormat df = DateFormat.getDateInstance(DateFormat.LONG);
		return df.format(birth.getTime());
	}

	public Calendar getBirth() {
		return birth;
	}

	public void add(User friend) {
		friends.add(friend.getId());
	}

	public void setBirth(GregorianCalendar birth) {
		this.birth = birth;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ArrayList<Long> getFriends() {
		return friends;
	}

	public void setFriends(ArrayList<Long> friends) {
		this.friends = friends;
	}

}
