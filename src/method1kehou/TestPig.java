package method1kehou;

public class TestPig {
    public static void main(String[] args) {
	     Pig pig = new Pig("中国大猪", "黑色", 5);
	     pig.walk();
	     pig.bit();
	     pig.eat();
	     System.out.println(pig.toString());
	     System.out.println("颜色："+pig.getColor());
	     System.out.println("品种："+pig.getType());
	}
}
