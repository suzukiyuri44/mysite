/*
 	
 	0, "北海道:札幌市:83424"
	1, "青森県:青森市:9646"
	2, "岩手県:盛岡市:15275"
	3, "宮城県:仙台市:7282"
	4, "秋田県:秋田市:11638"
	5, "山形県:山形市:9323"
	6, "福島県:福島市:13784"
	7, "茨城県:水戸市:6097"
	8, "栃木県:宇都宮市:6408"
	9, "群馬県:前橋市:6362"
	10, "埼玉県:さいたま市:3798"
 	
 	コンソールに数字と昇順・降順の値が入力されると上記配列に対応する
 	都道府県がソートされてコンソールに出力されるように作ってください
   	※Packageを2つ作ってください
   	※複数選択できるようにしてください
   	
   	例:
   	8,5,9,.....
   	と入力された場合（昇順）
   	
   	都道府県名：山形県
	県庁所在地：山形市
	面積：9323.0km2
   	
   	都道府県名：栃木県
	県庁所在地：宇都宮市
	面積：6408.0km2

   	都道府県名：群馬県
	県庁所在地：前橋市
	面積：6362.0km2
	
 */

package lesson29.execution;

import java.util.Scanner;

import lesson29.process.display;

public class Theme2{
	public static void main(String[] args){
		// 型を宣言
		Integer[] number;
		// Scannerを作成。
		Scanner scan = new Scanner(System.in);
		System.out.println("数字を入力してください。");
		// 入力した整数を配列に格納する。
		number =  scanNumbers();
		System.out.println("昇順か降順を入力してください。");
		// 入力した整数を配列に格納する。
		String order = scan.next();
		// displayクラスの中にあるinputにnumberとorderを代入
		display.input(number,order);
	}
	
	// キーボード入力した文字列を配列に格納
	private static Integer[] scanNumbers() {
		// Scannerを作成。
		Scanner scan = new Scanner(System.in);
		// 入力した値をlineに格納。
		String line = scan.nextLine();
		// ,で区切られた文字列を配列valuesに格納
		String [] values = line.split(",");
		// 配列の作成
		Integer[] numbers = new Integer[values.length];
		//  valuesの値をint型に変換し、numbersに格納
		for(int i=0;i<values.length;i++) {
			// 文字列values[i]をInteger型に変換
			try {
				numbers[i] = Integer.parseInt(values[i]);
			}catch(NumberFormatException ex ) {
				return null;
			}
		}
		// Integer型の配列を戻す
		return numbers;
	}
}

 