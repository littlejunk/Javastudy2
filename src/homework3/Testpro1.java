package homework3;

import java.util.Scanner;

public class Testpro1 {
     public static void main(String[] args) {
		int num;
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入一个整数");
		num = scanner.nextInt();
		if(num > 0) {
			System.out.println("正数");
		}else {
			System.out.println("非正数");
		}
		
	}
}
