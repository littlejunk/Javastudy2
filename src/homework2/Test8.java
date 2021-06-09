package homework2;


import java.util.Scanner;

public class Test8 {
  public static void main(String[] args) {
	   double radius;
	   double length, area;
	   Scanner s = new Scanner(System.in);
	   radius = s.nextDouble();
	   length = 2 * Math.PI * radius;
	   area = Math.PI * radius * radius;
	   System.out.println("ares = " + area + " length =" + length);
	   
}
}
