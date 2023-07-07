package lesson31;

public class Main {

	public static void main(String[] args) {
		Person person1 = new Person("鈴木", "太郎", 20, 1.7, 60);
		Person person2 = new Person("山田", "花子", 22, 1.5, 40);

		// buyメソッドの処理
		Car car = new Car();
		Bicycle bicycle = new Bicycle();
		// carとbicycleにfullNameを値を入力
		car.setOwner(person1.fullName());
		bicycle.setOwner(person2.fullName());
		// コンソールに表示
		System.out.println(car.getOwner());
		System.out.println(bicycle.getOwner());
		// fullNameを値をbuyメソッドに代入
		person1.buy(car);
		person2.buy(bicycle);
		// countの値を入力
		Person.count();
	}

}
