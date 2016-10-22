package Data;

import java.util.ArrayList;

import DAO.Dao;
import DAO.GenericDAO;
import Notification.Notify;
import Notification.Post;
import Object.User;

public class Data {
	static private ArrayList<User> users;
	static private ArrayList<Post> posts;
	static private ArrayList<Notify> notifies;
	static private Dao dao;

	public static void load() {
		users = new ArrayList<>();
		posts = new ArrayList<>();
		notifies = new ArrayList<>();

		GenericDAO dao = new Dao();

		users = (ArrayList<User>) dao.getAll(User.class);
		System.out.println("USER:= " + users.size());
		posts = (ArrayList<Post>) dao.getAll(Post.class);
		System.out.println("POST:= " + posts.size());
		notifies = (ArrayList<Notify>) dao.getAll(Notify.class);
		System.out.println("NOTIFY:= " + notifies.size());

	}

	public static ArrayList<User> getUsers() {
		return users;
	}
	
	

	public static void setUsers(ArrayList<User> users) {
		Data.users = users;
	}

	public static ArrayList<Post> getPosts() {
		return posts;
	}

	public static void setPosts(ArrayList<Post> posts) {
		Data.posts = posts;
	}

	public static ArrayList<Notify> getNotifies() {
		return notifies;
	}

	public static void setNotifies(ArrayList<Notify> notifies) {
		Data.notifies = notifies;
	}

	public static Dao getDao() {
		if (dao == null)
			dao = new Dao() {
			};
		return dao;
	}

}
