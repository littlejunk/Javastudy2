package reload;

public class Test {
	public static void main(String[] args) {
         Apple apple = new Apple("��ƻ��", "��", "�����");
         Banana banana = new Banana("�㽶", "��", "�����");
         ZhaFruit zhaFruit = new ZhaFruit();
         System.out.println(zhaFruit.GetFruitZhi(apple));
         System.out.println(zhaFruit.GetFruitZhi(apple,banana));
         System.out.println(zhaFruit.GetFruitZhi(apple, 3));
         Dog dog = new Dog();
         dog.yao();
         dog.yao("fds");
         dog.yao(new Person('Ů'));
         dog.yao(new Person('��'));
         Student student = new Student();
         Student student2 = new Student("����");
         Student student3 = new Student("�ɿ�", 'Ů', 18);
         System.out.println(student.toString());
         System.out.println(student2.toString());
         System.out.println(student3.toString());
	}
}
