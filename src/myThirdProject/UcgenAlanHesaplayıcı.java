package myThirdProject;
import java.util.Scanner;

public class UcgenAlanHesaplayıcı {
	public static void main(String[]args) {
		
	Scanner input=new Scanner(System.in);
		System.out.print("Lütfen üçgenin ilk kenar uzunluğunu giriniz:");
		double a=input.nextDouble();
		System.out.print("Lütfen üçgenin ikinci kenar uzunluğunu  giriniz:");
		double b=input.nextDouble();
		System.out.print("Lütfen üçgenin son kenar uzunluğunu giriniz:");
		double c=input.nextDouble();
		double u=(a+b+c)/2;
		double ucgenAlani=Math.sqrt(u*(u-a)*(u-b)*(u-c));
		System.out.println("Kenarlarını girmiş olduğunuz üçgenin alanı: "+ucgenAlani);
		
		
	}

}
