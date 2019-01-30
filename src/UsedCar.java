
public class UsedCar extends CarLab{

	private String carMake;
	private String carModel;
	private int carYear;
	private double carPrice;
	private int carMiles;
	private String carType;
	public UsedCar() {
		
		
	}public UsedCar(String carMake, String carModel,String carType,int carYear,int carMiles, double carPrice){
		this.carMake=carMake;
		this.carModel=carModel;
		this.carType=carType;
		this.carYear=carYear;
		this.carMiles=carMiles;
		this.carPrice=carPrice;
		
	}
	public String getCarMake() {
		return carMake;
	}
	public void setCarMake(String carMake) {
		this.carMake = carMake;
	}
	public String getCarModel() {
		return carModel;
	}
	public void setCarModel(String carModel) {
		this.carModel = carModel;
	}
	public int getCarYear() {
		return carYear;
	}
	public void setCarYear(int carYear) {
		this.carYear = carYear;
	}
	public double getCarPrice() {
		return carPrice;
	}
	public void setCarPrice(double carPrice) {
		this.carPrice = carPrice;
	}
	public int getCarMiles() {
		return carMiles;
	}
	public void setCarMiles(int carMiles) {
		this.carMiles = carMiles;
	}
	
	public String getCarType() {
		return carType;
	}
	public void setCarType(String carType) {
		this.carType = carType;
	}
	@Override
	public String toString() {
		return "UsedCar [carMake=" + carMake + ", carModel=" + carModel + ", carYear=" + carYear + ", carPrice="
				+ carPrice + ", carMiles=" + carMiles + ", carType=" + carType + ", getCarMake()=" + getCarMake()
				+ ", getCarModel()=" + getCarModel() + ", getCarYear()=" + getCarYear() + ", getCarPrice()="
				+ getCarPrice() + ", getCarMiles()=" + getCarMiles() + ", getCarType()=" + getCarType()
				+ ", toString()=" + super.toString() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ "]";
	}
	
	
}
