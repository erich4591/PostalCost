import java.util.Scanner;

public class PostalCost {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Give the zone: ");
		String zone = scan.nextLine();
		System.out.print("Give the weight(lb):");
		double weight = scan.nextDouble();
		double cost = 0;
		if (zone.equals("a") || zone.equals("A")) {
			if (weight <= 1 && weight > 0) {
				cost = 3.5;
			} else if (weight <= 3 && weight > 1) {
				cost = 5;
			}
			System.out.print("The cost is: $" + cost);
		} else if (zone.equals("b") || zone.equals("B")) {
			if (weight <= 2 && weight > 0) {
				cost = 2.5;
			} else if (weight <= 3 && weight > 2) {
				cost = 4;
			}
			System.out.print("The cost is: $" + cost);
		} else {
			System.out.print("Invalid Zone");
		}
		
	}

}
