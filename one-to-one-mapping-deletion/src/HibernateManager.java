import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateManager {
	private static SessionFactory factory;
	private static Session session;

	public static void deleteStudentById(int id) {
		connect();
		session.beginTransaction();
		Student s = (Student) session.get(Student.class, id);
		if (s != null) {
			session.delete(s);
			session.getTransaction().commit();
			System.out.println("Data is deleted from the student tables");
		} else {
			System.out.println("studentid: " + id + " does not exist in student table");
		}

	}
	
	public static void selectStudentDetailById(int id) {
		connect();
		session.beginTransaction();
		StudentDetail s = (StudentDetail) session.get(StudentDetail.class, id);
		if (s != null) {
			Student stu = s.getStudent();
			System.out.println("student studentdetailid: " + id + "\n" + stu);
			System.out.println("studentdetail id: " + id + "\n" + s);
			session.getTransaction().commit();
		} else {
			System.out.println("studentdetail id: " + id + " does not exist in studentdetail table");
		}

	}
	
	public static void deleteStudentDetailById(int id) {
		connect();
		session.beginTransaction();
		StudentDetail s = (StudentDetail) session.get(StudentDetail.class, id);
		if (s != null) {
			session.delete(s);
			session.getTransaction().commit();
			System.out.println("Data is deleted from the studentdetail tables");
		} else {
			System.out.println("studentdetail id: " + id + " does not exist in studentdetail table");
		}

	}

	public static void connect() {
		factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Student.class)
				.addAnnotatedClass(StudentDetail.class).buildSessionFactory();
		session = factory.getCurrentSession();
		System.out.println("connection to database is established");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		deleteStudentById(1);
//		deleteStudentById(2);
//		deleteStudentById(3);
		// Cannot delete or update a parent row: a foreign key constraint fails
		// need to do mapping in studentdetail class. 
		selectStudentDetailById(5); 
//		deleteStudentDetailById(4);

	}

}
