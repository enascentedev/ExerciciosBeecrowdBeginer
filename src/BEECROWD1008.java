import java.util.Locale;
import java.util.Scanner;
import java.io.IOException;


public class BEECROWD1008 {

	public static void main(String[] args) throws IOException {
		Locale.setDefault(Locale.US);
	Scanner Input = new Scanner(System.in);
		
		int numeroFuncionario = Input.nextInt();
		int horasTrabalhadas = Input.nextInt();
		double valorHora = Input.nextDouble();
		double salarioFinal= (horasTrabalhadas* valorHora);
		
		System.out.println("NUMBER =" + numeroFuncionario );
		System.out.printf("SALÁRIO = U$ %. 2f%n", salarioFinal );
		Input.close();
	}
}
