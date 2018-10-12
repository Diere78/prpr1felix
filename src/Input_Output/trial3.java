package Input_Output;
import java.util.Scanner;

public class trial3 {

	public static void main(String[] args) {
		Scanner inputScanner = new Scanner(System.in);
		
		System.out.println("Enter nr: ");		
		int nr1 = inputScanner.nextInt();
        
		for (int i = 1 ; i <= 10; i++){
			System.out.println("" + nr1 +" * "+ i + " = " + nr1 * i);
			
		}

	}

}
