package week2.day1;

public class Access1 {
	
	public void depositAmount() {  //public because anyone can deposit
		System.out.println("10 lakhs");
	}
	private void withdrawalamount() {  //private because not all can withdraw
		System.out.println("2 lakhs");
	}
	
	public static void main(String [] args) {
		Access1 bankOptions=new Access1();
		bankOptions.depositAmount();
		bankOptions.withdrawalamount();
	}

}

//inside same class public and private access modifier can be done