
public class UsedCar extends Car {

	private double mileage;

	public UsedCar() {
		super();
		// TODO Auto-generated constructor stub
	}

	public UsedCar(String make, String model, int year, double price, double mileage) {
		super(make, model, year, price);
		this.mileage = mileage;
		// TODO Auto-generated constructor stub
	}

	public double getMileage() {
		return mileage;
	}

	public void setMileage(double mileage) {
		this.mileage = mileage;
	}

	@Override
	public String toString() {
		return getMake() + "\t" + getModel() + "\t" + getYear() + "\t $" + getPrice() + " (Used) mileage=" + mileage;
	}

}
