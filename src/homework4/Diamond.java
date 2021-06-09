package homework4;

import java.util.Scanner;

public class Diamond {
       public static void main(String[] args) {
		  int maxLength,startnum = 1;
		  Scanner scanner = new Scanner(System.in);
		  System.out.println("请输入菱形对角线长度（奇数）：");
		  maxLength = scanner.nextInt();
		  for(int i=0; i<maxLength; i++) {
			  for(int j=0; j<Math.abs((maxLength-startnum)/2); j++) {
				  System.out.print(" ");
			  }
			  for(int j=0; j<startnum; j++) {
				  System.out.print("*");
			  }
			  if(i < (maxLength-1)/2) {
				  startnum += 2;
			  }else {
				  startnum -=2;
			 }
			 System.out.println();
		  }
		 
       }
}
