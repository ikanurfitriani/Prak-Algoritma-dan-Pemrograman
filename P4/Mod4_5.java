import java.util.Scanner;
public class Mod4_5
{
	public static void main(String args[])
	{
		Scanner masuk=new Scanner(System.in);
		int B,C,D,A;
		System.out.print("Masukkan nilai B = ");
		B=masuk.nextInt();
		System.out.print("Masukkan nilai C = ");
		C=masuk.nextInt();
		System.out.print("Masukkan nilai D = ");
		D=masuk.nextInt();
		A=B+C*D;
		System.out.println("Hasil A = "+A);
	}
}