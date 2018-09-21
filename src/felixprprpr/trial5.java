package felixprprpr;

public class trial5 {

	public static void main(String[] args) {
		int i = 5678;
		
		int tusental = (int) Math.floor(i/1000); 
		int hundratal = (int) Math.floor(i - tusental*1000)/100;
		int tiotal  = (int) Math.floor(i-(hundratal*100+tusental*1000))/10;
		int heltal = (int) Math.floor(i-(tiotal*10+hundratal*100+tusental*1000));
		System.out.println(heltal);
		System.out.println(tiotal);
		System.out.println(hundratal);
		System.out.println(tusental);
		
		System.out.println("" + heltal +  tiotal + hundratal + tusental); 

		
		

	}

}
