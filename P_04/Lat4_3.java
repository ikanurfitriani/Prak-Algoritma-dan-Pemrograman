import java.util.Scanner;
public class Lat4_3
{
	public static void main(String args[])
	{
		Scanner masuk=new Scanner(System.in);
		int r;
		float Luas;
		System.out.print("Masukkan r = ");
		r=masuk.nextInt();
		Luas=3.14f*r*r;
		System.out.println("Luas lingkaran = "+Luas);
	}
}
