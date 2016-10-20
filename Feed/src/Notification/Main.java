package Notification;

import Data.Data;
import Object.User;

public class Main {

	public static void main(String[] args) {

		Notify nt = new Notify("oila", (long) 0, (long) 0, TYPE_NOTIFY.FRIENDSHIP);
		User u = new User("matehus");
		// // Post p = new Post("--", "==", 10, "nada");
		Data.getDao().save(u);
		Data.getDao().save(new User("Andressa"));
		Data.getDao().save(new User("Geymerson"));
		// Data.getDao().save(u);
		// Data.getDao().save(p);
		Data.load();
		// Notification.birth_day(Data.getUsers().get(0));
		//
	}
}
