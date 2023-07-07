package lesson33;

public class Main {

	public static void main(String[] args) {
		// Personメソッドをperson2の値入力
		Person person1 = new Person("鈴木", "太郎", 20, 1.7, 60);
		// person1の値をprintメソッドを入力し、コンソールに出力
		person1.print();
		
		// Personメソッドをperson2の値入力
		Person person2 = new Person("山田", "花子", 22, 1.5, 40);
		// person2の値をprintメソッドを入力し、コンソールに出力
		person2.print();
		
		// printCountの値を出力
		Person.printCount();
	}

}
