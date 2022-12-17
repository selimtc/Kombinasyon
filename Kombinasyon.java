/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
		
    	Scanner inp = new Scanner(System.in);

    	System.out.println("Kombinasyonu İçin Sayı girin : ");

    	int n = inp.nextInt();
    	while (n < 1){
    		System.out.println(" Geçerli  Sayı Girin.");
    		n = inp.nextInt();
    	}
    	System.out.print("R : ");
    	int r = inp.nextInt();
    	while (r < 1){
    		System.out.println("Lütfen Geçerli Bir Sayı Girin.");
    		System.out.print("R : ");
    		r = inp.nextInt();
    	}
    	long combinationResult = calculateFactorial(n) / (calculateFactorial(r) * calculateFactorial(n - r));
    	System.out.println("Sonuç : " + combinationResult);

    }

    static long calculateFactorial(int enteredNumber) {
    	long result = 1;
    	for (int i = 1 ; i <= enteredNumber ; i++) {
    		result *= i;
    	}
    	return result;    
    }
}