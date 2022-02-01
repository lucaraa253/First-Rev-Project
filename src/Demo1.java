
public class Demo1 {

	int marks=95;
	public void display() {
		if(marks > 60) {
			System.out.println("Congrats, you cleared the test");
			System.out.println("Your score is : " + marks);
		}else{
			System.out.println("No worries, take the test again");
		}
	}
	public static void main(String[] args) {
		Demo1 d = new Demo1();
		d.display();

	}

}
