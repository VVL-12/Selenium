package week2.day1;

public class Mobile {
	
	//what all mobile does makeCall, sendSMS,takePhoto - these are methods
	//naming convention is camelCase and they are verbs
	//one method cannot be created under another method
	
	public void makeCall() {
		System.out.println("Call");
		
		
	}
	
	public void sendSms() {
		System.out.println("Message");
					}
	//without main method the above method cannot be executed there is no run option
		//how to execute the above is by creating an object
	//object is a real one entity
	//for example takePhoto is an action but the real part to perform this action
	//you need camera , camera is the object here
	
	//how to call a method create by using a new keyword
	//syntax ClassName object(any meaning full short name)=new ClassName();
	//object should be created under main method to call other method
	
	public static void main(String[] args) {
	
	System.out.println("It is a main method");
	
	Mobile mobileOptions=new Mobile();
	mobileOptions.makeCall();
	mobileOptions.sendSms();
	
	
	}

}
