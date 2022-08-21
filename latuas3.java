import java.util.Scanner;
	public class latuas3
	{
		public static void main(String args[])
		{
			Scanner masuk = new Scanner(System.in);
			int i, bil1, bil2;
			bil1 = 1;
			System.out.print("Masukkan batas : ");
			bil2 = masuk.nextInt();
				for (i = bil1;bil1<=bil2; bil1++)
				if(bil1%2==1 && bil1%3==0)
				System.out.print(bil1 + " ");
				System.out.println();
		}
	}
