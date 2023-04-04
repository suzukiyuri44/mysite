/*
 	
 	下記がコンソールに出力されるように作成してください
 	※thisとsetterとgetterとフィールドを使ってください
 	
  	動物名：ライオン
	体長：2.1m
	速度：80km/h
 	
 */

package lesson23;

class animal{
	private String name;
	private double height;
	private int speed;
	
	public void  setName(String animal_name) {
		this.name = animal_name;
	}
	
	public String getName(){
		return this.name;
	}
	
	public void setHeigth(double animal_heigth) {
		this.height = animal_heigth;
	}
	
	public double getHeigth() {
		return this.height;
	}
	
	public void setSpeed(int animal_speed) {
		this.speed = animal_speed;
	}
	
	public int getSpeed() {
		return this.speed;
	}
}

public class Theme2{
	public static void main(String[] args) {
		animal detail = new animal();
		detail.setName("ライオン");
		detail.setHeigth(2.1);
		detail.setSpeed(80);
		
		System.out.println("動物名："+detail.getName());
		System.out.println("体長："+detail.getHeigth()+"m");
		System.out.println("速度："+detail.getSpeed()+"km/h");
	}
}