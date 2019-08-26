
public class Vampirenumber {
	Boolean setFlag = false;
	//breaking the number into individual number and storing in an array.
	public int[] breakNumber(int inputNumber) {
		int remainder= 0;
		int index=0;
		int length = (int) (Math.log10(inputNumber) + 1);
		int array[] = new int[length];
		while (inputNumber != 0) {
			remainder = inputNumber % 10;
			array[index] = remainder;
			inputNumber = inputNumber / 10;
			index++;
		}
		return array;
	}
	//divides the given array into two equal half and checks whether the multiplication of both the numbers is equal to the inputNumber or not.
	//simply says whether the number is vampire number or not
	Boolean checkVampire(int[] arr, int inputNumber) {
		int firstPart = 0;
		int secondPart = 0;
		for (int index = 0; index < (arr.length) / 2; index++) {
			firstPart += arr[index] * Math.pow(10, (arr.length) / 2 - index - 1);
		}
		for (int index = (arr.length) / 2; index < arr.length; index++) {
			secondPart += arr[index] * Math.pow(10, (arr.length - index - 1));
		}
		if (firstPart * secondPart == inputNumber) {
			return true;
		}
		return false;
	}
	//finds all the permutations of the given input array and returns to the checkvampire method.
	void permutaionFinder(int[] arr, int index, int inputNumber) {
		if (index >= arr.length - 1) {
			if (this.checkVampire(arr, inputNumber)) {
				//if it is vampire number this flag will set to true.
				setFlag = true;
			}
		}
		for (int i = index; i < arr.length; i++) { 
			int t = arr[index];
			arr[index] = arr[i];
			arr[i] = t;
			permutaionFinder(arr, index + 1, inputNumber);
			t = arr[index];
			arr[index] = arr[i];
			arr[i] = t;
		}
	}
}
