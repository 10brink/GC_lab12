import java.util.ArrayList;
import java.util.Scanner;

public class shopping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		ArrayList<Car> cars = new ArrayList<>();

		UsedCar a = new UsedCar("Ford ", "Mustang ", 2011, 20000, 120000);
		UsedCar b = new UsedCar("Ford ", "Explorer", 2017, 23000, 100000);
		UsedCar c = new UsedCar("Nissan", "Sentra  ", 2015, 13000, 230000);
		Car d = new Car("BMW  ", "540i    ", 2019, 50000);
		Car e = new Car("Chevy", "silverado", 2019, 30000);
		Car f = new Car("BMW  ", "x3      ", 2018, 45000);

		cars.add(a);
		cars.add(b);
		cars.add(c);
		cars.add(d);
		cars.add(e);
		cars.add(f);

		for (int i = 0; i < cars.size(); i++) {
			System.out.println((i + 1) + ": " + cars.get(i));

		}
		//
		String quit = "";
		int numcarsbought = 0;
		do {
			System.out.println("which car would you like to look at? (enter a #) ");

		int input = scan.nextInt();
		
		System.out.println(cars.get(input - 1));

		System.out.println("would you like to buy this car? (y/n)");
		String buy = scan.next();
		if (buy.equalsIgnoreCase("y")) {
				System.out.println("great!");
			cars.remove(input - 1);
				numcarsbought++;
		}
		System.out.println("current inventory: ");
		for (int i = 0; i < cars.size(); i++) {

			System.out.println((i + 1) + ": " + cars.get(i));
		}
			System.out.println("continue? (y/n)");
			quit = scan.next();

		} while (!quit.equals("n"));
		if (numcarsbought > 0) {
			System.out.println("thanks for your business!");
		} else {
			System.out.println("thanks for stopping by!");
		}
//
}
}