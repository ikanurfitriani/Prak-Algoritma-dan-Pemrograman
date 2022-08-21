import java.util.Scanner;
	public class uas2
	{
		public static void main(String args[])
		{
			Scanner masuk = new Scanner(System.in);
			int i, bil1, batas;
			bil1 = 1;
			System.out.print("Masukkan batas : ");
			batas = masuk.nextInt();
				System.out.print("Deret : ");
				for (i = bil1;bil1<=batas; bil1++)
				if(bil1%2==0 && bil1%4==0)
				System.out.print(bil1 + " ");
				System.out.println();
		}
	}
