package homework3;

import java.util.Scanner;


public class Testpro3 {
    public static void main(String[] args) {
		int num;
		Scanner scanner = new Scanner(System.in);
		num = scanner.nextInt();
		if(num%2 == 1) {
			System.out.println("这是奇数");
		}else {
			System.out.println("这是偶数");
		}
	}
}
