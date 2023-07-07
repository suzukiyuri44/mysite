package lesson31;

public class Person {
	// インスタンスフィールドを定義
	public String firstName;
	public String lastName;
	public int age;
	public double height;
	public double weight;
	public static int count = 0;

	// コンストラクタを定義しインスタンスフィールドに値をセット
	Person(String firstName, String lastName, int age, double height, double weight) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.height = height;
		this.weight = weight;
		Person.count++;
	}

	// インスタンスメソッド「bmi」を定義
	public double bmi() {
		return this.weight / (this.height * this.height);
	}

	// インスタンスメソッド「fullName」を定義
	public String fullName() {
		return this.firstName + this.lastName;
	}

	// インスタンスメソッド「buy」を定義
	public void buy(Car car) {
		car.setOwner(this.fullName());
		System.out.print(car.getOwner() + "が購入しました。");
	}

	public void buy(Bicycle bicycle) {
		bicycle.setOwner(this.fullName());
		System.out.print(bicycle.getOwner() + "が購入しました。");
	}

	// インスタンスメソッド「print」を定義
	public void print() {
		System.out.println("名前は" + this.fullName() + "です");
		System.out.println("年は" + this.age + "です。");
		System.out.println("BMIは" + String.format("%.1f", this.bmi()) + "です。");
	}

	// 人数の合計
	public static void count() {
		System.out.println("合計" + Person.count + "人です。");
	}

}
