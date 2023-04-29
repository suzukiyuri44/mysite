package lesson27.process;

public class animal {
	
	// フィールド変数
	public String name;
	public double length;
	public int speed;
	public String scientific_name;
	
	
	
	// セッターとゲッターメソッド
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setLength(double length) {
		this.length =length;
	}
	
	public double getLength() {
		return this.length;
	}
	
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
	public int getSpeed() {
		return this.speed;
	}
	
	public void setScientific_name(String scientific_name) {
		this.scientific_name = scientific_name;
	}
	
	public String getScientific_name() {
		return this.scientific_name;
	}
}
