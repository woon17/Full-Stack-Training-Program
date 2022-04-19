import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "StudentDetail")
public class StudentDetail {
	@Id // primary key
	@Column(name = "id")
	// starting with number form 1
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@Column(name = "company")
	private String company;

	@Column(name = "experience")
	private int experience;
	
	// studentDetailId is the attribute in student class, not table column
	@OneToOne(mappedBy = "studentDetailId", cascade = CascadeType.ALL) 
	private Student student;

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public StudentDetail() {

	}

	public StudentDetail(String company, int experience) {
		super();
		this.company = company;
		this.experience = experience;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public int getExperience() {
		return experience;
	}

	public void setExperience(int experience) {
		this.experience = experience;
	}

	@Override
	public String toString() {
		return "StudentDetail [id=" + id + ", company=" + company + ", experience=" + experience + "]";
	}

}
