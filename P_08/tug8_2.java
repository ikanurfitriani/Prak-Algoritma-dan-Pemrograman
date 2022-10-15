import java.util.Scanner;
	public class tug8_2
	{
		public static void main(String args[])
		{
			System.out.println("MENGHASILKAN DERET SUATU BILANGAN");
			Scanner masuk = new Scanner(System.in);
			int data, i, deret;
			System.out.print("Banyaknya data : ");
			deret=0;
			data = masuk.nextInt();
			i=1;
			while (i <= data) {
				deret = i*i;
				i++;
				System.out.print(deret + " ");
		}
		System.out.println();
	}
}