import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateManager {
	private static SessionFactory factory;
	private static Session session;

	public static void connect() {
		factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Student.class)
				.addAnnotatedClass(StudentDetail.class).addAnnotatedClass(Course.class).addAnnotatedClass(Review.class)
				.buildSessionFactory();
		session = factory.getCurrentSession();
		System.out.println("connection to database is established");
	}

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

	public static void deleteCourseById(int cid) {
		connect();
		session.beginTransaction();
		Course c = (Course) session.get(Course.class, cid);
		if (c == null) {
			System.out.println("cid is not existing in course table");
		} else {
			Student s = c.getStudent();
			s.getCourses().remove(c);
			session.save(s);
			session.delete(c);
			session.getTransaction().commit();
		}

	}

	public static void deleteReviewById(int rid) {
//		connect();
//		session.beginTransaction();
//		Review r = (Review) session.get(Review.class, rid);
//		if (r == null) {
//			System.out.println("rid is not existing in course table");
//		} else {
//			Course c = r.getCourse();
//			c.getReviews().remove(r);
//			session.save(c);
//			session.delete(r);
//			session.getTransaction().commit();
//		}
	}

	public static void insertStudentWithStudentDetail(Student s, StudentDetail sd) {
		connect();
		s.setStudentDetailId(sd);
		session.beginTransaction();
		session.save(s);
		session.getTransaction().commit();

		System.out.println("Data is saved into the tables");
	}

	public static void insertStudentWithCoursesById(int sid, List<Course> courses) {
		connect();
		session.beginTransaction();
		Student s = (Student) session.get(Student.class, sid);
		for (Course c : courses) {
			s.add(c);
			session.save(c);
		}
		session.getTransaction().commit();

		System.out.println("Data is saved into the tables");
	}

	public static void insertReviewWithCoursesById(int cid, List<Review> reviews) {
		connect();
		session.beginTransaction();
		Course c = (Course) session.get(Course.class, cid);
		System.out.println("c: " + c);
		for (Review r : reviews) {
			System.out.println("r: " + r);
			c.add(r);
			session.save(r);
		}
		session.getTransaction().commit();

		System.out.println("Data is saved into the review tables");
	}

	public static void displayCoursesByStudentId(int sid) {
		connect();
		session.beginTransaction();
		Student s = (Student) session.get(Student.class, sid);
		List<Course> courses = s.getCourses();
		for (Course c : courses) {
			System.out.println(c);
		}
		System.out.println("Student id: " + sid + "\n" + s);
		session.getTransaction().commit();

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Student s = new Student("shufa", "wen", "123@gamil.com");
//		StudentDetail sd = new StudentDetail("ABC", 1);
//		insertStudentWithStudentDetail(s, sd);

//		deleteStudentById(4);// fail as studentid is a f_key used in course table

//		Student s = new Student("afuhs", "new", "321@gamil.com");
//		StudentDetail sd = new StudentDetail("CBA", 3);
//		insertStudentWithStudentDetail(s, sd);
//
//		Course c1 = new Course("Java");
//		Course c2 = new Course("Python");
//		Course c3 = new Course("JavaScript");
//
//		Course c4 = new Course("Jav");
//		Course c5 = new Course("Pyt");
//		Course c6 = new Course("Js");
//		List<Course> courses = new ArrayList<>();
		// course insertion and add them to student.courses
//		courses.add(c1);
//		courses.add(c2);
//		courses.add(c3);
//		insertStudentWithCoursesById(4, courses);
		// course insertion and add them to student.courses
//		courses.add(c4);
//		courses.add(c5);
//		courses.add(c6);
//		insertStudentWithCoursesById(8, courses);

//		displayCoursesByStudentId(4);
//		deleteStudentById(4);// fail as studentid is a f_key used in course table
//		deleteCourseById(11);
//		displayCoursesByStudentId(4);

		Review r1 = new Review("comment1");
		Review r2 = new Review("comment2");
		Review r3 = new Review("comment3");
		List<Review> reviews = new ArrayList<>();
		reviews.add(r1);
		reviews.add(r2);
		reviews.add(r3);

		insertReviewWithCoursesById(16, reviews);
//		deleteReviewById(7);
//		deleteCourseById(18);
	}

}
