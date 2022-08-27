import java.util.Scanner;
public class latuas2
{
	public static void main(String args[])
	{
		Scanner masuk = new Scanner(System.in);
		int Harga, jumlah;
		boolean running = true;
		String x, n, jawab;
		jumlah=0;
		Harga=0;
		do {
			System.out.print("Pilih Jenis : ");
			x=masuk.nextLine();
			System.out.print("Pilih paket : ");
			n=masuk.nextLine();
			if (x.equals("Masak"))
			{
				if (n.equals("A"))
				Harga=500000;
				if (n.equals("B"))
				Harga=650000;
			} else if (x.equals("Jahit"))
			{
				if (n.equals("A"))
				Harga=450000;
				if (n.equals("B"))
				Harga=600000;
			} else if (x.equals("MakeUp"))
			{
				if (n.equals("A"))
				Harga=400000;
				if (n.equals("B"))
				Harga=550000;
			}
			jumlah=jumlah+Harga;
			System.out.print("Ingin kursus jenis lain ? (y/t) : ");
			jawab=masuk.nextLine();
			if(jawab.equalsIgnoreCase("t") ){
			running = false;
			}
		}
		while ( running );
		System.out.println("Total Bayar : " +jumlah);
	}
}