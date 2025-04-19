package week1.day2;

public class LearnOperators {
	public static void main(String[] args) {
		int a=10;
		String name="V";
				
		int b=7;
		int c=2;
		
		System.out.println(b+c);  //arithmetic add
		
		System.out.println(a-b);  //subtraction
		
		System.out.println(b*c);  //multiplication
		
		System.out.println(a/c);  //division
		
		System.out.println(b%c);  //to get reminder
		
		//comparison operator
		
		int s=15;
		int t=20;
		
		System.out.println(s==t);
		System.out.println("-----");
		System.out.println(s<t);
		System.out.println("======");
		System.out.println(s>t);
		
		System.out.println("######");
		
		//condition operator
		
		int x=5;
		int y=15;
		
		System.out.println(x==y&&x>y); //and
		System.out.println(x==y||x<y);  //or use ||
		
		System.out.println("--------");
		
		
		
		//increment - postincrement - increase the value by 1
		int p=7;
		System.out.println(p++);
		System.out.println(p);
		
		//decrement - postdecrement - decrease the value by 1
		System.out.println(p--);
		System.out.println(p);
		
		
	}

}
