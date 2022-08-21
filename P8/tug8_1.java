import java.util.Scanner;
public class tug8_1 {
	public static void main(String[] args) {
		System.out.println("Mengitung jumlah dan rata-rata bilangan positif");
		Scanner masuk = new Scanner(System.in);
		int ndata, data1, data2, data3, data4;
		float jumlah, rata;
		System.out.print("Banyaknya data : ");
		ndata = masuk.nextInt();
		while (ndata == 4) {
			System.out.print("Data ke-1 : ");
			data1 = masuk.nextInt();
			System.out.print("Data ke-2 : ");
			data2 = masuk.nextInt();
			System.out.print("Data ke-3 : ");
			data3 = masuk.nextInt();
			System.out.print("Data ke-4 : ");
			data4 = masuk.nextInt();
			jumlah = data1+data2+data3+data4;
			rata = jumlah/ndata;
			System.out.println("Rata-rata : " + rata);
			System.out.println("Jumlah : " + jumlah);
			ndata++;
		}
	}
}