
public class ALGOS {
	public static void main(String[] args) {
		
		for(int i = 1;i <=155;i++) {
			if(i%5==0 && i%3==0) {
				System.out.println("FizzBuzz");
			}
			else if(i%3==0) {
				System.out.println("Fizz");
			}
			else if(i%5==0) {
				System.out.println("Buzz");
			}else {
				System.out.println(i);
			}
			
		}

	}
}
