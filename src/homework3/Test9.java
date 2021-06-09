package homework3;
import java.util.Scanner;

public class Test9 {
    public static void main(String[] args) {
		int grade;
		System.out.println("请输入你的成绩：");
		Scanner scanner = new Scanner(System.in);
		grade = scanner.nextInt();
		if(grade >= 60) {
			System.out.println("及格了，安心去玩啦");
		}
	}
}
