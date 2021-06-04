

public class Test11 {
	public static void main(String[] args) {
        int a = 5, b = 10;
        System.out.println("交换前： a= " + a + " b = " + b);
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("交换后： a= " + a + " b = " + b);
	}
}
