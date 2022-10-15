import java.util.Scanner;
class kuis {
	public static void main(String[] args) {
		Scanner masuk=new Scanner(System.in);
		System.out.println("			MENGHITUNG TOTAL BIAYA SKS VARIABEL			");
		int angkatan;
		System.out.print("Masukkan Tahun Angkatan Anda : ");
		angkatan=masuk.nextInt();
		if (angkatan <= 2013) {
			int teori, praktik, praktikum, hasil;
			System.out.print("Masukkan Jumlah SKS Teori = ");
			teori=masuk.nextInt();
			System.out.print("Masukkan Jumlah SKS Praktik = ");
			praktik=masuk.nextInt();
			System.out.print("Masukkan Jumlah SKS Praktikum = ");
			praktikum=masuk.nextInt();
			hasil=50000*teori+75000*praktik+100000*praktikum;
			System.out.println("--------------------------------------------------------------------------------");
			System.out.println("	Total Biaya SKS Variabel Anda adalah "+hasil);
			System.out.println("================================================================================");
		} else if (angkatan > 2013) {
			int teori, praktik, praktikum, hasil;
			System.out.print("Masukkan Jumlah SKS Teori = ");
			teori=masuk.nextInt();
			System.out.print("Masukkan Jumlah SKS Praktik = ");
			praktik=masuk.nextInt();
			System.out.print("Masukkan Jumlah SKS Praktikum = ");
			praktikum=masuk.nextInt();
			hasil=75000*teori+100000*praktik+125000*praktikum;
			System.out.println("--------------------------------------------------------------------------------");
			System.out.println("	Total Biaya SKS Variabel Anda adalah "+hasil);
			System.out.println("================================================================================");
		}
	}
}