import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class BEECROWD1014 {

	public static void main(String[] args) throws IOException {
		Locale.setDefault(Locale.US);
		Scanner Leitor = new Scanner(System.in);
        int x = Leitor.nextInt();
        double y= Leitor.nextDouble();
        double consumo= x/y;
        
     
        System.out.printf("%.3f km/l%n", consumo);
        
        Leitor.close();
    }
	
}
