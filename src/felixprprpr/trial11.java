package felixprprpr;

public class trial11 {

	public static void main(String[] args) {
		int randomsiffra = 252; 
		int prim = 0;
		
		for (int i = 2; i < randomsiffra;) {
			if (randomsiffra / i == (int) randomsiffra / i) {
				randomsiffra = randomsiffra / i;
			}else i = i + 1;
			
			System.out.println(randomsiffra);
		}
		 
		
	
		
		

	}

}
