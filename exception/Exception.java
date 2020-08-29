package exception;
import java.util.Scanner;
public class Exception {
	public static void main(String[] args) {
		try {
		Scanner input = new Scanner (System.in);
		int a ,b;
		System.out.print("Enter First number :");
		a = input.nextInt();
		System.out.print("Enter secound number :");
		b = input.nextInt();
		
		
		
		int result =a/b;
		System.out.println("The result is "+result);
		
		}
		catch(ArithmeticException e) {
			System.out.println("Exception:"+e);
			System.out.println();
		}
		try {
			int [] a = new int [5];
			a[5] = 50;
		}catch(ArrayIndexOutOfBoundsException e1) {
			System.out.println("Exception :"+e1);
			System.out.println();
		}
		
		finally {
			System.out.println("           Finish");
			System.out.println("        ............");
			
		}
		
	}

}
