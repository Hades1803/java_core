package hoidanit;

import java.util.Scanner;

public class Bai02 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhap chieu dai : ");
		int chieuDai = scanner.nextInt();
		System.out.print("Nhap chieu rong : ");
		int chieuRong = scanner.nextInt();
		System.out.println("Chu vi hinh chu nhat la : " + (chieuDai + chieuRong) * 2);
		System.out.println("Dien tich hinh chu nhat la : " + (chieuDai * chieuRong));
		System.out.println("Canh nho nhat cua hinh chu nhat la : " + Math.min(chieuDai, chieuRong));
		scanner.close();
	}
}
