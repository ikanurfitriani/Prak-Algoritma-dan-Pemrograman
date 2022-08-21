import java.util.Scanner;
	public class tug9_2
	{
		public static void main(String args[])
		{
			System.out.println("MENGHASILKAN DERET SUATU BILANGAN");
			Scanner masuk = new Scanner(System.in);
			int n, i, deret;
			System.out.print("Banyaknya data : ");
			deret=0;
			n = masuk.nextInt();
			i=1;
			do {
				deret = i*i;
				System.out.println(deret);
				i++;
				}
			while (i <= n);
		}
	}