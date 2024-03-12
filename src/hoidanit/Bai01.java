package hoidanit;

import java.util.Scanner;

public class Bai01 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("My name is : ");
		String name = scanner.nextLine();
		System.out.print("Point : ");
		int point = scanner.nextInt();
		System.out.println(name + " co diem tb la = " + point);
		scanner.close();
	}
}
