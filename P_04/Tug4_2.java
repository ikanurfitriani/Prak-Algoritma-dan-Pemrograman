import java.util.Scanner;
public class Tug4_2
{
	public static void main(String args[])
	{
		Scanner masuk=new Scanner(System.in);
		int Celcius;
		float Reamur, Fahrenheit;
		System.out.print("Masukkan derajat Celcius : ");
		Celcius=masuk.nextInt();
		Reamur=4f/5f*Celcius;
		Fahrenheit=9f/5f*Celcius+32f;
		System.out.println("Reamur : "+Reamur);
		System.out.println("Fahrenheit : "+Fahrenheit);
	}
}