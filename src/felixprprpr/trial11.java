package felixprprpr;

public class trial11 {

	public static void main(String[] args) {
		int randomsiffra = 252; 
		String prim = "";
		
		for (int i = 2; i < randomsiffra;) {
			System.out.println((double) randomsiffra / i + " : " + (int) randomsiffra / i);
			if ((double) randomsiffra / i == (int) randomsiffra / i) {
				randomsiffra = randomsiffra / i;
				prim += " " + i; 
			} else 
				i++;
			
			
			System.out.println(randomsiffra);
		}  
		System.out.println( "" + prim + " " + randomsiffra);
		
	
		
		

	}

}
