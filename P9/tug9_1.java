import java.util.Scanner;
public class tug9_1
{
	public static void main(String[] args)
	{
		System.out.println("Mengitung jumlah dan rata-rata bilangan positif");
		Scanner masuk = new Scanner(System.in);
		int data;
		float n, jumlah, x, ratarata;
		System.out.print("Banyaknya data : ");
		n = masuk.nextFloat();
		jumlah=0;
		data=1;
		do {
			System.out.print("Data ke-" + data + " : ");
			x = masuk.nextFloat();
			jumlah=jumlah+x;
			ratarata=jumlah/n;
			data++;
		}
		while (data<=n); {
			System.out.println("Rata-rata : " + ratarata);
			System.out.println("Jumlah : " + jumlah);
		}
	}
}