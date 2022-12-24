import java.io.IOException;
import java.util.Scanner;

public class BEECROWD1017 {
	 public static void main(String[] args) throws IOException {
	        Scanner Leitor = new Scanner(System.in);
	        int tempo = Leitor.nextInt();
	        int velocidade = Leitor.nextInt();
	        double kilometros = tempo * velocidade;
	        double media = kilometros / 12;
	        System.out.println(String.format("%.3f", media)); 
	    }
		
	}

