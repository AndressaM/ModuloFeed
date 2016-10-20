package Notification;

import java.util.ArrayList;
import java.util.Calendar;

import Data.Data;
import Object.User;

public class Notification {
	public static void birth_day(User user) {
		ArrayList<Integer> friends = user.getFriends();
		for (Integer id : friends) {
			User u = Data.getDao().get((User)User.class, id);
			if (u.getBirth().equals(Calendar.getInstance())) {
				Notify n = new Notify("Birth's " + u.getName(), user.getId(), u.getId(), TYPE_NOTIFY.EVENT);
			}
		}
	}

	public static ArrayList<Notify> getNotifies(User user) {
		ArrayList<Notify> notifies = new ArrayList<>();
		for (Notify n : Data.getNotifies()) {
			if (n.getUser() == user.getId()) {

				notifies.add(n);
			}
		}
		// FRIENDSHIP
		System.out.println("Friendship notification:");
		for (Notify n : notifies) {
			if (n.getType().equals(TYPE_NOTIFY.FRIENDSHIP) && !n.isRecive()) {
				System.out.println('\t' + n.toString());
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
				System.out.println('\t' + n.toString());
				n.setRecive(true);
				Data.getDao().saveOrUpdate(n);
			}
		}
		return notifies;
	}

}
