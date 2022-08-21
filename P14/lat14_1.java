import java.util.Scanner;
public class lat14_1
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Masukan Jumlah Baris: ");
		int i, j, k;
		int j_baris = input.nextInt();
		for(i=0; i<=j_baris; i++){
			for(j=0; j<=i; j++){
				System.out.print(" ");
			}
			for(k=0; k>=(i-j_baris); k--){
				System.out.print("*");
			}
			for(k=0; k<(j_baris-i); k++){
				System.out.print("*");
			}
			System.out.println(" ");
		}
	}
}