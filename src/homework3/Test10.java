package homework3;
import java.util.Scanner;

public class Test10 {
         public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);
			int sell;
			System.out.println("������Ӫҵ�");
			sell = scanner.nextInt();
			if(sell>= 50000) {
				System.out.println("������"+sell*0.1);
			}
		}
}
