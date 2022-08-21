import java.util.Scanner;
public class contoh {
	public static void main(String[] args) {
		Scanner masuk = new Scanner(System.in);
		int bil, i , tambah;
		System.out.print("Masukkan bilangan : ");
		tambah=0;
		bil=masuk.nextInt();
		i=5;
		while (i <= bil) {
			tambah = i+i;
			i++;
			System.out.println(tambah);
		}
	}
}