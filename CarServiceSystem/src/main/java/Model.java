import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import oracle.jdbc.driver.OracleDriver;

public class Model {
	private String username;
	private String password;
	private Connection con;

	private String cname;
	private String cusername;
	private String cpassword;

	private String carmodel;
	private String cartype;
	private String carnum;
	private String carservice;
	private String carstatus;
	private String carowner;

	private String cemail;

	// load driver and establish the connection to database
	Model() {
		try {
			DriverManager.registerDriver(new OracleDriver());
			System.out.println("Driver is registered successfully");
			con = DriverManager.getConnection("jdbc:oracle:thin:@//localhost:1521/XE", "SYSTEM", "shufa");
			System.out.println("Connection is established successfully");
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	
	}

	public String getCarstatus() {
		return carstatus;
	}

	public void setCarstatus(String carstatus) {
		this.carstatus = carstatus;
	}

	public String getCarowner() {
		return carowner;
	}

	public void setCarowner(String carowner) {
		this.carowner = carowner;
	}

	public String getCarservice() {
		return carservice;
	}

	public void setCarservice(String carservice) {
		this.carservice = carservice;
	}

	public String getCarmodel() {
		return carmodel;
	}

	public void setCarmodel(String carmodel) {
		this.carmodel = carmodel;
	}

	public String getCartype() {
		return cartype;
	}

	public void setCartype(String cartype) {
		this.cartype = cartype;
	}

	public String getCarnum() {
		return carnum;
	}

	public void setCarnum(String carnum) {
		this.carnum = carnum;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public String getCusername() {
		return cusername;
	}

	public void setCusername(String cusername) {
		this.cusername = cusername;
	}

	public String getCpassword() {
		return cpassword;
	}

	public void setCpassword(String cpassword) {
		this.cpassword = cpassword;
	}

	public String getCemail() {
		return cemail;
	}

	public void setCemail(String cemail) {
		this.cemail = cemail;
	}

	public String getUsername() {
		return username;
	}

	public String getPassword() {
		return password;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int adminLoginVerify() {

		try {
			PreparedStatement pstmt;

			pstmt = con.prepareStatement("select * from ADMINDB where USERNAME = ?");
			pstmt.setString(1, this.username);

			ResultSet res = pstmt.executeQuery();

			String passwordFromRes = "";
			System.out.println("admin username: " + this.username);
			if (res.next()) {
				passwordFromRes = res.getString(2);
				System.out.println("passwordFromRes: " + passwordFromRes + " ; this.password: " + this.password);
				System.out.println(this.password.equals(passwordFromRes));

				if (this.password.equals(passwordFromRes)) {
					return 1;
				} else {
					return 0;
				}
			} else {
				return -1;
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		return 0;

	}

	public int cutomerLoginVerify() {

		try {
			PreparedStatement pstmt;

			pstmt = con.prepareStatement("select * from CustomerDB where USERNAME = ?");
			pstmt.setString(1, this.cusername);

			ResultSet res = pstmt.executeQuery();

			String passwordFromRes = "";
			if (res.next()) {
				passwordFromRes = res.getString(3);

				if (this.cpassword.equals(passwordFromRes)) {
					return 1;
				} else {
					return 0;
				}
			} else {
				return -1;
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		return 0;

	}

	public int registerCustomer() {
		try {
			PreparedStatement pstmt = con.prepareStatement("insert into CustomerDB values(?,?,?,?)");

			pstmt.setString(1, this.cname);
			pstmt.setString(2, this.cusername);
			pstmt.setString(3, this.cpassword);
			pstmt.setString(4, this.cemail);
			int rowUpdated = pstmt.executeUpdate();
			System.out.println("customer register query result: " + rowUpdated);
			return 1;

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 0;
	}

	public int addNewCarDetail() {
		try {
			PreparedStatement pstmt = con.prepareStatement("insert into CUSTOMERCARDETAILS values(?,?,?,?,?,?)");

			pstmt.setString(1, this.carmodel);
			pstmt.setString(2, this.cartype);
			pstmt.setString(3, this.carnum);
			pstmt.setString(4, this.carservice);
			pstmt.setString(5, this.carstatus);
			pstmt.setString(6, this.carowner);
			int rowUpdated = pstmt.executeUpdate();
			System.out.println("car detail update query result: " + rowUpdated);
			return 1;

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 0;
	}
	
	public int addCarService() {
		try {
			PreparedStatement pstmt = con.prepareStatement("update CUSTOMERCARDETAILS set SERVICEREQUEST=?, STATUS = ? where OWNER = ?");
			pstmt.setString(1, this.carservice);
			pstmt.setString(2, this.carstatus);
			pstmt.setString(3, this.carowner);
			System.out.println("carservice: " +this.carservice +"; carstatus: " + this.carstatus + " ;carowner: " + this.carowner);
			ResultSet res = pstmt.executeQuery();

			if (res.next()) {// update service and status successfully
				return 1;
			}else {// fail in updating 
				return 0;
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		return 0;
	}

	public String toString() {
		return "admin-username: " + this.username + " ; admin-password: " + this.password + "\n" + "cname: "
				+ this.cname + " ; cusername: " + this.cusername + " ; cpassword: " + this.cpassword + " ; cemail: "
				+ this.cemail + "\n" + "car-owner: " + this.carowner + " ; car-model: " + this.carmodel
				+ " ; car-type: " + this.cartype + " ; car-num: " + this.carnum + " ; car-service: " + this.carservice
				+ " ; service-staus: " + this.carservice;
	}

}
