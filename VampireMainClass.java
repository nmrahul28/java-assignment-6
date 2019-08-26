
public class VampireMainClass {

	public static void main(String[] args) {
		Vampirenumber vampire = new Vampirenumber();
		int number = 1001;
		int counter = 0;
		while (counter < 100) {
			if (((int) (Math.log10(number) + 1))%2 == 0) {
				int[] array = vampire.breakNumber(number);
				vampire.permutaionFinder(array, 0, number);
				if (vampire.setFlag) {
					System.out.println(number);
					counter++;
					vampire.setFlag = false;
				}

			}
			number++;
		}


	}

}
