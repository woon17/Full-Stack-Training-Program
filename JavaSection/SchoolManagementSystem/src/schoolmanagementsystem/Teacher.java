package schoolmanagementsystem;
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

	public static int getNoOfTeachers() {
		return numOfTeachers;
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