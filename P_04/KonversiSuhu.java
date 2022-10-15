import java.util.Scanner;
public class KonversiSuhu
{
	public static void main(String args [])
	{
		Scanner masuk=new Scanner(System.in);
		int celcius,kelvin;
		float fahrenheit,reamur;
		System.out.print("Masukkan derajat Celcius : ");
		celcius=masuk.nextInt();
		fahrenheit=9f/5f*celcius+32f;
		reamur=4f/5f*celcius;
		kelvin=celcius+273;
		System.out.println("Fahrenheit = "+fahrenheit);
		System.out.println("Reamur = "+reamur);
		System.out.println("Kelvin = "+kelvin);
	}
}