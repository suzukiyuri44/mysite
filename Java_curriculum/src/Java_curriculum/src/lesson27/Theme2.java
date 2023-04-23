/*
 
 	コンソールに下記が入力されたときにコンソール出力結果がコンソールに表示されるように作ってください
 	ライオン:2.1:80,ゾウ:3.2:40,パンダ:1.9:30,チンパンジー:0.94:25,シマウマ:2.4:65,インコ:0.1:50
  	
  	コンソール出力結果
  	
  	コンソールに文字を入力してください
  	動物名：ライオン
	体長：2.1m
	速度：80km/h
	学名：パンテラ レオ
	
	動物名：ゾウ
	体長：3.2m
	速度：40km/h
	学名：ロキソドンタ・サイクロティス
	
	動物名：パンダ
	体長：1.9m
	速度：30km/h
	学名：アイルロポダ・メラノレウカ
	
	動物名：チンパンジー
	体長：0.94m
	速度：25km/h
	学名：パン・トゥログロディテス
	
	動物名：シマウマ
	体長：2.4m
	速度：65km/h
	学名：チャップマンシマウマ
	
	動物名：インコ
	体長：0.1m
	速度：50km/h
	学名：不明

  
  */

package lesson27;
import java.util.Scanner;
public class Theme2{
	public static void main(String[] args) {
		System.out.println("コンソールに文字を入力してください");
		// コンソールに入力した値を取得
		Scanner scanner = new Scanner(System.in);
		String str =scanner.nextLine();
		// コンソールに入力した値を , を区切りに分割しanimalに代入する
		String []animal=  str.split(",");
		// animalをaに代入しaの最後に文字を追加する処理をする。
		for(String a:animal) {
			if(a.equals("ライオン:2.1:80")) {
				a+=":パンテラ レオ";	
			}else if(a.equals("ゾウ:3.2:40")) {
				a += ":ロキソドンタ・サイクロティス";
			}else if(a.equals("パンダ:1.9:30")) {
				a += ":アイルロポダ・メラノレウカ";
			}else if(a.equals("チンパンジー:0.94:25")) {
				a += ":パン・トゥログロディテス";
			}else if(a.equals("シマウマ:2.4:65")) {
				a += ":チャップマンシマウマ";
			}else if(a.equals("インコ:0.1:50")) {
				a += ":不明";
			}
			// a の値を:を区切りに分割し、animalsに代入する
			String []animals =a.split(":");
			// コンソールに出力する。
			System.out.println("動物名："+animals[0]+"\n体長："+animals[1]+"m\n速度："+animals[2]+"km/h\n学名："+animals[3]);
			System.out.println("");
		}
		
	}
}
