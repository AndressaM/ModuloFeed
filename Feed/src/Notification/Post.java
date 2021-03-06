package Notification;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;



@Entity
public class Post  {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	@Column
	private String description;
	@Column
	private String userPost;
	@Column
	private int likes;
	@Column 
	private String coments;


	public Post() {
		super();
	}


	public Post(String description, String userPost, int likes, String coments) {
		super();
		this.description = description;
		this.userPost = userPost;
		this.likes = likes;
		this.coments = coments;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public String getUserPost() {
		return userPost;
	}


	public void setUserPost(String userPost) {
		this.userPost = userPost;
	}

}
