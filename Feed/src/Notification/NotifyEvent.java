package Notification;
import java.util.ArrayList;
import java.util.Date;

public class NotifyEvent extends Notify {
	// Local local;
	// ArrayList<User> participants;
	Date dateEnd;
	
	public NotifyEvent(String description, Date dateBegin, int idUser, boolean status, int likes,
			ArrayList<String> coments) {
		super(description, dateBegin, idUser, status, likes, coments);
		// TODO Auto-generated constructor stub
	}

}
