import java.util.Scanner;
public class modul9_4
{
	public static void main(String args[])
	{
		Scanner masuk = new Scanner(System.in);
				int bil, n;
				bil=1;
				System.out.print("Masukkan banyak tulisan : ");
				n=masuk.nextInt();
				do {
					System.out.println("STMIK AKAKOM");
					bil++;
				}
				while (bil<=n);
	}
}