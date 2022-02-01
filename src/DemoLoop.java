
public class DemoLoop {

	public static void main(String[] args) {
//		for loop
		int counter = 1;
		for(counter = 1; counter <= 10; counter = counter+2) {
			System.out.println(counter);
		}
//		while loop
		int num = 1;
		while(num<=5) {
			System.out.println(num);
			num++;
		}
//		do-while loop
		int noOfAttempts = 10;
		do {
			System.out.println("You have attempts remaining : " + noOfAttempts);
			noOfAttempts++;
		}while(noOfAttempts>20);

	}

}
