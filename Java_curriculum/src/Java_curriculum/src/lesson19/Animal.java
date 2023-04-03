package lesson19;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Animal {
	
	public static void main(String[] args) {
		// Q1：Dogクラスを呼び出して変数に代入し、動物の名前をコンソールに出力してください。
		Dog name = new Dog();
		System.out.println(name.dogname);
		// Q2：Dogクラスを呼び出して変数に代入し、動物の数をコンソールに出力してください。
		Dog num = new Dog();
		System.out.println(num.dognum);
		// 現在の日時を「yyyy-MM-dd H:m:s」形式で変数に代入して、コンソールに出力してください
		Date exDate = new Date(); 
        SimpleDateFormat DateFormat = new SimpleDateFormat("yyyy/MM/dd H:m:s"); 
        System.out.println(DateFormat.format(exDate));
	}
}
