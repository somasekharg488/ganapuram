package javaprograms;

public class Patren4 {
	public static void main(String[] args) {
		for (int i = 8; i >= 0; i--) {

			for (int j = 2 * (8 - i); j > 0; j--) {
				System.out.print(" ");
			}
			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

		for (int i = 0; i <= 8; i++) {

			for (int j = 2 * (8 - i); j > 0; j--) {
				System.out.print(" ");
			}
			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}

}
