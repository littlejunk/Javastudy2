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
		System.out.println(brand+"Ʒ������������");
	}
	
	public void speed() {
		System.out.println(brand+"Ʒ������������");
	}
    
	public void sell() {
		System.out.println(brand+"Ʒ�Ƶ���������"+price+"Ԫ�۸�������");
	}

	@Override
	public String toString() {
		return "Car [brand=" + brand + ", price=" + price + ", color=" + color + "]";
	}
	
	
}
