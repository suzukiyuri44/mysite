/*
 
 名前を入力したら下記がコンソールに出力されるように作ってください
	条件：数値は毎回変わるように作ってください
	 	 サブクラスを使用してください
	 	 メソッドのオーバーライドを使用してください
		 superクラスを使用してください
		 getterとsetterを使用してください
		 packageを2つ作ってメインと処理を分けてください
		 命名する場合は規則にのっとってください
		 コンストラクタを使用してください

	こんにちは 「 名前 」 さん
	ステータス
	HP：849
	MP：862
	攻撃力：375
	素早さ：937
	防御力：24

	さあ冒険に出かけよう！
 
 */
package lesson25.execution;
import java.util.Scanner;

import lesson25.process.status;
import lesson25.process.user;

public class Theme2{
	public static void main(String[] args) {	
		//コンストラクタに表示
		System.out.println("名前を入力してください。");
		
		//クラスの呼び出し
		status st = new status();
		user us = new user();
		
		//名前を入力する処理
		Scanner scan = new Scanner(System.in);
		String line =scan.nextLine();
		status.start(line);
		
		//クラスの呼び出し
		us.quantifying();
	}
}


