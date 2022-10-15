import java.util.Scanner;
public class UlangDo
{
	public static void main(String args[])
	{
		Scanner masuk = new Scanner(System.in);
				int bil;
				bil=5;
				do {
					System.out.println(bil);
					bil -= 1;
				}
				while (bil>=1);
	}
}