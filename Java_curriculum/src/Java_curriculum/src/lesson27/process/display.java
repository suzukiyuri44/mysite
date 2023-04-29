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
			
			// animalを呼び出し
			animal an = new animal();
			
			// animalsをanimalクラスのinputに代入する
			an.setName(animals[0]);
			an.setLength(Double.parseDouble(animals[1]));
			an.setSpeed(Integer.parseInt(animals[2]));
			an.setScientific_name(animals[3]);
			
			// コンストラクタの表示処理
			System.out.println("動物："+an.getName());
			System.out.println("体長："+an.getLength()+"m");
			System.out.println("速度："+an.getSpeed()+"km/h");
			System.out.println("学名："+an.getScientific_name());
			System.out.println("");
			
		}
	}

}
