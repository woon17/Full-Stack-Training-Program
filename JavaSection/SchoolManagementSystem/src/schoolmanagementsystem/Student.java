package schoolmanagementsystem;

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

	public static int getNoOfStudents() {
		return numOfStudents;
	}

	public float getGpa() {
		return gpa;
	}

	public void setGpa(float gpa) {
		this.gpa = gpa;
	}

	@Override
	public void enrol(School school) {
		school.getStudents().add(this);
		numOfStudents++;
	}

	@Override
	public void leave(School school) {
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