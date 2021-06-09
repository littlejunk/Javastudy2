package classtest;

import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
		question1();
		question2();
	}
    
    public static void question1() {
		long sum=0;
		int a,sumcount;
		Scanner scanner = new Scanner(System.in);
		a = scanner.nextInt();
		sumcount = scanner.nextInt();
		long acount = a;
		for(int i=0; i < sumcount; i++) {
			for(int j=0; j <i; j++) {
				acount *= 10;
				acount += a;
			}
			sum += acount;
		}
		System.out.println(sum);
	}
    
    public static void question2() {
    	double startLength = 100, totalLength = 0;
    	
    	for(int i=0; i<10;i ++) {
    		totalLength += startLength;
    		startLength *= 0.5;
    		if(i == 9) {
    			break;
    		}
    		totalLength += startLength;
    	}
    	System.out.println(totalLength+"  "+startLength);
    }
}
