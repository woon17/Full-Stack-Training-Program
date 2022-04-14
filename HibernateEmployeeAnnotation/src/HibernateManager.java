
import java.util.Iterator;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateManager {
	private static SessionFactory factory;

	public static void display(List<Employee> empList) {
		for (Employee emp : empList) {
			System.out.println(emp);
		}
	}

	// create
	public static void insert(Employee em) {
		Session session = factory.getCurrentSession();
		session.beginTransaction();
		session.save(em);
		session.getTransaction().commit();
		System.out.println("Insertion success...");
	}

	// read
	public static void selectBySecondName(String secondName) {
		Session session = factory.getCurrentSession();
		session.beginTransaction();
		List<Employee> empList = session.createQuery("from Employee e where e.eSecondName='" + secondName + "'").list();
		display(empList);
		session.getTransaction().commit();
	}

	public static void selectAll() {
		Session session = factory.getCurrentSession();
		session.beginTransaction();
		List<Employee> empList = session.createQuery("from Employee").list();

		Iterator<Employee> itr = empList.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

		session.getTransaction().commit();
	}

	// update
	public static void updateEmailBySecondName(String secondName, String newEmail) {
		Session session = factory.getCurrentSession();
		session.beginTransaction();
		List<Employee> empList = session.createQuery("from Employee e where e.eSecondName='" + secondName + "'").list();
		Employee em;
		if (empList.size() == 1) {
			em = empList.get(0);
			em.seteEmail(newEmail);
			session.update(em);
			session.getTransaction().commit();
			System.out.println("Update email by secondName: \n" + em);
		}

	}

	// delete
	public static void deletById(int id) {
		Session session = factory.getCurrentSession();
		session.beginTransaction();
		Employee em = (Employee) session.get(Employee.class, id);
		session.delete(em);
		session.getTransaction().commit();
		System.out.println("Deletion success...\n" + em);
	}

	public static void main(String[] args) {
		factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Employee.class)
				.buildSessionFactory();

		System.out.println("connection to database is established");

		Employee e1 = new Employee("shufa", "wen", "1234@gmail.com");
		Employee e2 = new Employee("f2", "s2", "f2s2@gmail.com");
		Employee e3 = new Employee("f3", "s3", "f3s3@gmail.com");

		// create
		// insert(e1);
		// insert(e2);
		// insert(e3);

		// read
		selectBySecondName("wen");
		selectAll();

		// update
		updateEmailBySecondName("s2", "newEmail@gmail.com");

		// delete
		// deletById(6);
		// deletById(7);
		// deletById(8);
	}

}
