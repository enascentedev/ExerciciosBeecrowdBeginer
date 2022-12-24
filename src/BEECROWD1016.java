import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class BEECROWD1016 {

	
		public static void main(String[] args) throws IOException {
			Locale.setDefault(Locale.US);
			Scanner Leitor = new Scanner(System.in);
	       
	        int x= Leitor.nextInt();
	        int resultado= (x*60) /30 ;
	        
	     
	        System.out.println( resultado + "minutos");
	        
	        Leitor.close();
	    }
		
	}
