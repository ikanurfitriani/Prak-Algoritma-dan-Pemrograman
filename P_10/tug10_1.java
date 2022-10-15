public class tug10_1
{
	public static void main (String args[])
	{
		int i, bil, jumlah;
		i=20;
		jumlah=0;
		for (bil=0;bil<i;bil++)
		{
			jumlah += bil;
			System.out.print(bil + " ");
		}
			System.out.println();
			System.out.println("Jumlah : "+jumlah);
	}
}