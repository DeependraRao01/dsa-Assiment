package recursion3;
import java.util.*;

public class gcd{
	public static void main(String[] args){  
	int a, b, gcd = 0;  
	Scanner sc = new Scanner(System.in);  
	System.out.print("Enter the First Number: ");  
	a = sc.nextInt();     
	System.out.print("Enter the 2nd Number: ");  
	b = sc.nextInt();  
	gcd = findgcd(a, b);  
	System.out.println("gcd of " + a + " and " + b + " =  " + gcd);  
}  
	public static int findgcd(int a, int b){  
		while(b != 0){  
			if(a > b){  
				a = a - b;  
			}  
			else{  
				b = b - a;  
			}  
		}  
		return a;  
	}  
}  