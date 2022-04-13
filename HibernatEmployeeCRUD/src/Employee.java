
public class Employee {
	private int eId;
	private String eFirstName;
	private String eSecondName;
	private String eEmail;

	public Employee(int eId, String eFirstName, String eSecondName, String eEmail) {
		super();
		this.eId = eId;
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
