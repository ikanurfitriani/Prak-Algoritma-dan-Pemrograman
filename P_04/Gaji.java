import java.util.Scanner;
public class Gaji
{
	public static void main(String args[])
	{
		Scanner masuk=new Scanner(System.in);
		int GajiPokok,Tunjangan;
		float Hasil;
		System.out.print("Berapa gaji pokok anda : ");
		GajiPokok=masuk.nextInt();
		System.out.print("Berapa tunjangan anda : ");
		Tunjangan=masuk.nextInt();
		Hasil=GajiPokok+Tunjangan+0.2f*GajiPokok;
		System.out.println("Total gaji yang diperoleh = "+Hasil);
	}
}