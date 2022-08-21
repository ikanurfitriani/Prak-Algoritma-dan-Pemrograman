import java.util.Scanner;
public class lat9_1
{
	public static void main(String args[])
	{
		Scanner masuk = new Scanner(System.in);
				int bil;
				float hasil;
				System.out.println("Konversi suhu Celcius ke Fahrenheit dari 20 sampai 30");
				bil=20;
				do {
					hasil=bil*9f/5f;
					System.out.println(hasil);
					bil++;
				}
				while (bil<=30);
	}
}