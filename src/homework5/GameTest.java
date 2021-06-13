package homework5;
import java.util.Scanner;

public class GameTest {

	public static void main(String[] args) {
		//鍒涘缓娓告垙鏍稿績瀵硅薄
		GameCore gc=new GameCore();
		//璋冪敤鍒涘缓闆峰尯鐨勬柟娉�
		gc.createGrid();
		//璋冪敤甯冮浄鐨勬柟娉�
		gc.createMine();
		//璋冪敤娣诲姞闆锋暟鐨勬柟娉�
		gc.setNumber();
		
		Scanner s =new Scanner(System.in);
		while(true) {
			//璋冪敤鏄剧ず闆峰尯鐨勬柟娉�
			gc.show();
			System.out.println("输入x:");
			int x=s.nextInt()-1;
			System.out.println("输入y:");
			int y=s.nextInt()-1;
			gc.play(x, y);
		}
		
		
	}
}
