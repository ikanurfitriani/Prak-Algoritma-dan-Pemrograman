import java.util.Scanner;
public class tug7 {
public static void main (String srg[]){
	Scanner in=new Scanner(System.in);
	Scanner masuk=new Scanner(System.in);
	String jenj, jurs;
	System.out.println("	Besaran SPA yang Harus Dibayar	");
	System.out.println("====================================================");
	System.out.print("Masukkan jenjang (S1/D3) : ");
	jenj=in.next();
	switch(jenj)
	{
		case "S1":
			System.out.print("Masukkan Jurusan (TI/SI) Anda : ");
			jurs=masuk.next();
			System.out.println("----------------------------------------------------");
			switch(jurs)
			{
				case "TI":
				  int spa=13000000;
				  System.out.println("Besaran SPA yang harus Anda bayar adalah Rp "+spa);
				  break;
				case "SI":
				  int Spa=12000000;
				  System.out.println("Besaran SPA yang harus Anda bayar adalah Rp "+Spa);
				  break;
				default :
					System.out.println("Salah masukkan jurusan");
			}
		   break;
		   case "D3":
			System.out.print("Masukkan Jurusan (TK/KA/MI) Anda : ");
			jurs=in.next();
			System.out.println("----------------------------------------------------");
			switch(jurs)
			{
				case "TK":
				  int SPa=10000000;
				  System.out.println("Besaran SPA yang harus Anda bayar adalah Rp "+SPa);
				  break;
				  case "KA":
				    int SPA=10000000;
				    System.out.println("Besaran SPA yang harus Anda bayar adalah Rp "+SPA);
				    break;
				  case "MI":
				    int besarSPA=10000000;
				    System.out.println("Besaran SPA yang harus Anda bayar adalah Rp "+besarSPA);
				    break;
				  default :
				  		System.out.println("Salah masukkan jurusan");
			}
		  break;
		  default :
		  	System.out.println("----------------------------------------------------");
		    System.out.println("Salah masukkan jenjang");
		}
	}
}