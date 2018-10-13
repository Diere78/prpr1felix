package Looop;

public class Trial2 {

	public static void main(String[] args) {
		System.out.println("Numbers dividable by three");
		for (int i = 3; i < 100; i+=3) {
			System.out.println(i);
		}

		System.out.println("Numbers dividable by five");
		for (int i = 5; i < 100; i +=5) {
			System.out.println(i);
		}
		
		System.out.println("Numbers dividable by three and five");
		for ( int i = 15; i < 100; i+=15){
			System.out.println(i);
			
		}

	}

}
