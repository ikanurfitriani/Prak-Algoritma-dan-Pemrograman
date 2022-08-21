import java.util.Scanner;
public class mod14_4
{
	public static void main(String[] args)
	{
		System.out.println("MENGHITUNG NILAI RATA-RATA");
		Scanner masuk = new Scanner(System.in);
		int data;
		float n, jumlah, x, ratarata;
		System.out.print("Masukkan banyaknya data : ");
		n = masuk.nextFloat();
		jumlah=0;
		data=1;
		do {
			System.out.print("Masukkan Bilangan Ke-" + data + " : ");
			x = masuk.nextFloat();
			jumlah=jumlah+x;
			ratarata=jumlah/n;
			data++;
		}
		while (data<=n); {
			System.out.println("Rata-rata bilangan tersebut : " + ratarata);
		}
	}
}