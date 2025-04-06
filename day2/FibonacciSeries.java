package week1.day2;

public class FibonacciSeries {

	public static void main(String[] args) {
		//strart number = 1 to range 8
 int range = 8; //define the range
 int num1 = 0, num2 = 1;  //starting numbers of the Fibonacci sequence
 
 System.out.println("Fibonacci series up to " + range + ";");
 for(int i = 1; i <= range; i++) {
	 System.out.println(num1 + "");  //print the current number
		
	 int nextNum = num1 + num2;
	 num1 = num2;
	 num2 = nextNum;
		}
		
		
	}
}
   