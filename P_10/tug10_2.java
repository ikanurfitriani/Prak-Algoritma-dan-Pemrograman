import java.util.Scanner;
	public class tug10_2
	{
		public static void main(String args[])
		{
			System.out.println("MENCETAK BILANGAN KELIPATAN 5");
			Scanner masuk = new Scanner(System.in);
			int i, bil1, bil2, jumlah;
			jumlah=0;
			System.out.print("Masukkan bilangan awal : ");
			bil1 = masuk.nextInt();
			System.out.print("Masukkan bilangan akhir : ");
			bil2 = masuk.nextInt();
				for (i = bil1;bil1<=bil2; bil1++)
				if(bil1%5==0)
				{
					jumlah += bil1;
					System.out.print(bil1 + " ");
				}
				System.out.println();
				System.out.println("Jumlah : "+jumlah);
		}
	}