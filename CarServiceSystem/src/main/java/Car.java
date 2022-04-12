
public class Car {

	private String carmodel;
	private String cartype;
	private String carnum;
	private String carservice;
	private String carstatus;
	private String carowner;

	public Car(String carmodel, String cartype, String carnum, String carservice, String carstatus, String carowner) {
		this.carmodel = carmodel;
		this.cartype = cartype;
		this.carnum = carnum;
		this.carservice = carservice;
		this.carstatus = carstatus;
		this.carowner = carowner;
	}
	
	@Override
	public String toString() {
		return "car-owner: " + this.carowner + " ; car-model: " + this.carmodel
				+ " ; car-type: " + this.cartype + " ; car-num: " + this.carnum + " ; car-service: " + this.carservice
				+ " ; service-staus: " + this.carstatus;
	}
}
