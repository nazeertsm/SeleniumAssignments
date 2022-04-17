package week1.day2;

public class LearnMethods {

	String printCarName() {
		return "Maruthi";

	}

	int getCarRegNumber() {
		int carRegNumber = 5142;
		return carRegNumber;
	}

	String getCarVarient() {
		return "Diesel";

	}

	int multiplyTwoNumbers(int a, int b) {
		return a * b;

	}

	public static void main(String[] args) {
		LearnMethods obj = new LearnMethods();

		String carName = obj.printCarName();
		System.out.println("carName"+ carName);

		int carRegNumber = obj.getCarRegNumber();
		System.out.println("carRegNumber"+ carRegNumber);

		String carVarient = obj.getCarVarient();
		System.out.println("carVarient"+carVarient);

		int result = obj.multiplyTwoNumbers(2, 5);
		System.out.println("multiplyTwoNumbers"+ result);

	}

}
