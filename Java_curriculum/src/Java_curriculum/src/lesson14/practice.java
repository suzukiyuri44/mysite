/*
	string型の配列を作成し、アルファベットa～jまでを格納してください。
	brake文を使用し、a～dまで表示してください。
	
	 出力結果：a
	           b
	           c
	           d
	          
	cotinue文を使用し、i以外を表示してください。
	
	 出力結果：a
	           b
	           c
	           d
	           e
	           f
	           g
	           h
	           j
*/
package lesson14;

public class practice {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		String[] al = {"a","b","c","d","e","f","g","h","i","j"};
		for(int i = 0; i<al.length;i++) {
			if(i==4) {
				break;
			}else {
				System.out.println(al[i]);
			}
		}
		
		for(int a = 0;a<al.length;a++) {
			if(a == 8) {
				continue;
		}else {			
			System.out.println(al[a]);		
			}
		}
	}		
}
