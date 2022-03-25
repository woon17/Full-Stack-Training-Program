package schoolmanagementsystem;

class Student{
	  private int id;
	 private String name;
	    private int grade;
	    private int feesPaid;
	    private int feesTotal;
	    
	    public Student(int id, String name,int grade){
	        this.feesPaid=0;
	        this.feesTotal=30000;
	        this.id=id;
	        this.name=name;
	        this.grade=grade;

	    }
	    public void setGrade(int grade){
	        this.grade=grade;
	    }
	    public void payFees(int fees){
	        feesPaid+=fees;
	        School.updateTotalMoneyEarned(feesPaid);
	    }
	    public int getId() {
	        return id;
	    }
	    public int getId() {
	        return id;
	    }
	    public int getId() {
	        return id;
	    }
	    
	    public int getId() {
	        return id;
	    }
	    
	    public int getId() {
	        return id;
	    }
	    public int getId() {
	        return id;
	    }
	    public int getId() {
	        return id;
	    }
	    
	    
}

public class LaunchSystem {

	import java.util.ArrayList;
	import java.util.List;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Teacher teacher1 = new Teacher(1,"teacher1",500);
        Teacher teacher2 = new Teacher(2,"teacher2",700);
        Teacher teacher3 = new Teacher(3,"teacher3",600);

        List<Teacher> teacherList = new ArrayList<>();
        teacherList.add(teacher1);
        teacherList.add(teacher2);
        teacherList.add(teacher3);

        Student student1 = new Student(1,"student1",4);
        Student student2 = new Student(2,"student2",12);
        Student student3 = new Student(3,"student3",5);
        List<Student> studentList = new ArrayList<>();

        studentList.add(student1);
        studentList.add(student2);
        studentList.add(student3);

        School college1 = new School(teacherList,studentList);

        Teacher teacher4 = new Teacher(6,"teacher4", 900);

        college1.addTeacher(teacher4);


        student1.payFees(5000);
        student2.payFees(6000);
        System.out.println("college1 has earned $"+ college1.getTotalMoneyEarned());

        System.out.println("------Making SCHOOL PAY SALARY----");
        teacher1.receiveSalary(teacher1.getSalary());
        System.out.println("college1 has spent for salary to " + teacher1.getName()
        +" and now has $" + college1.getTotalMoneyEarned());

        teacher2.receiveSalary(teacher2.getSalary());
        System.out.println("college1 has spent for salary to " + teacher2.getName()
                +" and now has $" + college1.getTotalMoneyEarned());


        System.out.println(student2);

        teacher3.receiveSalary(teacher3.getSalary());

        System.out.println(teacher3);
	}

}
