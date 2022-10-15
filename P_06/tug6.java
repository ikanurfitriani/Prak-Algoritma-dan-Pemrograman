import java.util.Scanner;
class tug6 {
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
			System.out.println("--------------------------------------------------------------------------------");
			System.out.println("Menghitung luas persegi panjang");
			int p, l, hasil;
			System.out.print("Masukkan panjang sisinya = ");
			p=masuk.nextInt();
			System.out.print("Masukkan lebar sisinya = ");
			l=masuk.nextInt();
			hasil=p*l;
			System.out.println("--------------------------------------------------------------------------------");
			System.out.println("	LUAS PERSEGI PANJANG TERSEBUT ADALAH "+hasil);
			System.out.println("================================================================================");
			break;
			case 2:
				System.out.println("--------------------------------------------------------------------------------");
				System.out.println("Menghitung luas lingkaran");
				int r;
				float luas;
				System.out.print("Masukkan jari-jarinya = ");
				r=masuk.nextInt();
				luas=3.14f*r*r;
				System.out.println("--------------------------------------------------------------------------------");
				System.out.println("	LUAS LINGKARAN TERSEBUT ADALAH "+luas);
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











