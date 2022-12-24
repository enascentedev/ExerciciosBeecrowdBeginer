import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class BEECROWD1009 {

	public static void main(String[] args) throws IOException {
		Locale.setDefault(Locale.US);
		Scanner Input = new Scanner(System.in);
			
			String nomeFuncionario = Input.next();
			double valorVenda = Input.nextDouble();
			double salarioInicial = Input.nextDouble();
			double salarioFinal= (salarioInicial + ( valorVenda *0.015 ));
			
			System.out.println("NAME =" + nomeFuncionario );
			System.out.printf("TOTAL = r$ %. 2f%n", salarioFinal );
			Input.close();
		}
	}
