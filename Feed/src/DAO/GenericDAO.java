package DAO;

import java.util.List;

import javax.annotation.Resource;

import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import Object.User;

public abstract class GenericDAO {

	@Resource(name = "sessionFactory")
	SessionFactory sessionFactory = new Configuration().configure("./META-INF/hibernate.cfg.xml").buildSessionFactory();
	final ThreadLocal<Session> threadLocal = new ThreadLocal<Session>();
	Session session = threadLocal.get();

	public <T> void save(final T o) {

		session = sessionFactory.openSession();

		try {
			session.beginTransaction();
			session.save(o);
			session.getTransaction().commit();
			session.close();
		} catch (HibernateException e) {
			e.printStackTrace();
			session.getTransaction().rollback();

		}

	}

	public void delete(final Object object) {
		sessionFactory.getCurrentSession().delete(object);
	}

	public <T> T get(final Class<T> type, final Long id) {
		return (T) sessionFactory.getCurrentSession().load(type, id);
	}

	public <T> T merge(final T o) {
		return (T) sessionFactory.getCurrentSession().merge(o);
	}

	public <T> void saveOrUpdate(final T o) {
		session = sessionFactory.openSession();

		try {
			session.beginTransaction();
			session.update(o);
			session.getTransaction().commit();
			session.close();
		} catch (HibernateException e) {
			e.printStackTrace();
			session.getTransaction().rollback();

		}
	}

	public <T> List<T> getAll(final Class<T> type) {
		session = sessionFactory.openSession();
		session.beginTransaction();
		final Criteria crit = session.createCriteria(type);
		return crit.list();
	}

}