package method1kehou;

public class Pig {
     
	private String type;
	
	private String color;
	
	private int aggressivity;
	
	public void walk() {
		System.out.println(type+"品种的"+color+"的猪"+"走来走去");
	}
	
	public void bit() {
		System.out.println(type+"品种的"+color+"的猪"+"打人了,攻击力为"+aggressivity);
	}
	
	public void eat() {
		System.out.println(type+"品种的"+color+"的猪"+"吃得真多");
	}

	@Override
	public String toString() {
		return "Pig [type=" + type + ", color=" + color + ", aggressivity=" + aggressivity + "]";
	}

	public String getType() {
		return type;
	}

	public String getColor() {
		return color;
	}

	public Pig(String type, String color, int aggressivity) {
		super();
		this.type = type;
		this.color = color;
		this.aggressivity = aggressivity;
	}
	
	
	
}
