package lesson16;

public class DataTypeAndMemory {

	public static void main(String[] args) {
		// Q1：「A」という文字列を変数に代入してコンソールに出力してください。
			char character_a;
			character_a = 'A';
			System.out.println(character_a);
		// Q2：「Hello Java」という文字列を変数に代入してコンソールに出力してください。
			String greeting;
			greeting = "Hello Java";
			System.out.println(greeting);
		// Q3：富士山の標高を整数で変数に代入してコンソールに出力してください。
			int elevation;
			elevation = 3776;
			System.out.println(elevation);
		// Q4：円周率を小数点第二位まで変数に代入してコンソールに出力してください。
			double pi;
			pi = 3.14;
			System.out.println(pi);
		// Q5：変数numsに「10, 100, 1000」が格納された配列を代入して、コンソールにメモリの番地が1のデータを出力してください。
			int[] nums = new int[3];
			nums[0] = 10;
			nums[1] = 100;
			nums[2] = 1000;
			System.out.println(nums[1]);
		// Q6：Q5で作成した変数numsを変数bに代入し、その後変数bのメモリの番地が1のデータを「8」に上書きさせて
		//     コンソールに変数numsと変数bのメモリの番地が1のデータを出力させて、変数nums値が変わることを確認してください。
			int [] b = nums;
			b[1] = 8;
			System.out.println(b[1]);
	}

}
