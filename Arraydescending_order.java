package javaprograms;

public class Arraydescending_order {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = { 7, 5, 6, 8, 3, 4, 9 };
		int temp = 0;
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] > a[j]) {

					temp = a[i];//temp=7
					a[i] = a[j];//a=8
					a[j] = temp;//j=7
				}
			}
			System.out.print(a[i]);

		}

	}

}
