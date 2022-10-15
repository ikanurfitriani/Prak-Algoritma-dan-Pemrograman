import java.util.Scanner;
public class Tug4_1
{
	public static void main(String args[])
	{
		Scanner masuk=new Scanner(System.in);
		int GajiPokok;
		float TunjanganKinerja, TunjanganLain, Hasil;
		System.out.print("Masukkan gaji pokok Anda = ");
		GajiPokok=masuk.nextInt();
		TunjanganKinerja=0.2f*GajiPokok;
		TunjanganLain=0.1f*TunjanganKinerja;
		Hasil=GajiPokok+TunjanganKinerja+TunjanganLain;
		System.out.println("Total gaji Anda = "+Hasil);
	}
}
