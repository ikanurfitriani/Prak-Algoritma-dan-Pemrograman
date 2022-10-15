import java.util.Scanner;
public class Lat4_2
{
	public static void main(String args[])
	{
		Scanner masuk=new Scanner(System.in);
		String NIM, Nama, TempatLahir, TanggalLahir, Usia, NoHP, Email, Jurusan, Alamat;
		System.out.print("Masukkan NIM Anda : ");
		NIM=masuk.nextLine();
		System.out.print("Masukkan nama Anda : ");
		Nama=masuk.nextLine();
		System.out.print("Masukkan tempat lahir Anda : ");
		TempatLahir=masuk.nextLine();
		System.out.print("Masukkan tanggal lahir Anda : ");
		TanggalLahir=masuk.nextLine();
		System.out.print("Masukkan usia Anda : ");
		Usia=masuk.nextLine();
		System.out.print("Masukkan nomor handphone Anda : ");
		NoHP=masuk.nextLine();
		System.out.print("Masukkan E-Mail Anda : ");
		Email=masuk.nextLine();
		System.out.print("Masukkan jurusan Anda : ");
		Jurusan=masuk.nextLine();
		System.out.print("Masukkan alamat Anda : ");
		Alamat=masuk.nextLine();
		System.out.println("====================================");
		System.out.println("          Biodata          ");
		System.out.println("NIM : "+NIM);
		System.out.println("Nama : "+Nama);
		System.out.println("Tempat Lahir : "+TempatLahir);
		System.out.println("Tanggal Lahir : "+TanggalLahir);
		System.out.println("Usia : "+Usia);
		System.out.println("No HP : "+NoHP);
		System.out.println("E-Mail : "+Email);
		System.out.println("Jurusan : "+Jurusan);
		System.out.println("Alamat : "+Alamat);
		System.out.println("===================================");
	}
}