import java.util.Scanner;
public class uas3
{
	public static void main(String args[])
	{
		Scanner masuk = new Scanner(System.in);
		boolean running = true;
		int Harga, menu, paket, jumlah;
		String jawab;
		jumlah=0;
		Harga=0;
		do {
			System.out.print("Pilih Menu : ");
			menu=masuk.nextInt();
			System.out.print("Pilih paket : ");
			paket=masuk.nextInt();
			if (menu==1)
			{
				if (paket==1)
				Harga=15000;
				if (paket==2)
				Harga=12000;
			}
			else if (menu==2)
			{
				if (paket==1)
				Harga=14000;
				if (paket==2)
				Harga=14500;
			}
			System.out.println("Sub Total : "+Harga);
			jumlah=jumlah+Harga;
			System.out.print("Ingin pesan lagi ? (y/t) : ");
			jawab=masuk.nextLine();
			if(jawab.equalsIgnoreCase("t")){
			running = false;
			}
		}
		while ( running );
		System.out.println("Total Bayar : " +jumlah);
	}
}