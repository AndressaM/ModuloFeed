package Notification;
import java.util.ArrayList;
import java.util.Date;

public class NotifyFriendship extends Notify {
	// User userRequest;
	String message;
	
	public NotifyFriendship(String description, Date dateBegin, int idUser, boolean status, int likes,
			ArrayList<String> coments) {
		super(description, dateBegin, idUser, status, likes, coments);
		// TODO Auto-generated constructor stub
	}

}
