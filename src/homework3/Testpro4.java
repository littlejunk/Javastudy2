package homework3;

import java.util.Scanner;

public class Testpro4 {
	public static void main(String[] args) {
          int a,b,c;
          Scanner scanner = new Scanner(System.in);
          System.out.println("��������������");
          a = scanner.nextInt();
          b = scanner.nextInt();
          c = scanner.nextInt();
          if(a>0&&b>0&&c>0 &&a+b>c&&b+c>a&&a+c>b) {
        	  System.out.println("����һ��������");
          }else {
			System.out.println("���ܹ���������");
		  }
	}
}
