package method1kehou;

public class Car {
    
	private String brand;
    
	private double price;
	
	private String color;
	
	
	public Car(String brand, double price, String color) {
		super();
		this.brand = brand;
		this.price = price;
		this.color = color;
	}

	public void Luanch() {
		System.out.println(brand+"品牌汽车启动了");
	}
	
	public void speed() {
		System.out.println(brand+"品牌汽车加速中");
	}
    
	public void sell() {
		System.out.println(brand+"品牌的汽车被以"+price+"元价格卖出了");
	}

	@Override
	public String toString() {
		return "Car [brand=" + brand + ", price=" + price + ", color=" + color + "]";
	}
	
	
}
