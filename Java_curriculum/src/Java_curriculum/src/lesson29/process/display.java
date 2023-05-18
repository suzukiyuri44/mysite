package lesson29.process;
import java.util.Arrays;
import java.util.Collections;

public class display extends prefectures {
	public static void input(Integer[]numbers,String order) {
		// orderの値が昇順の場合
		if(order.equals("昇順")) {
			// nubersの値を昇順に並べる
			Arrays.sort(numbers);
			// numbersの値をanswerクラスに格納する
			for ( int i = 0; i < numbers.length; i++ ) {
				answer(numbers[i]);
			}
		// orderの値が降順の場合
		}else if (order.equals("降順")) {
			// nubersの値を降順に並べる
			Arrays.sort(numbers, Collections.reverseOrder());
			// numbersの値をanswerクラスに格納する
			for ( int i = 0; i < numbers.length; i++ ) {
				answer(numbers[i]);
			}
			// orderの値が昇順と降順以外の場合
		}else{
			System.out.println("再度、数字と昇順か降順を入力してください。");
		}	
	}

	public static void answer( Integer numbers) {
		// Intege型をString型に変更
		String num = Integer.valueOf(numbers).toString();
		// ,で区切られた文字列を配列nに格納
		String[] n =num.split(",");
		// 型を宣言
		String change = null;
		// nをchに代入し該当する数字をchangeに代入する
		for(String ch:n) {
			if(ch.equals("0:")) {
				change += "北海道:札幌市:8342";
			}else if(ch.equals("1")) {
				change += "青森県:青森市:9646";
			}else if(ch.equals("2")) {
				change += "岩手県:盛岡市:15275";
			}else if(ch.equals("3")) {
				change += "宮城県:仙台市:7282";
			}else if(ch.equals("4")) {
				change += "秋田県:秋田市:11638";
			}else if(ch.equals("5")) {
				change += "山形県:山形市:9323";
			}else if(ch.equals("6")) {
				change += "福島県:福島市:1378";
			}else if (ch.equals("7")) {
				change += "茨城県:水戸市:6097";
			}else if (ch.equals("8")) {
				change += "栃木県:宇都宮市:6408";
			}else if (ch.equals("9")) {
				change += "群馬県:前橋市:6362";
			}else if (ch.equals("10")) {
				change += "埼玉県:さいたま市:3798";
			}
			
			// changeの初期化の文字を取る。
			String str = change.substring(4,change.length());
			// :で区切られた文字列を配列chaに格納
			String[] cha = str.split(":");
			// prefecturesを呼び出し
			prefectures pre = new prefectures();
			// chaをprefecturesクラスにあるセッターに代入する。
			pre.setName(cha[0]);
			pre.setCity(cha[1]);
			pre.setArea(Double.parseDouble(cha[2]));
			// コンストラクタの表示処理
			System.out.println("");	
			System.out.println("都道府県:"+pre.getName());
			System.out.println("県庁所在地:"+pre.getCity());
			System.out.println("面積:"+pre.getArea()+"km2");
		}
	}

}
