package homework3;

import java.util.Scanner;

public class Testpro10 {
     public static void main(String[] args) {
		int year, month;
		Scanner scanner = new Scanner(System.in);
		System.out.println("�������� �ո����");
		year = scanner.nextInt();
		month = scanner.nextInt();
		while(year < 0) {
			System.out.println("���������������");
			year = scanner.nextInt();
		}
		while( month > 12 || month < 1) {
			System.out.println("�������������·�");
			month = scanner.nextInt();
		}
		if((year % 4 == 0 && year % 100 != 0)|| year % 400 == 0){
			if(month == 2) {
				System.out.println("������29��");
			}else if(month == 1 || month == 3 || month == 5 || month == 7
					|| month == 8 || month == 10 || month == 12) {
				System.out.println("������31��");
			}else {
			          System.out.println("������30��");
		          }
	    }else {
	    	if(month == 2) {
				System.out.println("������28��");
			}else if(month == 1 || month == 3 || month == 5 || month == 7
					|| month == 8 || month == 10 || month == 12) {
				System.out.println("������31��");
			}else {
			          System.out.println("������30��");
		          }
		}
     }
}
