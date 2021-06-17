package method1shangji;

public class Dog {
     
	  private String name;
     
	  private boolean sex;
     
	  private String type;
	 
	 public Dog(String name, boolean sex, String type) {
		// TODO Auto-generated constructor stub
		 this.name = name;
		 this.type = type;
		 this.sex = sex;
	}
	 
	 public void run() {
		System.out.println(type+"品种的狗跑得好快");
	}
	 
	 public void growth() {
		System.out.println(name+"长大了");
	}

	public String getName() {
		return name;
	}

	public boolean getSex() {
		return sex;
	}

	public String getType() {
		return type;
	}

	@Override
	public String toString() {
		return name + "    " + sex + "    " + type;
	}
	 
	 
}
