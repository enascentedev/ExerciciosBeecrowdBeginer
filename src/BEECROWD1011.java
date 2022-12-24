import java.util.Locale;
import java.util.Scanner;

public class BEECROWD1011 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner Input = new Scanner(System.in);
		
		double PI= 3.14159;
		double Raio= Input.nextDouble();
		double valorFinal= ((4/3) * PI * Math.pow(Raio, 3));
		System.out.printf("VOLUME = R$ %. 3f%n", valorFinal );
		Input.close();
	}
}


/**Scanner scanner = new Scanner(System.in);

int raio = scanner.nextInt();
double pi = 3.14159;
double formula = (4 * pi * Math.pow(raio, 3)) / 3;

System.out.printf("VOLUME = %.3f\n", formula);

}
} */