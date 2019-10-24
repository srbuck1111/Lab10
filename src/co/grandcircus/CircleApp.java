package co.grandcircus;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CircleApp {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		String ans = "Y";
		
		int counter = 0;

		List<Circle> circles = new ArrayList<>();

		while (ans.equalsIgnoreCase("Y")) {

			double radius = Validator.getDouble(scan, "Enter radius of circle: ");

			Circle circle = new Circle(radius);

			circles.add(circle);
			
			System.out.println(circles.get(counter));
			
			counter++;
			
			System.out.println("Again? (Y/N)");
			ans = scan.nextLine();

		}
		
		System.out.println(circles.size() + " circles created.");
		
		scan.close();
		
	}
	
}
