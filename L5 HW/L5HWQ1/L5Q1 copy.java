package l5HW;

class Calc {

	public static int giveDays(int month) {
		if (month > 12 || month < 1) {
			System.out.println("Invalid input, ensure entered number is between 1 and 12");
			return 0;
		} else {
		int months[] = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		return months[month - 1];
		}
	}

}
