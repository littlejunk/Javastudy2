package homework3;

import java.util.Scanner;

public class Testpro4 {
	public static void main(String[] args) {
          int a,b,c;
          Scanner scanner = new Scanner(System.in);
          System.out.println("输入三角形三边");
          a = scanner.nextInt();
          b = scanner.nextInt();
          c = scanner.nextInt();
          if(a>0&&b>0&&c>0 &&a+b>c&&b+c>a&&a+c>b) {
        	  System.out.println("这是一个三角形");
          }else {
			System.out.println("不能构成三角形");
		  }
	}
}
