public class lat14
{
	public static void main(String[] args)
	{
		int i, j, k, j_baris;
		j_baris=4;
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