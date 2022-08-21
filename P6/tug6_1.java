import java.util.Scanner;
class tug6_1 {
	public static void main(String[] args) {
		Scanner masuk=new Scanner(System.in);
		System.out.println("================================================================================");
		System.out.println("			MENGHITUNG LUAS BANGUN DATAR			");
		System.out.println("================================================================================");
		int kode_pilihan;
		System.out.print("Masukkan kode pilihan Anda : ");
		kode_pilihan=masuk.nextInt();
		switch (kode_pilihan) {
			case 1:
			int p, l, hasil;
			p=24;
			l=10;
			hasil=p*l;
			System.out.println("--------------------------------------------------------------------------------");
			System.out.println("	LUAS PERSEGI PANJANG = "+hasil);
			System.out.println("================================================================================");
			break;
			case 2:
				int r;
				float luas;
				r=10;
				luas=3.14f*r*r;
				System.out.println("--------------------------------------------------------------------------------");
				System.out.println("	LUAS LINGKARAN = "+luas);
				System.out.println("================================================================================");
				break;
			default:
				System.out.println("--------------------------------------------------------------------------------");
				System.out.println("	SALAH MASUKAN KODE PILIHAN");
				System.out.println("================================================================================");
				break;
		}
	}
}