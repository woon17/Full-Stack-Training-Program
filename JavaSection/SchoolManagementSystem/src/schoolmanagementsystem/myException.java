package schoolmanagementsystem;

class InvalidStAnsException extends Exception {
	public String getMessage() {
		String line = String.format("%70s\n", " ").replace(" ", "*");
		String warning = "Waining: Choose Student(1) Teacher(2) Show-student(3) Show-teachers(4)\n";
		return line + warning + line;
	}
}

class InvalidCrudAnsException extends Exception {
	public String getMessage() {
		String line = String.format("%70s\n", " ").replace(" ", "*");
		String warning = "Waining: Choose Create(1) Read(2) Update(3) Delte(4)\n";
		return line + warning + line;
	}
}

class InvalidInputTypeException extends Exception {
	public String getMessage() {
		String line = String.format("%70s\n", " ").replace(" ", "*");
		String warning = "Waring: Choose a number\n";
		return line + warning + line;
	}
}

class InvalidGpaRangeException extends Exception {
	public String getMessage() {
		String line = String.format("%70s\n", " ").replace(" ", "*");
		String warning = "Waining: choose from 0-5\n";
		return line + warning + line;
	}
}

class StudentAlredyExistException extends Exception {
	public String getMessage() {
		String line = String.format("%70s\n", " ").replace(" ", "*");
		String warning = "Waining: cannot add as current student is alredy exsiting\n";
		return line + warning + line;
	}
}

class StudentNotExistException extends Exception {
	public String getMessage() {
		String line = String.format("%70s\n", " ").replace(" ", "*");
		String warning = "Waining: This student does not exist\n";
		return line + warning + line;
	}
}

class InvalidSalaryRangeException extends Exception {
	public String getMessage() {
		String line = String.format("%70s\n", " ").replace(" ", "*");
		String warning = "Waining: choose from 1000-10000\n";
		return line + warning + line;
	}
}

class TeacherAlredyExistException extends Exception {
	public String getMessage() {
		String line = String.format("%70s\n", " ").replace(" ", "*");
		String warning = "Waining: cannot add as current teacher is alredy exsiting\n";
		return line + warning + line;
	}
}

class TeacherNotExistException extends Exception {
	public String getMessage() {
		String line = String.format("%70s\n", " ").replace(" ", "*");
		String warning = "Waining: This teacher does not exist\n";
		return line + warning + line;
	}
}