import java.util.Scanner;
public class mod14_2
{
	public static void main(String args[])
	{
		Scanner masuk = new Scanner(System.in);
		float r1, r2, r3, r;
		System.out.print("Masukkan R1 = ");
		r1 = masuk.nextFloat();
		System.out.print("Masukkan R2 = ");
		r2 = masuk.nextFloat();
		System.out.print("Masukkan R3 = ");
		r3 = masuk.nextFloat();
		r = 1/((1/r1)+(1/r2)+(1/r3));
		System.out.println("Nilai R = "+r);
	}
}