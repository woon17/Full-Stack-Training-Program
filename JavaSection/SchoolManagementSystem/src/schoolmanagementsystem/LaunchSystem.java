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

	public Student getPerson(Student student) {
		for (Student s : students) {
			if (s.getName().equals(student.getName())) {
				return s;
			}
		}
		return student;
	}

	public Teacher getPerson(Teacher teacher) {
		for (Teacher s : teachers) {
			if (s.getName().equals(teacher.getName())) {
				return s;
			}
		}
		return teacher;
	}

	public void showPersonInfo(Student student) {
		System.out.println(String.format("%8s%16s", "Student", "GPA"));
		for (Student s : students) {
			if (s.getName().equals(student.getName())) {
				System.out.println(String.format("%8s%16s", s.getName(), s.getGpa()));
			}
		}
	}

	public void showPersonInfo(Teacher teacher) {
		System.out.println(String.format("%8s%16s", "teacher", "Salary"));
		for (Teacher s : teachers) {
			if (s.getName().equals(teacher.getName())) {
				System.out.println(String.format("%8s%16s", s.getName(), s.getSalary()));
			}
		}
	}

	@Override
	public void showStudentsSummary() {
		if (students.size() != 0) {
			System.out.println(String.format("%8s%16s", "Student", "GPA"));
		}

		for (Student s : students) {
			System.out.println(String.format("%8s%16s", s.getName(), s.getGpa()));
		}
		System.out.println(String.format("Total students: %s\n", Student.getNoOfStudents()));
	}

	@Override
	public void showTeachersSummary() {
		if (teachers.size() != 0) {
			System.out.println(String.format("%8s%16s", "teacher", "Salary"));
		}

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

	void ansStQn() {
		String stQn = String.format("%8s%16s%20s%20s", "Student(1)", "Teacher(2)", "Show-students(3)",
				"Show-teachers(4)");
		System.out.println("For student or teach? Choose a number\n" + stQn);
		try {
			Scanner sc = new Scanner(System.in);
			int stQnAns = sc.nextInt();

			verifyStAns(stQnAns);
			if (stQnAns == 3) {
				school.showStudentsSummary();
			} else if (stQnAns == 4) {
				school.showTeachersSummary();
			} else {// 1 or 2
				ansCrudQn(stQnAns);
			}

		} catch (InvalidStAnsException e) {
			System.out.println(e.getMessage());
		} catch (InputMismatchException e) {
			InvalidInputTypeException exception = new InvalidInputTypeException();
			System.out.println(exception.getMessage());
		}
	}

	void verifyStAns(int stQnAns) throws InvalidStAnsException {
		if (stQnAns < 1 || stQnAns > 4) {
			InvalidStAnsException e = new InvalidStAnsException();
			throw e;
		}
	}

	void ansCrudQn(int personType) {
		String crudQn = String.format("%8s%16s%16s%16s", "Create(1)", "Read(2)", "Update(3)", "Delte(4)");
		try {
			Scanner sc = new Scanner(System.in);
			System.out.println("Please enter a number:");
			System.out.println(crudQn);
			int crudQnAns = sc.nextInt();
			verifyCrudAns(crudQnAns);
			String name;
			Person dummyPerson;
			if (personType == 1) {
				System.out.println("Enter the student's name: ");
				name = sc.next();
				dummyPerson = new Student(name);
			} else {
				System.out.println("Enter the teacher's name: ");
				name = sc.next();
				dummyPerson = new Teacher(name);
			}
			performCrudPerson(dummyPerson, crudQnAns);
		} catch (InvalidCrudAnsException e) {
			System.out.println(e.getMessage());
			ansCrudQn(personType);
		} catch (InputMismatchException e) {
			InvalidInputTypeException exception = new InvalidInputTypeException();
			System.out.println(exception.getMessage());
			ansCrudQn(personType);
		}
	}

	void verifyCrudAns(int crudQnAns) throws InvalidCrudAnsException {
		if (crudQnAns < 1 || crudQnAns > 4) {
			InvalidCrudAnsException e = new InvalidCrudAnsException();
			throw e;
		}
	}

	void performCrudPerson(Person person, int crudQnAns) {
		Scanner sc = new Scanner(System.in);
		switch (crudQnAns) {
		case 1:// Create(1)
			try {
				if (person instanceof Student) {
					verifyStudentNotExist(person);
					System.out.println(
							String.format("Enter the GPA for %s (Student). %s", person.getName(), "choose from 0-5"));
					float gpa = sc.nextFloat();
					verifyGpa(gpa);
					((Student) person).setGpa(gpa);
					person.enrol(this.school);
					school.showPersonInfo((Student) person);
				} else {
					verifyTeacherNotExist(person);
					System.out.println(String.format("Enter the Salary for %s (teacher). %s", person.getName(),
							"choose from 1000-10000"));
					int salary = sc.nextInt();
					verifySalary(salary);
					((Teacher) person).setSalary(salary);
					person.enrol(school);
					school.showPersonInfo((Teacher) person);
				}
			} catch (InvalidGpaRangeException e) {
				System.out.println(e.getMessage());
				performCrudPerson(person, crudQnAns);
			} catch (InputMismatchException e) {
				InvalidInputTypeException exception = new InvalidInputTypeException();
				System.out.println(exception.getMessage());
				performCrudPerson(person, crudQnAns);
			} catch (InvalidSalaryRangeException e) {
				System.out.println(e.getMessage());
				performCrudPerson(person, crudQnAns);
			} catch (StudentAlredyExistException e) {
				System.out.println(e.getMessage());
				ansCrudQn(1);
			} catch (TeacherAlredyExistException e) {
				System.out.println(e.getMessage());
				ansCrudQn(1);
			}
			break;
		case 2:// Read(2)
			try {
				if (person instanceof Student) {
					verifyStudentExist(person);
					school.showPersonInfo((Student) person);
				} else {
					verifyTeacherExist(person);
					school.showPersonInfo((Teacher) person);
				}
			} catch (StudentNotExistException e) {
				System.out.println(e.getMessage());
				ansCrudQn(1);
			} catch (TeacherNotExistException e) {
				System.out.println(e.getMessage());
				ansCrudQn(1);
			}
			break;
		case 3:// Update(3)
			try {
				if (person instanceof Student) {
					person = school.getPerson((Student) person);
					verifyStudentExist(person);
					school.showPersonInfo((Student) person);
					System.out.println(String.format("Enter the new GPA for %s (Student). %s", person.getName(),
							"choose from 0-5"));
					float gpa = sc.nextFloat();
					verifyGpa(gpa);
					System.out.println("gpa: " + gpa);
					((Student) person).setGpa(gpa);
					school.showPersonInfo((Student) person);
				} else {
					person = school.getPerson((Teacher) person);
					verifyTeacherExist(person);
					school.showPersonInfo((Teacher) person);
					System.out.println(String.format("Enter the new salary for %s (teacher). %s", person.getName(),
							"choose from 1000-10000"));
					int salary = sc.nextInt();
					verifySalary(salary);
					((Teacher) person).setSalary(salary);
					school.showPersonInfo((Teacher) person);
				}
			} catch (InvalidGpaRangeException e) {
				System.out.println(e.getMessage());
				performCrudPerson(person, crudQnAns);
			} catch (InvalidSalaryRangeException e) {
				System.out.println(e.getMessage());
				performCrudPerson(person, crudQnAns);
			} catch (InputMismatchException e) {
				InvalidInputTypeException exception = new InvalidInputTypeException();
				System.out.println(exception.getMessage());
				performCrudPerson(person, crudQnAns);
			} catch (StudentNotExistException e) {
				System.out.println(e.getMessage());
				ansCrudQn(1);
			} catch (TeacherNotExistException e) {
				System.out.println(e.getMessage());
				ansCrudQn(1);
			}
			break;
		case 4:// Delete(4)
			try {

				if (person instanceof Student) {
					verifyStudentExist(person);
					person = school.getPerson((Student) person);
					person.leave(school);
					System.out.println(String.format("%s (student) is deleted\n", person.getName()));
				} else {
					verifyTeacherExist(person);
					person = school.getPerson((Teacher) person);
					person.leave(school);
					System.out.println(String.format("%s (teacher) is deleted\n", person.getName()));
				}

			} catch (StudentNotExistException e) {
				System.out.println(e.getMessage());
				ansCrudQn(1);
			} catch (TeacherNotExistException e) {
				System.out.println(e.getMessage());
				ansCrudQn(1);
			}
			break;
		default:
			break;
		}
	}

	void verifyStudentNotExist(Person person) throws StudentAlredyExistException {
		if (person.isExistingIn(school)) {
			throw new StudentAlredyExistException();
		}
	}

	void verifyStudentExist(Person person) throws StudentNotExistException {
		if (!person.isExistingIn(school)) {
			throw new StudentNotExistException();
		}
	}

	void verifyTeacherNotExist(Person person) throws TeacherAlredyExistException {
		if (person.isExistingIn(school)) {
			throw new TeacherAlredyExistException();
		}
	}

	void verifyTeacherExist(Person person) throws TeacherNotExistException {
		if (!person.isExistingIn(school)) {
			throw new TeacherNotExistException();
		}
	}

	void verifyGpa(float gpa) throws InvalidGpaRangeException {
		if (gpa < 0 || gpa > 5) {
			InvalidGpaRangeException e = new InvalidGpaRangeException();
			throw e;
		}
	}

	void verifySalary(int salary) throws InvalidSalaryRangeException {
		if (salary < 1000 || salary > 10000) {
			InvalidSalaryRangeException e = new InvalidSalaryRangeException();
			throw e;
		}
	}
}

public class LaunchSystem {

	public static void main(String[] args) {
		Admin admin = new Admin();
		while (!admin.isExit) {
			admin.ansStQn();
		}

	}

}
