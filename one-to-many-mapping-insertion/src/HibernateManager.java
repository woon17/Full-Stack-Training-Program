import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateManager {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SessionFactory factory = new Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(Student.class)
				.addAnnotatedClass(StudentDetail.class)
				.buildSessionFactory();
		Session session = factory.getCurrentSession();
		System.out.println("connection to database is established");

		Student s = new Student("shufa", "wen", "123@gamil.com");
		StudentDetail sd = new StudentDetail("ABC", 1);
		s.setStudentDetialId(sd);
		
		session.beginTransaction();
		session.save(s);
		session.getTransaction().commit();
		
		
		System.out.println("Data is saved into the tables");
	}

}
