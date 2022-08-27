import java.util.Scanner;
public class uas1{
	public static void main (String args[]){
		Scanner masuk=new Scanner(System.in);
		float ips;
		int angkatan;
		System.out.print("Masukkan Tahun Angkatan Anda : ");
		angkatan=masuk.nextInt();
		if (angkatan>2014)
		{
			System.out.print("Masukkan IP semester Anda : ");
			ips=masuk.nextFloat();
			int jmlh_sks1=24;
			int jmlh_sks2=21;
			int jmlh_sks3=18;
			int jmlh_sks4=15;
			int jmlh_sks5=12;
			if (ips>=3.00)
			System.out.println("Jumlah SKS : "+jmlh_sks1+" sks");
			else if (ips>=2.50 && ips<=2.99)
			System.out.println("Jumlah SKS : "+jmlh_sks2+" sks");
			else if (ips>=2.00 && ips<=2.49)
			System.out.println("Jumlah SKS : "+jmlh_sks3+" sks");
			else if (ips>=1.50 && ips<=1.99)
			System.out.println("Jumlah SKS : "+jmlh_sks4+" sks");
			else if (ips<=1.49)
			System.out.println("Jumlah SKS : "+jmlh_sks5+" sks");
		} else if (angkatan<=2014)
		{
			int jmlh_sks=24;
			System.out.println("Jumlah SKS : "+jmlh_sks+" sks");
		}
	}
}
