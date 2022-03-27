package schoolmanagementsystem;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

class InvalidStAnsException extends Exception {
	public String getMessage() {
		String line = String.format("%60s\n", " ").replace(" ", "*");
		String warning = "Waining: Choose Student(1) Teacher(2)\n";
		return line + warning + line;
	}
}

class InvalidCrudAnsException extends Exception {

	public String getMessage() {
		String line = String.format("%60s\n", " ").replace(" ", "*");
		String warning = "Waining: Choose Create(1) Read(2) Update(3) Delte(4)\n";
		return line + warning + line;
	}
}

class InputInputTypeException extends Exception {
	public String getMessage() {
		String line = String.format("%60s\n", " ").replace(" ", "*");
		String warning = "Waring: Choose a number\n";
		return line + warning + line;
	}
}

class InvalidGpaRangeException extends Exception {
	public String getMessage() {
		String line = String.format("%60s\n", " ").replace(" ", "*");
		String warning = "Waining: choose from 0-5\n";
		return line + warning + line;
	}
}

class StudentAlredyExistException extends Exception {
	public String getMessage() {
		String line = String.format("%60s\n", " ").replace(" ", "*");
		String warning = "Waining: cannot add as current student is alredy exsiting\n";
		return line + warning + line;
	}
}

interface PersonInterface {
	void enrol(School school);

	void leave(School school);

}

interface SummaryInterface {

	void showStudentsSummary();

	void showTeachersSummary();

}

abstract class Person implements PersonInterface {
	private String name;

	Person(String name) {
		this.name = name;
	}

	Person() {
		this.name = "";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	abstract boolean isExistingIn(School school);

}

class Student extends Person {
	private static int numOfStudents;
	private float gpa;

	public Student(String name, float gpa) {
		super(name);
		this.gpa = gpa;

	}

	public Student(String name) {
		super(name);

	}

	public float getGpa() {
		return gpa;
	}

	public void setGpa(float gpa) {
		this.gpa = gpa;
	}

	@Override
	public void enrol(School school) {
		// TODO Auto-generated method stub
		school.getStudents().add(this);
		numOfStudents++;
	}

	@Override
	public void leave(School school) {
		// TODO Auto-generated method stub
		school.getStudents().remove(this);
		numOfStudents--;

	}

	boolean isExistingIn(School school) {

		for (Student s : school.getStudents()) {
			if (s.getName().equals(this.getName())) {
				return true;
			}
		}
		return false;
	}

	public String toString() {
		return "Student's name: " + this.getName() + "; gpa: " + this.gpa;
	}
}

class Teacher extends Person {
	private static int numOfTeachers;
	private int salary;

	public Teacher(String name, int salary) {
		super(name);
		this.salary = salary;
	}

	public Teacher(String name) {
		super(name);
	}

	public int getSalary() {
		return salary;
	}

	public String toString() {
		return "Teacher's name: " + this.getName() + "; salary: " + this.salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	@Override
	public void enrol(School school) {
		// TODO Auto-generated method stub
		school.getTeachers().add(this);
		numOfTeachers++;
	}

	@Override
	public void leave(School school) {
		// TODO Auto-generated method stub
		school.getTeachers().remove(this);
		numOfTeachers--;

	}

	@Override
	boolean isExistingIn(School school) {

		for (Teacher s : school.getTeachers()) {
			if (s.getName().equals(this.getName())) {
				this.setSalary(s.salary);
				return true;
			}
		}
		return false;
	}
}

class School implements SummaryInterface {

	private List<Teacher> teachers = new ArrayList<>();
	private List<Student> students = new ArrayList<>();

	public List<Teacher> getTeachers() {
		return teachers;
	}

	public List<Student> getStudents() {
		return students;
	}

//	public Student getByName(Student student) {
//		for (Student s : students) {
//			if (s.getName().equals(student.getName())) {
//				return s;
//			}
//		}
//		return student;
//	}
//
//	public boolean getByName(Teacher teacher) {
//		for (Teacher s : teachers) {
//			if (s.getName().equals(teacher.getName())) {
//				return true;
//			}
//		}
//		return false;
//	}

	public void showPersonInfoByName(Student student) {
		System.out.println(String.format("%8s%16s", "Student", "GPA"));
		for (Student s : students) {
			if (s.getName().equals(student.getName())) {
				System.out.println(String.format("%8s%16s", s.getName(), s.getGpa()));
			}
		}
	}

	public void showPersonInfoByName(Teacher teacher) {
		System.out.println(String.format("%8s%16s", "teacher", "Salary"));
		for (Teacher s : teachers) {
			if (s.getName().equals(teacher.getName())) {
				System.out.println(String.format("%8s%16s", s.getName(), s.getSalary()));
			}
		}
	}

	@Override
	public void showStudentsSummary() {
		// TODO Auto-generated method stub

	}

	@Override
	public void showTeachersSummary() {
		// TODO Auto-generated method stub

	}

}

class Admin {
	boolean isExit = false;
	School school;

	Admin() {
		this.school = new School();
	}

	void verifyStAns(int stQnAns) throws InvalidStAnsException {
		if (stQnAns != 1 && stQnAns != 2) {
			InvalidStAnsException e = new InvalidStAnsException();
			throw e;
		}
	}

	void ansStQn() {
//		System.out.println("ansStQn()");
		String stQn = String.format("%8s%16s", "Student(1)", "Teacher(2)");
		System.out.println("For student or teach? Choose a number\n" + stQn);
		try {
			Scanner sc = new Scanner(System.in);
			int stQnAns = sc.nextInt();

			verifyStAns(stQnAns);
//			System.out.println("--------------------------");
			ansNameQn();
			ansCrudQn(stQnAns);
		} catch (InvalidStAnsException e) {
			System.out.println(e.getMessage());
		} catch (InputMismatchException e) {
			InputInputTypeException exception = new InputInputTypeException();
			System.out.println(exception.getMessage());
		}
	}

	void verifyCrudAns(int crudQnAns) throws InvalidCrudAnsException {
		System.out.println("verifyCrudAns()");
		if (crudQnAns != 1 && crudQnAns != 2 && crudQnAns != 3 && crudQnAns != 4) {
			InvalidCrudAnsException e = new InvalidCrudAnsException();
			throw e;
		}
	}

	void verifyName(String name, int personType) throws StudentAlredyExistException{
		Person person;
		switch (personType) {
		case 1:
			person = new Student(name);
			if (person.isExistingIn(school)) {
				throw new StudentAlredyExistException();
			}
			break;
		case 2:

			break;
		default:
			break;
		}
	}

	void ansCrudQn(int personType) {
		System.out.println("ansCrudQn()");
		String crudQn = String.format("%8s%16s%16s%16s", "Create(1)", "Read(2)", "Update(3)", "Delte(4)");
		try {
			Scanner sc = new Scanner(System.in);
			System.out.println("Please enter a number:\n" + crudQn);
			int crudQnAns = sc.nextInt();
			verifyCrudAns(crudQnAns);
			System.out.println("Enter the person's name: " + crudQnAns);
			String name = sc.next();
			verifyName(name, personType);
			performCrud(name, crudQnAns, personType);
		} catch (InvalidCrudAnsException e) {
			System.out.println(e.getMessage());
			ansCrudQn(personType);
		} catch (InputMismatchException e) {
			InputInputTypeException exception = new InputInputTypeException();
			System.out.println(exception.getMessage());
			ansCrudQn(personType);
		}

	}

//	TODO:
	void verifyGpa(float gpa) throws InvalidGpaRangeException {
		System.out.println("verifyCrudAns()");
		if (gpa < 0 || gpa > 5) {
			InvalidGpaRangeException e = new InvalidGpaRangeException();
			throw e;
		}
	}

	void performCrud(String name, int crudQnAns, int personType) {
		System.out.println("performCrud()crudQnAns:" + crudQnAns);
		Scanner sc = new Scanner(System.in);
		Person person;
		switch (crudQnAns) {
		case 1:
			// create person: need name + gpa or name + salary
			if (personType == 1) {
				try {
					System.out.println(String.format("Enter the GPA for %s (Student). %s", name, "choose from 0-5"));
					float gpa = sc.nextFloat();
					verifyGpa(gpa);
					person = new Student(name, gpa);
					person.enrol(this.school);
					school.showPersonInfoByName((Student) person);
				} catch (InvalidGpaRangeException e) {
					// TODO: handle exception
					System.out.println(e.getMessage());
					performCrud(name, crudQnAns, personType);
				} catch (InputMismatchException e) {
					InputInputTypeException exception = new InputInputTypeException();
					System.out.println(exception.getMessage());
					performCrud(name, crudQnAns, personType);
				}

			} else {
				System.out.println(
						String.format("Enter the Salary for %s (teacher). %s", name, "choose from 1000-10000"));
				int salary = sc.nextInt();
				person = new Teacher(name, salary);
				person.enrol(this.school);
				school.showPersonInfoByName((Teacher) person);
			}
			break;
		case 2:
			// Read Person
			// dummy instance
			if (personType == 1) {
				person = new Student(name);
				if (person.isExistingIn(school)) {
					school.showPersonInfoByName((Student) person);
				} else {
					System.out.println("Input the correct name");
				}
			} else {
				person = new Teacher(name);
				if (person.isExistingIn(school)) {
					school.showPersonInfoByName((Teacher) person);
				} else {
					System.out.println("Input the correct name");
				}
			}

			break;
		case 3:
			// update person
			if (personType == 1) {
				System.out.println(String.format("Enter the new GPA for %s (Student). %s", name, "choose from 0-5"));
				float gpa = sc.nextFloat();
				person = new Student(name);
				if (person.isExistingIn(school)) {
					((Student) person).setGpa(gpa);
				} else {
					System.out.println("Input the correct name");
				}
			} else {
				System.out.println(
						String.format("Enter the new salary for %s (teacher). %s", name, "choose from 1000-10000"));
				int salary = sc.nextInt();
				person = new Teacher(name);
				if (person.isExistingIn(school)) {
					((Teacher) person).setSalary(salary);
				} else {
					System.out.println("Input the correct name");
				}
			}
			break;
		case 4:
			// delete person
			if (personType == 1) {
				person = new Student(name);
				if (person.isExistingIn(school)) {
					person.leave(school);
				} else {
					System.out.println("Input the correct name");
				}
			} else {
				person = new Teacher(name);
				if (person.isExistingIn(school)) {
					person.leave(school);
				} else {
					System.out.println("Input the correct name");
				}
			}
			break;
		default:
			break;
		}

	}
}

public class LaunchSystem {

	public static void main(String[] args) {
		Admin admin = new Admin();

		String crudQn = String.format("%8s%16s%16s%16s", "Create(1)", "Read(2)", "Update(3)", "Delte(4)");

		while (!admin.isExit) {
			admin.ansStQn();
		}

	}

}
