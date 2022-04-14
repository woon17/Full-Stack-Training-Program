import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "EMPLOYEEANNOTATIONTABLE")
public class Employee {
	@Id // primary key
	@Column(name = "ID")
	private int eId;

	@Column(name = "FIRSTNAME")
	private String eFirstName;
	
	@Column(name = "SECONDNAME")
	private String eSecondName;
	
	@Column(name = "EMAIL")
	private String eEmail;

	public Employee(String eFirstName, String eSecondName, String eEmail) {
		super();
		this.eFirstName = eFirstName;
		this.eSecondName = eSecondName;
		this.eEmail = eEmail;
	}

	public Employee() {

	}

	public int geteId() {
		return eId;
	}

	public void seteId(int eId) {
		this.eId = eId;
	}

	public String geteFirstName() {
		return eFirstName;
	}

	public void seteFirstName(String eFirstName) {
		this.eFirstName = eFirstName;
	}

	public String geteSecondName() {
		return eSecondName;
	}

	public void seteSecondName(String eSecondName) {
		this.eSecondName = eSecondName;
	}

	public String geteEmail() {
		return eEmail;
	}

	public void seteEmail(String eEmail) {
		this.eEmail = eEmail;
	}

	@Override
	public String toString() {
		return "Employee [eId=" + eId + ", eFirstName=" + eFirstName + ", eSecondName=" + eSecondName + ", eEmail="
				+ eEmail + "]";
	}
}
