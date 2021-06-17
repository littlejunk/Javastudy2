package reload;

public class Test {
	public static void main(String[] args) {
         Apple apple = new Apple("青苹果", "绿", "酸酸的");
         Banana banana = new Banana("香蕉", "黄", "甜甜的");
         ZhaFruit zhaFruit = new ZhaFruit();
         System.out.println(zhaFruit.GetFruitZhi(apple));
         System.out.println(zhaFruit.GetFruitZhi(apple,banana));
         System.out.println(zhaFruit.GetFruitZhi(apple, 3));
         Dog dog = new Dog();
         dog.yao();
         dog.yao("fds");
         dog.yao(new Person('女'));
         dog.yao(new Person('男'));
         Student student = new Student();
         Student student2 = new Student("冰冰");
         Student student3 = new Student("可可", '女', 18);
         System.out.println(student.toString());
         System.out.println(student2.toString());
         System.out.println(student3.toString());
	}
}
