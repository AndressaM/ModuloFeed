package Notification;

import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Calendar;

import javax.xml.transform.sax.SAXTransformerFactory;

import DAO.Dao;
import Data.Data;
import Object.User;

public class Notification {
	public static void birth_day(User user) {
		ArrayList<Long> friends = user.getFriends();
		if (!friends.isEmpty()) {
			System.out.println("numero de amigos:= " + friends.size());
			for (Long id : friends) {
				User u = Data.getDao().get(User.class, id);
				DateFormat df = DateFormat.getDateInstance(DateFormat.LONG);
				if (u.printData().equals(df.format(Calendar.getInstance().getTime()))) {
					Notify n = new Notify("Birth's " + u.getName(), u.getId(), user.getId(), TYPE_NOTIFY.EVENT);
					Data.getDao().save(n);
				}
			}
		}
	}
//	public static void message(User user){
//		ArrayList<Long> friends = user.getFriends();
//		if(!friends.isEmpty()){
//			for(Long id : friends){
//				User u = Data.getDao().get(User.class, id);
//				if()
//				
//			}
//		}
//		
//	}

	public static void getNotifies(User user) {
		ArrayList<Notify> notifies = new ArrayList<>();
		for (Notify n : Data.getNotifies()) {
			if (n.getDestination() == user.getId()) {
				notifies.add(n);
			}
		}
		// FRIENDSHIP
		System.out.println("Friendship notification:");
		for (Notify n : notifies) {
			if (n.getType().equals(TYPE_NOTIFY.FRIENDSHIP) && !n.isRecive()) {
				System.out.println('\t' + n.toStringFriendship());
				n.setRecive(true);
				Data.getDao().saveOrUpdate(n);
			}
		}
		System.out.println("Event notification:");
		for (Notify n : notifies) {
			if (n.getType().equals(TYPE_NOTIFY.EVENT) && !n.isRecive()) {
				System.out.println('\t' + n.toString());
				n.setRecive(true);
				Data.getDao().saveOrUpdate(n);
			}
		}
		System.out.println("Message notification");
		for (Notify n : notifies) {
			if (n.getType().equals(TYPE_NOTIFY.MESSAGE) && !n.isRecive()) {
				System.out.println('\t' + n.toStringMessage());
				n.setRecive(true);
				Data.getDao().saveOrUpdate(n);
			}
		}
//	Data.load();Notification.birth_day(Data.getUsers().get(0));
	}

}
