package Notification;

import DAO.Dao;
import DAO.GenericDAO;
import Data.Data;
import Object.User;

public class Main {

	public static void main(String[] args) {

		Notify nt = new Notify("ola que dia belo!!", (long) 1, (long) 2, TYPE_NOTIFY.FRIENDSHIP);
		Notify gt = new Notify("boa tarde !!", (long) 0, (long) 2, TYPE_NOTIFY.MESSAGE);

//		Data.getDao().save(new User("Camilla"));
//		Data.getDao().save(new User("Andressa"));
//		Data.getDao().save(new User("Tatiane"));
//		Data.getDao().save(u);
//		Data.getDao().save(p);
		Data.getDao().save(gt);
		Data.load();
//
//		Data.getUsers().get(0).setFriends(Data.getUsers().get(0).add(friend););
		

		Data.getUsers().get(0).addFriends((long)1);
//		Data.getUsers().get(0).addFriends((long)3);
//		Data.getUsers().get(0).addFriends((long)2);
//		Data.getUsers().get(0).addFriends((long)52);

		Data.getDao().saveOrUpdate(Data.getUsers().get(0));


		Notification.getNotifies(Data.getUsers().get(0));
		Notification.birth_day(Data.getUsers().get(0));

	}
}
