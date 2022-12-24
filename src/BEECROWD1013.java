import java.io.IOException;
import java.util.Scanner;

public class BEECROWD1013 {

	
		public static void main(String[] args) throws IOException {
			
			Scanner Leitor = new Scanner(System.in);
	        int a = Leitor.nextInt();
	        int b = Leitor.nextInt();
	        int c = Leitor.nextInt();
	        int AB= ((a+b)+ Math.abs(a-b))/2;
	        int ABC= ((AB+c)+ Math.abs(AB-c))/2;
	        System.out.println(ABC + " eh o maior");
	        
	    }
		
	}
