import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "student")
public class Student {
	@Id
	@Column(name = "id")
	private int id;

	@Column(name = "firstname")
	private String firstname;

	@Column(name = "lastname")
	private String lastname;

	@Column(name = "email")
	private String email;

	@OneToOne(cascade = CascadeType.ALL)
	// f_key
	@JoinColumn(name = "studentDetailId") // studentDetailId from student table
	private StudentDetail studentDetailId;// studentDetailId is the studentDetail primary key

	// student is the attribute in student class
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "student", cascade = { CascadeType.MERGE, CascadeType.DETACH, CascadeType.PERSIST,
			CascadeType.REFRESH })
	// no f_key
	private List<Course> courses;

	public Student() {

	}

	public Student(String firstname, String lastname, String email) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
		this.email = email;
	}

	public void add(Course temCourse) {
		if (this.courses == null) {
			this.courses = new ArrayList<>();

		} else {
			this.courses.add(temCourse);
			temCourse.setStudent(this);
		}
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public StudentDetail getStudentDetailId() {
		return studentDetailId;
	}

	public void setStudentDetailId(StudentDetail studentDetailId) {
		this.studentDetailId = studentDetailId;
	}

	public List<Course> getCourses() {
		return courses;
	}

	public void setCourses(List<Course> courses) {
		this.courses = courses;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", firstname=" + firstname + ", lastname=" + lastname + ", email=" + email + "]";
	}

}
