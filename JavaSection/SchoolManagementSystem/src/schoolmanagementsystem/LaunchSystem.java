package schoolmanagementsystem;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;


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

class School implements SummaryInterface {

	private List<Teacher> teachers = new ArrayList<>();
	private List<Student> students = new ArrayList<>();

	public List<Teacher> getTeachers() {
		return teachers;
	}

	public List<Student> getStudents() {
		return students;
	}

	public Student getByName(Student student) {
		for (Student s : students) {
			if (s.getName().equals(student.getName())) {
				return s;
			}
		}
		return student;
	}

	public Teacher getByName(Teacher teacher) {
		for (Teacher s : teachers) {
			if (s.getName().equals(teacher.getName())) {
				return s;
			}
		}
		return teacher;
	}

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
		System.out.println(String.format("%8s%16s", "Student", "GPA"));
		for (Student s : students) {
			System.out.println(String.format("%8s%16s", s.getName(), s.getGpa()));
		}
		System.out.println(String.format("Total students: %s\n", Student.getNoOfStudents()));
	}

	@Override
	public void showTeachersSummary() {
		// TODO Auto-generated method stub
		System.out.println(String.format("%8s%16s", "teacher", "Salary"));
		for (Teacher s : teachers) {
			System.out.println(String.format("%8s%16s", s.getName(), s.getSalary()));
		}
		System.out.println(String.format("Total teachers: %s\n", Teacher.getNoOfTeachers()));
	}

}

class Admin {
	boolean isExit = false;
	School school;

	Admin() {
		this.school = new School();
	}

	void verifyStAns(int stQnAns) throws InvalidStAnsException {
		if (stQnAns < 1 && stQnAns > 4) {
			InvalidStAnsException e = new InvalidStAnsException();
			throw e;
		}
	}

	void ansStQn() {
//		System.out.println("ansStQn()");
		String stQn = String.format("%8s%16s%20s%20s", "Student(1)", "Teacher(2)", "Show-student(3)",
				"Show-teachers(4)");
		System.out.println("For student or teach? Choose a number\n" + stQn);
		try {
			Scanner sc = new Scanner(System.in);
			int stQnAns = sc.nextInt();

			verifyStAns(stQnAns);
//			System.out.println("--------------------------");
//			ansNameQn();
			if (stQnAns == 3) {
				school.showStudentsSummary();
			} else if (stQnAns == 4) {
				school.showTeachersSummary();
			} else {
				ansCrudQn(stQnAns);
			}

		} catch (InvalidStAnsException e) {
			System.out.println(e.getMessage());
		} catch (InputMismatchException e) {
			InputInputTypeException exception = new InputInputTypeException();
			System.out.println(exception.getMessage());
		}
	}

	void verifyCrudAns(int crudQnAns) throws InvalidCrudAnsException {
//		System.out.println("verifyCrudAns()");
		if (crudQnAns < 1 || crudQnAns > 4) {
			InvalidCrudAnsException e = new InvalidCrudAnsException();
			throw e;
		}
	}

	void verifyStudentNotExist(String name, int crud) throws StudentAlredyExistException {
		Person person;
		person = new Student(name);
		if (person.isExistingIn(school)) {
			throw new StudentAlredyExistException();
		}
	}

	void verifyStudentExist(String name, int crud) throws StudentNotExistException {
		Person person;
		person = new Student(name);
		if (!person.isExistingIn(school)) {
			throw new StudentNotExistException();
		}
	}

	void verifyTeacherNotExist(String name, int crud) throws TeacherAlredyExistException {
		Person person;
		person = new Teacher(name);
		if (person.isExistingIn(school)) {
			throw new TeacherAlredyExistException();
		}
	}

	void verifyTeacherExist(String name, int crud) throws TeacherNotExistException {
		Person person;
		person = new Teacher(name);
		if (!person.isExistingIn(school)) {
			throw new TeacherNotExistException();
		}
	}

	void ansCrudQn(int personType) {
//		System.out.println("ansCrudQn()");
		String crudQn = String.format("%8s%16s%16s%16s", "Create(1)", "Read(2)", "Update(3)", "Delte(4)");
		try {
			Scanner sc = new Scanner(System.in);
			System.out.println("Please enter a number:");
			System.out.println(crudQn);
			int crudQnAns = sc.nextInt();
			verifyCrudAns(crudQnAns);
			System.out.println("Enter the person's name: ");
			String name = sc.next();
//			verifyName(name, personType);
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
//		System.out.println("verifyCrudAns()");
		if (gpa < 0 || gpa > 5) {
			InvalidGpaRangeException e = new InvalidGpaRangeException();
			throw e;
		}
	}

	void verifySalary(int salary) throws InvalidSalaryRangeException {
//		System.out.println("verifyCrudAns()");
		if (salary < 1000 || salary > 10000) {
			InvalidSalaryRangeException e = new InvalidSalaryRangeException();
			throw e;
		}
	}

	void performCrud(String name, int crudQnAns, int personType) {
//		System.out.println("performCrud()crudQnAns:" + crudQnAns);
		Scanner sc = new Scanner(System.in);
		Person person;
		switch (crudQnAns) {
		case 1:
			// create person: need name + gpa or name + salary
			if (personType == 1) {
				try {
					System.out.println(String.format("Enter the GPA for %s (Student). %s", name, "choose from 0-5"));
					verifyStudentNotExist(name, crudQnAns);
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
				} catch (StudentAlredyExistException e) {
					System.out.println(e.getMessage());
					ansCrudQn(1);
				}

			} else {
				try {
					System.out.println(
							String.format("Enter the Salary for %s (teacher). %s", name, "choose from 1000-10000"));
					verifyTeacherNotExist(name, crudQnAns);
					int salary = sc.nextInt();
					verifySalary(salary);
					person = new Teacher(name, salary);
					person.enrol(school);
					school.showPersonInfoByName((Teacher) person);
				} catch (InvalidSalaryRangeException e) {
					// TODO: handle exception
					System.out.println(e.getMessage());
					performCrud(name, crudQnAns, personType);
				} catch (InputMismatchException e) {
					InputInputTypeException exception = new InputInputTypeException();
					System.out.println(exception.getMessage());
					performCrud(name, crudQnAns, personType);
				} catch (TeacherAlredyExistException e) {
					System.out.println(e.getMessage());
					ansCrudQn(1);
				}
			}
			break;
		case 2:
			// Read Person
			// dummy instance
			if (personType == 1) {
				try {
					verifyStudentExist(name, crudQnAns);
					person = new Student(name);
					school.showPersonInfoByName((Student) person);
				} catch (StudentNotExistException e) {
					// TODO Auto-generated catch block
					System.out.println(e.getMessage());
					ansCrudQn(1);
				}

			} else {
				try {
					verifyTeacherExist(name, crudQnAns);
					person = new Teacher(name);
					school.showPersonInfoByName((Teacher) person);
				} catch (TeacherNotExistException e) {
					// TODO Auto-generated catch block
					System.out.println(e.getMessage());
					ansCrudQn(1);
				}
			}

			break;
		case 3:
			// update person
			if (personType == 1) {
				try {
					verifyStudentExist(name, crudQnAns);

					person = school.getByName(new Student(name));
					school.showPersonInfoByName((Student) person);
					System.out
							.println(String.format("Enter the new GPA for %s (Student). %s", name, "choose from 0-5"));
					float gpa = sc.nextFloat();
					verifyGpa(gpa);
					((Student) person).setGpa(gpa);
					school.showPersonInfoByName((Student) person);
				} catch (InvalidGpaRangeException e) {
					// TODO: handle exception
					System.out.println(e.getMessage());
					performCrud(name, crudQnAns, personType);
				} catch (InputMismatchException e) {
					InputInputTypeException exception = new InputInputTypeException();
					System.out.println(exception.getMessage());
					performCrud(name, crudQnAns, personType);
				} catch (StudentNotExistException e) {
					System.out.println(e.getMessage());
					ansCrudQn(1);
				}

			} else {
				try {
					verifyTeacherExist(name, crudQnAns);
					person = school.getByName(new Teacher(name));
					school.showPersonInfoByName((Teacher) person);
					System.out.println(
							String.format("Enter the new salary for %s (teacher). %s", name, "choose from 1000-10000"));
					int salary = sc.nextInt();
					verifySalary(salary);
					((Teacher) person).setSalary(salary);
					school.showPersonInfoByName((Teacher) person);
				} catch (InvalidSalaryRangeException e) {
					System.out.println(e.getMessage());
					performCrud(name, crudQnAns, personType);
				} catch (InputMismatchException e) {
					InputInputTypeException exception = new InputInputTypeException();
					System.out.println(exception.getMessage());
					performCrud(name, crudQnAns, personType);
				} catch (TeacherNotExistException e) {
					System.out.println(e.getMessage());
					ansCrudQn(1);
				}
			}
			break;
		case 4:
			// delete person
			if (personType == 1) {
				try {
					verifyStudentExist(name, crudQnAns);
					person = school.getByName(new Student(name));

					person.leave(school);
					System.out.println(String.format("%s (student) is deleted\n", name));
				} catch (StudentNotExistException e) {
					System.out.println(e.getMessage());
					ansCrudQn(1);
				}
			} else {
				try {
					verifyTeacherExist(name, crudQnAns);
					person = school.getByName(new Teacher(name));
					person.leave(school);
					System.out.println(String.format("%s (teacher) is deleted\n", name));
				} catch (TeacherNotExistException e) {
					System.out.println(e.getMessage());
					ansCrudQn(1);
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
