import java.util.Scanner;
	public class modul8_4
	{
		public static void main(String args[])
		{
			System.out.println("MENCETAK BILANGAN GENAP");
			Scanner masuk = new Scanner(System.in);
			int bil1, bil2;
			System.out.print("Masukkan bilangan awal > ");
			bil1 = masuk.nextInt();
			System.out.print("Masukkan bilangan akhir > ");
			bil2 = masuk.nextInt();
			while (bil1<=bil2) {
				if (bil1%2==0)
				System.out.println(bil1);
				bil1++;
		}
	}
}