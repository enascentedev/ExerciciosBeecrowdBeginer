import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class BEECROWD1010 {

	public static void main(String[] args) throws IOException {
		Locale.setDefault(Locale.US);
		Scanner Input = new Scanner(System.in);
			
			String nomeFuncionario = Input.next();
			int codigoPeca1 = Input.nextInt();
			int numeroPeca1 = Input.nextInt();
			double valorPeca1 = Input.nextDouble();
			int codigoPeca2 = Input.nextInt();
			int numeroPeca2 = Input.nextInt();
			double valorPeca2 = Input.nextDouble();
			double valorFinal= (( numeroPeca2 *valorPeca2 )+ ( numeroPeca1 *valorPeca1 ));
			
			
			System.out.printf("VALOR A PAGAR = R$ %. 2f%n", valorFinal );
			Input.close();
		}
	}
