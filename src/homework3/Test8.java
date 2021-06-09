package homework3;
import java.util.Scanner;

public class Test8 {
       public static void main(String[] args) {
		   Scanner scanner = new Scanner(System.in);
		   System.out.println("请输入你的成绩：");
		   int grade = scanner.nextInt();
		   System.out.println("你的成绩是否及格:"+(grade >= 60));
	}
}
