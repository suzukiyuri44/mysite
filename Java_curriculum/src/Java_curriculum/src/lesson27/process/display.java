package lesson27.process;

public class display extends animal {
	
	public static void input(String str) {
		
		// Theme2クラスのstrを","を区切りanimalに代入する
		String []animal=  str.split(",");
		
		// animalをaに代入し該当する学名を最後に追加する
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
			
			// aの文字列を":"を区切りanimalsに代入する。
			String []animals =a.split(":");
			
			// animalsクラスを呼び出す
			animal ani = new animal();
			
			// animalsをanimalクラスのinputに代入する
			ani.setName(animals[0]);
			ani.setLength(animals[1]);
			ani.setSpeed(animals[2]);
			ani.setScientific_name(animals[3]);
			ani.input();
			
		}
	}

}
