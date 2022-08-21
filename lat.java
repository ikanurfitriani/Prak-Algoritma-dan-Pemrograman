import java.util.Scanner;
	public class lat
	{
		public static void main(String args[])
		{
			System.out.println("MENCETAK BILANGAN GENAP");
			Scanner masuk = new Scanner(System.in);
			int bil;
			bil=1;
			while (bil<=10) {
				if (bil%2==0)
				System.out.println(bil);
				bil++;
		}
	}
}