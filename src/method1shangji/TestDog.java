package method1shangji;

public class TestDog {
     public static void main(String[] args) {
		 Dog dog = new Dog("Íú²Æ",true,"Ì©µÏ");
		 dog.run();
		 dog.growth();
		 String name = dog.getName();
		 String type = dog.getType();
		 boolean sex = dog.getSex();
		 String info = dog.toString();
		 System.out.println(name);
		 System.out.println(type);
		 System.out.println(sex);
		 System.out.println(info);
		 
	}
}
