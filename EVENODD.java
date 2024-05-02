
public class EVENODD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = { 1, 3, 5, 2, 4, 6, 11, 12, 15, 16 };
		System.out.println("even no.s in an array....");
		for (int i = 0; i < a.length; i++) {
			if (a[i] % 2 == 0) {
				System.out.println(a[i]);
			}

		}

		System.out.println("odd no.s in an array....");
		for (int i = 0; i < a.length; i++) {
			if (a[i] % 2 != 0) {
				System.out.println(a[i]);
			}
		}
	}
}
