import java.util.Scanner;
public class Contoh13{
	public static void main(String args[])
	{
		Scanner masuk = new Scanner(System.in);
		int bil, i;
		System.out.print("Masukan bilangan = ");
		bil=masuk.nextInt();
		if (bil>20) {
			for (i=bil; i>=1; i--) {
				System.out.print(i + " ");
			}
		}
		else {
			for (i=bil; i<=20; i++) {
				System.out.print(i + " ");
			}
		}
		System.out.println();
	}
}