class Customer {
	private String cname;
	private String cusername;
	private String cpassword;
	private String cemail;

	public Customer(String cname, String cusername, String cpassword, String cemail) {
		this.cname = cname;
		this.cusername = cusername;
		this.cpassword = cpassword;
		this.cemail = cemail;

	}

	public String toString() {
		return this.cname + " ; cusername: " + this.cusername + " ; cpassword: " + this.cpassword + " ; cemail: "
				+ this.cemail;
	}
}