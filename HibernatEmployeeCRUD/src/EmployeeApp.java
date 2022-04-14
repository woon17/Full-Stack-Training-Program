
public class EmployeeApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("hello world");
		Employee e1 = new Employee(1, "shufa", "wen", "1234@gmail.com");
		Employee e2 = new Employee(2, "f2", "s2", "f2s2@gmail.com");
		Employee e3 = new Employee(3, "f3", "s3", "f3s3@gmail.com");

		HibernateManager hm = new HibernateManager();

		hm.connect();
		// create
//		hm.Insert(e1);
//		hm.Insert(e2);
//		hm.Insert(e3);
		// read
//		hm.selectById(2);
//		hm.selectAllData();
//		hm.selectByName();
		hm.selectBySecondName("wen");
		// update
//		hm.updateById(2, "newEmail@gmail.com");
		// delete
//		hm.deletById(1);
//		hm.deletById(2);
//		hm.deletById(3);
	}

}
