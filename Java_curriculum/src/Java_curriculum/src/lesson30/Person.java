package lesson30;

public class Person {
	// インスタンスフィールドを定義
	public String name;
	public int age;
	public  double heigth;
	public double weigth;
	public static int count = 0;
	
	// コンストラクタを定義しインスタンスフィールドに値をセット
	Person(String name,int age,double heigth,double weigth){
		this.name =name;
		this.age = age;
		this.heigth = heigth;
		this.weigth = weigth;
		Person.count++;
	}
	
	//インスタンスメソッド「bmi」を定義
	public double bmi() {
		return this.weigth/Math.pow(this.heigth, 2);
	}
	
	//インスタンスメソッド「print」を定義
	public void print() {
		System.out.println("名前は" + this.name + "です");
		System.out.println("年は"+this.age+"です。");
		System.out.println("BMIは"+String.format("%.1f",bmi())+"です。");
	}
	
	//人数の合計
	public static void Count(){
		System.out.println("合計" + Person.count + "人です。");
		}

}
