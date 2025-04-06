package week1.day2;

public class IsPrime {
	
public static void main(String[] args) {
	int p=11;
	boolean isPrime = true;
	
	if (p<=1) {
		isPrime = false;   //Numbers less than or equal to 1 are not prime numbers
	}
	else {
	
		for (int i=2; i <= Math.sqrt(p); i++) { //Check divisors up to the square root fo the number
	if (p % i == 0) {
		isPrime = false;
		break; //Exit loopif divisor is found
	}
	}
		}
	if(isPrime) {
		System.out.println(p + "is a prime number.");
	}
	else {
		System.out.println(p + "is not a prime number");
	}
}
}
