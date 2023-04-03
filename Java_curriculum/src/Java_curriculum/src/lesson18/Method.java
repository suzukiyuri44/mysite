package lesson18;

import java.util.Random;

public class Method {

	public static void main(String[] args) {
	// Q1：コンソールに「Hello Java」とコンソールに出力するメソッド（関数）を作成してください。
		hello();
	// Q2：引数として整数を渡すと+1して返すメソッド（関数）を作成してください。
		System.out.println(add(1));
	// Q3：引数として整数を2つ渡すと、その引数2つを乗算した値を返すメソッド（関数）を作成してください。
		System.out.println(kakezan(10,8));
	// Q4：引数として小数を2つ渡すと、その引数2つを乗算した値を返すメソッド（関数）を作成してください。
	//     ※ただしメソッド名はQ3のメソッド名と同じにしてください。
		System.out.println(kakezan(1.2,3.4));
	// Q5：引数として数字を渡すと、1～100までのランダムな数字を引数の値分格納して返すメソッド（関数）を作成してください。
		for(int a:getNumber(3)) {
			System.out.println(a);
		};
	// Q6：今回作成するメソッドの引数にQ5のメソッドから出てくる配列を入れます.入れた配列の要素の平均値を返すメソッドを作成してください。
		System.out.println("平均点:"+average(3));
	}
	
	// Q1
	private static void hello() {
		System.out.println("Hello Java");
	}
	// Q2
	private static int add(int num) {
		int i =num+1;
		return i;
	}
	// Q3
	private static int kakezan(int num1,int num2) {
		int i = num1 * num2;
		return i;
	}
	// Q4
	private static double kakezan(double num1,double num2) {
		double i = num1 * num2;
		return i;
	}
	// Q5
	public static int[] getNumber(int count) {
		Random random = new Random();
		int randomValue []=new int[count];
		System.out.println("");
		for(int i=0;i<count;i++) {
			 randomValue[i] = random.nextInt(101)+1;
		}
		return randomValue;
	}
    //Q6
	public static int average(int count) {
		int num[] = getNumber(count);
		int sum = 0;
		int ave = 0;
		System.out.println("");
		for(int i=0;i<count;i++) {
			sum +=num[i];
			ave = sum/count;
			System.out.println(num[i]);
		}
		return ave;
	}
}
