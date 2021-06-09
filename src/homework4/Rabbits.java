package homework4;

import java.util.Scanner;

public class Rabbits {
     public static void main(String[] args) {
	        int num = 1, num1 = 1, num2 = 0, months;
	        Scanner scanner = new Scanner(System.in);
	        System.out.println("ÇëÊäÈëÔÂÊı");
	        months = scanner.nextInt();
	        for(int i=0; i< months; i++) {
	        	num2 = num1 + num;
	        	num = num1;
	        	num1 = num2;
	        }
	        System.out.println(num2);
	 }
}
