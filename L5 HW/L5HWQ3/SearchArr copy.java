package l5HWQ3;

public class SearchArr {

	public static int getPositionOfPos(int[] arr) {
		int pos_of_no;
		int count = 0;
		for (int i = 0; i < 5; ++i) {
			int value = arr[i];
			if (value > 0) {
				++count;
				if (count == 2) {
					pos_of_no = i;
					System.out.println("The position of the second positive number is: " + pos_of_no);
					return pos_of_no;
				}
			}
		}
		System.out.println("There is no second positive number in the array");
		return -1;
	}

	public static int[] minimum(int[] arr) {
		int minimum = 0;
		int pos_of_min = 0;
		for (int i = 0; i < 5; ++i) {
			int value = arr[i];
			if (value < minimum || i == 0) {
				minimum = value;
				pos_of_min = i;
			}
		}
		System.out.println("The minimum value is: " + minimum + " it is in position " + pos_of_min);
		int[] results = {minimum, pos_of_min};
		return results;
	}

	public static int getProduct(int[] arr) {
		int product = 1;
		for (int i = 0; i < 5; ++i) {
			if ((arr[i] % 2) == 0) {
				product *= arr[i];
			}
		}
		System.out.println("The product of all the even numbers is: " + product);
		return product;
	}

	public static int[] organize(int[] arr) {
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				int tmp;
				if (arr[i] > arr[j]) {
					if (arr[j] < 0) {
						for (int a : arr) {
							System.out.println(a);
						}
						return arr;
					}
					tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				}
			}
		}
		for (int a : arr) {
			System.out.println(a);
		}
		return arr;
	}

}
