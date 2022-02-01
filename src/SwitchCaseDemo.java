
public class SwitchCaseDemo {

	public static void main(String[] args) {
		String day="Monday";
		
		switch(day) {
		case "Monday":
			System.out.println("Monday is a working day");
			break;
		case "Tuesday":
			System.out.println("Tuesday is a case day");
			break;
		default:
			System.out.println("Invalid day");
			break;
		}

	}

}
