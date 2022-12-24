import java.util.Scanner;
class BEECROWD1007 {

	public static void main(String[] args) {
		Scanner Input = new Scanner(System.in);
		
		int A = Input.nextInt();
		int B = Input.nextInt();
		int C = Input.nextInt();
		int D = Input.nextInt();
		int DIFERENÇA= (A * B - C * D);
		
		System.out.println("DIFERENÇA =" +DIFERENÇA );
		Input.close();
	}
}
