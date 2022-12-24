import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class BEECROWD1015 {
	public static void main(String[] args) throws IOException {
			Locale.setDefault(Locale.US);
			Scanner Leitor = new Scanner(System.in);
	       
	        double x1= Leitor.nextDouble();
	        double y1= Leitor.nextDouble();
	        double x2= Leitor.nextDouble();
	        double y2= Leitor.nextDouble();
	        double distancia= Math.sqrt(Math.pow(x2 -x1,2)+ Math.pow(y2 -y1,2)) ;
	        
	     
	        System.out.printf("%.4f%n", distancia);
	        
	        Leitor.close();
	    }
		
	}
