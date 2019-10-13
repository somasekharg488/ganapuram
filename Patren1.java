package javaprograms;

public class Patren1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i=0;i<=8;i++) {
			
			for(int j=2*(8-i);j>0;j--) {
				System.out.print(" ");
			}
			for(int j=0;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
