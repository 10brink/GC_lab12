import java.util.ArrayList;
import java.util.Scanner;


public class CarApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);

		ArrayList<Car> cars = new ArrayList<>();

		System.out.println("how many cars to enter ");

		int num = scan.nextInt();
		scan.nextLine();

		for (int i = 0; i < num; i++) {

			System.out.println("enter the car #" + (i + 1) + " make: ");
			String make = scan.nextLine();

			// scan.next();

			System.out.println("enter the car #" + (i + 1) + " model: ");
			String model = scan.nextLine();

			System.out.println("enter the car #" + (i + 1) + " year: ");
			int year = scan.nextInt();
			// scan.nextLine(); // going from integer back to string, needs garbage line to
			// clear it out
			System.out.println("enter the car #" + (i + 1) + "  price: ");
			double price = scan.nextDouble();
			scan.nextLine(); // going from integer back to string, needs garbage line to
			// clear it out

			cars.add(new Car(make, model, year, price));
			// scan.next();
		}

		// System.out.println(cars);

		System.out.println("current inventory");
		for (int i = 0; i < cars.size(); i++) {
			System.out.println(cars.get(i));
		}
		scan.close();
	}

}
