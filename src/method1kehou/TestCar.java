package method1kehou;

public class TestCar {
     public static void main(String[] args) {
		Car car = new Car("Benz",500000,"ºì");
		car.Luanch();
		car.speed();
		car.sell();
        System.out.println(car.toString());
        
	}
}
