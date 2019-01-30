
public class CarLab {

	private String carMake;
	private String carModel;
	private int carYear;
	private double carPrice;
	
	public CarLab() {
		
	}public CarLab(String carMake, String carModel,int carYear, double carPrice){
		this.carMake=carMake;
		this.carModel=carModel;
		this.carYear=carYear;
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
	@Override
	public String toString() {
		return "CarLab [carMake=" + carMake + ", carModel=" + carModel + ", carYear=" + carYear + ", carPrice="
				+ carPrice + ", getCarMake()=" + getCarMake() + ", getCarModel()=" + getCarModel() + ", getCarYear()="
				+ getCarYear() + ", getCarPrice()=" + getCarPrice() + "]";
	}
	
	}

