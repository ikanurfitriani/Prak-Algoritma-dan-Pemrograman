import java.util.Scanner;
public class lat9_2
{
	public static void main(String args[])
	{
		Scanner masuk = new Scanner(System.in);
				boolean running = true;
				String jawab;
				do {
					System.out.println("STMIK AKAKOM");
					System.out.print("Tampilkan tulisan lagi [ya/tidak]> ");
					jawab=masuk.nextLine();
					if(jawab.equalsIgnoreCase("tidak") ){
						running = false;
					}
				}
				while ( running );
	}
}