package method1kehou;

public class TestPig {
    public static void main(String[] args) {
	     Pig pig = new Pig("�й�����", "��ɫ", 5);
	     pig.walk();
	     pig.bit();
	     pig.eat();
	     System.out.println(pig.toString());
	     System.out.println("��ɫ��"+pig.getColor());
	     System.out.println("Ʒ�֣�"+pig.getType());
	}
}
