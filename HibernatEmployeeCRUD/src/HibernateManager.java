
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;
import java.util.*;

public class HibernateManager {
	Session session;

	public void connect() {
		// Connection code
		// these 5 lines would remain same and is used for getting connection
		Configuration configuration = new Configuration().configure("hibernate.cfg.xml"); // connects to cfg
		ServiceRegistryBuilder builder = new ServiceRegistryBuilder().applySettings(configuration.getProperties());
		SessionFactory sessionFactory = configuration.buildSessionFactory(builder.buildServiceRegistry());

		session = sessionFactory.openSession();
		System.out.println("Connected to Pf....");
	}

	// create
	public void Insert(Employee em) {
		session.beginTransaction();
		session.save(em);
		session.getTransaction().commit();
		System.out.println("Insertion success...");
	}

	// read
	public void selectById(int id) {
		session.beginTransaction();
		Employee em = (Employee) session.get(Employee.class, id);
		session.getTransaction().commit();
		System.out.println("Select by id: \n" + em);
	}

	public void selectAllData() {
		session.beginTransaction();
		List<Employee> empList = session.createQuery("from Employee").list();

		display(empList);
		session.getTransaction().commit();

	}

	public void display(List<Employee> empList) {
		for (Employee emp : empList) {
			System.out.println(emp);
		}
	}

	public void selectByName() {
		session.beginTransaction();
		List<Employee> empList = session.createQuery("from Employee e where e.eFirstName='shufa'").list();
		display(empList);
		session.getTransaction().commit();
	}

	public void selectBySecondName(String secondName) {
		session.beginTransaction();
		List<Employee> empList = session.createQuery("from Employee e where e.eSecondName='" + secondName+ "'").list();
		display(empList);
		session.getTransaction().commit();
	}
	// update
	public void updateById(int id, String newEmail) {
		session.beginTransaction();
		Employee em = (Employee) session.get(Employee.class, id);
		em.seteEmail(newEmail);
		session.update(em);
		session.getTransaction().commit();
		System.out.println("Update by sid: \n" + em);
	}

	// delete
	public void deletById(int id) {
		session.beginTransaction();
		Employee em = (Employee) session.get(Employee.class, id);
		session.delete(em);
		session.getTransaction().commit();
		System.out.println("Deletion success...\n" + em);
	}
}
