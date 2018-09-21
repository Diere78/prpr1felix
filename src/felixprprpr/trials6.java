package felixprprpr;

public class trials6 {

	public static void main(String[] args) {
		String romanNumber = "VIII";
		int number = 0;
		
		
		
		for (int index = 0; index <= 3; index++) {
			System.out.println("Index = "+ index);				
	
				if (romanNumber.charAt(index)=='I'){
					number = number + 1;
					
				}
				if (romanNumber.charAt(index)=='V'){
					number = number + 5;
				}
				System.out.println(number);

		}
		
   

			
					
			
			
			
	}
	

}
