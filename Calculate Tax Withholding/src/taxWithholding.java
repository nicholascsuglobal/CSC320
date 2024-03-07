import java.util.Scanner;

public class taxWithholding {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Weekly income: $");
		double income = scanner.nextDouble();
		
		double taxRate;
		
		if (income <500) {
			taxRate = 0.10; // 10%
		} else if (income < 1500) {
			taxRate = 0.15; // 15%
		} else if (income< 2500) {
			taxRate = 0.20; // 20%
		} else {
			taxRate = 0.30; // 30%
			
		}
		
		double taxWithholding = income * taxRate;
		double averageTaxWithholding = taxWithholding / income;
		
		System.out.println("Weekly income: " + income);
		System.out.println("Tax withholding: " + taxWithholding);
		System.out.print("Average tax withholding: " + averageTaxWithholding * 100);
		
		scanner.close();
	}
}

