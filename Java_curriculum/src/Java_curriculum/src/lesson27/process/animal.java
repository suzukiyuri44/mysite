package lesson27.process;

public class animal {
	
	// フィールド変数
	private String name;
	private String length;
	private String speed;
	private String scientific_name;
	
	// コンソールに表示する処理
	public void input() {
		System.out.println("動物名："+this.getName());
		System.out.println("体長："+this.getLength()+"m");
		System.out.println("速度："+this.getSpeed()+"km/h");
		System.out.println("学名："+this.getScientific_name());
		System.out.println("");
	}
	
	// セッターとゲッターメソッド
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setLength(String length) {
		this.length =length;
	}
	
	public String getLength() {
		return this.length;
	}
	
	public void setSpeed(String speed) {
		this.speed = speed;
	}
	
	public String getSpeed() {
		return this.speed;
	}
	
	public void setScientific_name(String scientific_name) {
		this.scientific_name = scientific_name;
	}
	
	public String getScientific_name() {
		return this.scientific_name;
	}
}
