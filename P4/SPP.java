import java.util.Scanner;
public class SPP
{
	public static void main(String args[])
	{
		Scanner masuk=new Scanner(System.in);
		int SPA,SPPVariabel,BiayaKesetaraanNilai;
		float Hasil;
		System.out.print("Berapa SPA Anda : ");
		SPA=masuk.nextInt();
		System.out.print("Berapa SPP Variabel Anda : ");
		SPPVariabel=masuk.nextInt();
		System.out.print("Berapa Biaya Kesetaraan Nilai Anda : ");
		BiayaKesetaraanNilai=masuk.nextInt();
		Hasil=0.3f*SPA+SPPVariabel+BiayaKesetaraanNilai;
		System.out.println("Total biaya SPP Angsuran Anda : "+Hasil);
	}
}
