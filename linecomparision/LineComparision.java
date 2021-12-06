package linecomparision;

import java.util.Scanner;

public class LineComparision {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter the value of x1");
		int x1 = scanner.nextInt();
		System.out.println("enter the value of x2");
		int x2 = scanner.nextInt();
		System.out.println("enter the value of y1");
		int y1 = scanner.nextInt();
		System.out.println("enter the value of y2");
		int y2 = scanner.nextInt();
		
		double length = Math.sqrt(Math.pow((x2-x1),2) + Math.pow((y2-y1),2));
		System.out.println("length = " + length);
				
	}

}
