package homework3;

import java.util.Scanner;

public class Testpro7 {
     public static void main(String[] args) {
		int total = 1000;
		int yourexp;
		System.out.println("�������Ա����");
		Scanner scanner = new Scanner(System.in);
		yourexp = scanner.nextInt();
		if(yourexp >= 5000) {
			System.out.println("���ۣ��ۺ��ܼۣ�"+total*0.7);
		}else if (yourexp >= 3000) {
			System.out.println("���ۣ��ۺ��ܼۣ�"+total*0.8);
		}else if (yourexp >= 1000) {
			System.out.println("���ۣ��ۺ��ܼۣ�"+total*0.9);
		}else {
			System.out.println("������");
		}
	}
}
