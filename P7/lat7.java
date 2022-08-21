import java.util.Scanner;
public class lat7{
	public static void main (String arg[]){
		Scanner in=new Scanner(System.in);
		Scanner masuk=new Scanner(System.in);
		String model, mdel;
		int pil, harga, hrg, Harga, Hrg, price;
		System.out.println("	Harga mobil/motor	");
		System.out.println("===================================================");
		System.out.print("Masukkan pilihan (1=mobil & 2=motor) Anda : ");
		pil=in.nextInt();
		if (pil == 1)
		{
			System.out.print("Masukkan model mobil (jazz/brio/mobilio) : ");
			model=masuk.nextLine();
			harga=170000000;
			hrg=120000000;
			System.out.println("---------------------------------------------------");
			if (model.equals("jazz"))
			System.out.println("Harga Mobil Jazz : Rp "+harga);
			else if (model.equals("brio"))
			System.out.println("Harga Mobil Brio : Rp "+hrg);
			else if (model.equals("mobilio"))
			System.out.println("Harga Mobil Mobilio : Rp "+harga);
			else
			System.out.println("Salah masukkan model mobil");
		} else if (pil == 2)
		{
			System.out.print("Masukkan model motor (vario/beat/vixion) : ");
			mdel=masuk.nextLine();
			Harga=16000000;
			Hrg=14000000;
			price=20000000;
			System.out.println("---------------------------------------------------");
			if (mdel.equals("vario"))
			System.out.println("Harga Motor Vario : Rp "+Harga);
			else if (mdel.equals("beat"))
			System.out.println("Harga Motor Beat : Rp "+Hrg);
			else if (mdel.equals("vixion"))
			System.out.println("Harga Motor Vixion : Rp "+price);
			else
			System.out.println("Salah masukkan model motor");
		}
		else
		{
			System.out.println("Salah masukkan pilihan");
		}
	}
}
