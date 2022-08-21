import java.util.Scanner;
public class tug8_1rvs {
	public static void main(String[] args) {
		System.out.println("Mengitung jumlah dan rata-rata bilangan positif");
		Scanner masuk = new Scanner(System.in);
		int data;
		float ndata, jumlah, x, rata;
		System.out.print("Banyaknya data : ");
		ndata = masuk.nextFloat();
		jumlah=0;
		data=1;
		while (data<=ndata) {
			System.out.print("Data ke-" + data + " : ");
			x = masuk.nextFloat();
			jumlah += x;
			data++;
		}
			System.out.println("Rata-rata : " + jumlah/ndata);
			System.out.println("Jumlah : " + jumlah);
	}
}