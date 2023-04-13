package lesson25.process;

import java.util.Random;

public class user extends status{
	
	
	@Override
	public void quantifying(){
		Random random = new Random();		
		int h = random.nextInt(1000);
		int m= random.nextInt(1000);
		int at = random.nextInt(1000);
		int ra =random.nextInt(1000);
		int de= random.nextInt(1000);
		
		status st = new status();
		st.setHp(h);
		st.setMp(m);
		st.setAttack(at);
		st.setRapidity(ra);
		st.setDefense(de);
		st.quantifying();
	}
	
}