

public class StudentApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("hello world");
		Student s = new Student(2, "wen");
		HibernateManager hm = new HibernateManager();
		
		hm.connect();
		hm.deletById(1);
	}
}
