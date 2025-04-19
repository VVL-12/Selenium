package week2.day1;

public class GooglePixel {

		// creating method with arguments
	//eg take photo u can put object name and press crl space
	//declare variable in class level means this variable can be used in all the methods
	int noOfPhoto=10;
	
	public void takePhoto() {
		//when declaring variable inside a method it is a local variable applicable to this object only
		int noOfPhoto=7;
	System.out.println(noOfPhoto);
		
	}
	public static void main(String[] args) {
	GooglePixel pixelOptions=new GooglePixel();
	pixelOptions.takePhoto();
	}
	
	}


