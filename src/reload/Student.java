package reload;

public class Student {
     
	private String name;
	
	private char sex;
	
	private int age;

	public Student() {
		super();
	}

	public Student(String name, char sex, int age) {
		super();
		this.name = name;
		this.sex = sex;
		this.age = age;
	}

	public Student(String name) {
		super();
		this.name = name;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", sex=" + sex + ", age=" + age + "]";
	}
	
	
	
}
