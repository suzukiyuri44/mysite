package lesson33;

public class Person {
	// インスタンスフィールドを定義
	public static int count = 0;
	public String firstname;
	public String lastName;
	public int age;
	public double height, weight;

	// コンストラクタを定義しインスタンスフィールドに値をセット
	Person(String firstName, String lastName, int age, double height, double weight) {
		Person.count++;
		this.firstname = firstName;
		this.lastName = lastName;
		this.age = age;
		this.height = height;
		this.weight = weight;
	}

	// インスタンスメソッド「fullName」を定義
	public String fullName() {
		return this.firstname + this.lastName;
	}

	// インスタンスメソッド「bmi」を定義
	public double bmi() {
		return this.weight / (this.height * this.height);
	}

	// インスタンスメソッド「print」を定義
	public void print() {
		System.out.println("名前は" + fullName() + "です");
		System.out.println("年は" + this.age + "です。");
	}

	// 人数の合計
	public static void printCount() {
		System.out.println("合計" + Person.count + "人です。");
	}

}
