package gg;

public class Test7 {
  public static void main(String[] args) {
	 char a = 'A', b = 'B', c = 'C', d = 'D';
	 char temp;
	 temp = a;
	 a = d;
	 d = temp;
	 temp = b;
	 b = c;
	 c = temp;
	 System.out.println("a = " + a + " b = "+ b + " c = " + c + " d = " + d );
}
}
