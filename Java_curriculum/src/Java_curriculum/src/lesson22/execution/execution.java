package lesson22.execution;

import java.text.SimpleDateFormat;
import java.util.Date;

import lesson22.process.process;

public class execution {

	/*
	 
	下記がコンソールに出力されるように作成してください
	
		こんにちは！ここは日本です！
		この寿司はうまい
		寿司は和食です
		今の現在日時は2023/03/09 10:23:39です

	【条件】
		・JavaProjectを新規作成し、実行用のpackageと処理用のpackageを作成してください。
		・適切なファイルにフィールドで変数を必要な数作ってください。
		・thisを使って作成してください。
		・日時は今日の日付を取得してください。
		
  */
	
	public static void main(String[] args) {
		process feature = new process();
		System.out.println(feature.japan_greeting);
		System.out.println(feature.sushi);
		System.out.println(feature.cuisine);
		
		Date exDate = new Date(); 
        SimpleDateFormat DateFormat = new SimpleDateFormat("yyyy/MM/dd H:m:s"); 
        System.out.println("今の現在日時は"+DateFormat.format(exDate)+"です。");
		
	}

}
