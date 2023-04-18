package lesson25.process;

import java.util.Random;

public class user extends status{
	
	public void quantifying(){
		//ランダム処理
		int[]ran =new int[5];
		for(int i =0;i<5;i++) {
			Random random = new Random();
			ran[i]=random.nextInt(1000);
		}
		
		//statusクラスのsetterに値を処理
		status st = new status();
		st.setHp(ran[0]);
		st.setMp(ran[1]);
		st.setAttack(ran[2]);
		st.setRapidity(ran[3]);
		st.setDefense(ran[4]);
		st.quantifying();
	}
	
}