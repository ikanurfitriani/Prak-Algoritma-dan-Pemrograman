import java.util.Scanner;
public class latuas1 {
	public static void main (String arg[]){
		Scanner masuk=new Scanner(System.in);
		String nama;
		int jmlh_thn, harga_sw, jmlh_dskn, jmlh_bayar;
		harga_sw=10000000;
		System.out.print("Nama : ");
		nama=masuk.next();
		System.out.print("Jumlah tahun : ");
		jmlh_thn=masuk.nextInt();
		System.out.println("Nama : "+nama);
		if (jmlh_thn >= 3)
		{
			int diskon=20;
			jmlh_dskn=harga_sw*jmlh_thn*diskon/100;
			jmlh_bayar=harga_sw*jmlh_thn-jmlh_dskn;
			System.out.println("Prosen diskon : "+diskon);
			System.out.println("Jumlah Diskon : Rp "+jmlh_dskn);
			System.out.println("Jumlah Pembayaran : Rp "+jmlh_bayar);
		} else if (jmlh_thn==2) {
			int diskon=10;
			jmlh_dskn=harga_sw*jmlh_thn*diskon/100;
			jmlh_bayar=harga_sw*jmlh_thn-jmlh_dskn;
			System.out.println("Prosen diskon : "+diskon);
			System.out.println("Jumlah Diskon : Rp "+jmlh_dskn);
			System.out.println("Jumlah Pembayaran : Rp "+jmlh_bayar);
		} else if (jmlh_thn==1) {
			int diskon=0;
			jmlh_dskn=harga_sw*jmlh_thn*diskon/100;
			jmlh_bayar=harga_sw*jmlh_thn-jmlh_dskn;
			System.out.println("Prosen diskon : "+diskon+" atau Tidak Ada Diskon");
			System.out.println("Jumlah Diskon : Rp "+jmlh_dskn);
			System.out.println("Jumlah Pembayaran : Rp "+jmlh_bayar);
		}
	}
}