import java.util.Scanner;
public class mod14_3
{
	public static void main(String args[])
	{
		Scanner masuk = new Scanner(System.in);
		float bil1, bil2, bil3, bil4, bil5, hasil;
		System.out.print("Masukkan Bilangan Ke-1 = ");
		bil1 = masuk.nextFloat();
		System.out.print("Masukkan Bilangan Ke-2 = ");
		bil2 = masuk.nextFloat();
		System.out.print("Masukkan Bilangan Ke-3 = ");
		bil3 = masuk.nextFloat();
		System.out.print("Masukkan Bilangan Ke-4 = ");
		bil4 = masuk.nextFloat();
		System.out.print("Masukkan Bilangan Ke-5 = ");
		bil5 = masuk.nextFloat();
		hasil = (bil1+bil2+bil3+bil4+bil5)/5;
		System.out.println("Rata-rata dari 5 bilangan tersebut = "+hasil);
	}
}