import java.util.Random;
import java.util.Scanner;
public class for_if5{
	public static void main (String arg[]){
		String prinsip;
		int i, pil, acak;
		Scanner masuk=new Scanner(System.in);
		Random rd=new Random();
		System.out.println("	M e n u");
		System.out.println("1. Bilangan Random");
		System.out.println("2. Semboyan Hidup");
		System.out.print("Masukkan pilihan anda = ");
		pil=masuk.nextInt();
		if (pil == 1){
			System.out.println(" angka keberuntunganmu adalah =");
			for(i=1; i<=3; i++){
				acak = rd.nextInt(20);
				System.out.println(acak);
			}
		}
		else {
			System.out.print("Masukan prinsip hidup anda = ");
			prinsip=masuk.next();
			System.out.println("Prinsipmu adalah : " +prinsip);
		}
	}
}