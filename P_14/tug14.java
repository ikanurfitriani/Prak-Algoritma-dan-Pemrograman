import java.util.Scanner;
import static java.lang.Math.sqrt;
public class tug14 {
	public static void main(String[] args) {
		Scanner masuk = new Scanner(System.in);
		float a, b, c, d;
		double x1, x2;
		System.out.print("Masukkan nilai a : ");
		a=masuk.nextFloat();
		System.out.print("Masukkan nilai b : ");
		b=masuk.nextFloat();
		System.out.print("Masukkan nilai c : ");
		c=masuk.nextFloat();
		d=b*b-4*a*c;
		System.out.println("\n Determinan = "+d);
		System.out.print("Akar persamaan kuadrat : ");
		if (d>0) {
			x1=((-b)+sqrt(d))/(2*a);
			x2=((-b)-sqrt(d))/(2*a);
			System.out.println("\n X1 = " + x1 + " dan X2 = " + x2);
			System.out.println("Kedua nilai X merupakan bilangan real");
		} else if (d==0) {
			x1=(-b)/(2*a);
			x2=x1;
			System.out.println("\n X1 = " + x1 + " dan X2 = " + x2);
			System.out.println("Kedua nilai X merupakan bilangan kembar");
		} else if (d<0) {
			System.out.println("Kedua nilai X merupakan bilangan kompleks/imajiner");
		}
	}
}