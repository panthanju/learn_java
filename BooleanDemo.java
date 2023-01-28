public class BooleanDemo {

	public static void main(String[] args) {
		boolean isItRaining = false;
		boolean isItTooHot  = false;
		if (isItRaining || isItTooHot) {
			print("Please carry an umbrella");
		} else {
			print("You may skip the umbrella today");
		}
	}

	private static void print(String message) {
		System.out.println(message);
	}
}
