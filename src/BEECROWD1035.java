import java.io.IOException;
import java.util.Scanner;
public class BEECROWD1035 {

	 public static void main(String[] args) throws IOException {
	        Scanner Leitor = new Scanner(System.in);
	        int a = Leitor.nextInt();
	        int b = Leitor.nextInt();
	        int c = Leitor.nextInt();
	        int d = Leitor.nextInt();
	        if (b > c && d > a && c > 0 && d > 0 && (c + d) > (a + b) && a % 2 == 0) {
	            System.out.println("Valores aceitos"); 
	        } else { 
	            System.out.println("Valores nao aceitos");
	        }
	        
	    }
	    
	}
