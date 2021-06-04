

public class Test9 {
	public static void main(String[] args) {
		
		int a = 5201314;
		//从个位到高位依次输出
		while(a != 0) {
			System.out.print(a%10 + "  ");
			a /=10;
		}
	}

}
