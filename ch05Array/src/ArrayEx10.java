import java.util.Arrays;

public class ArrayEx10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numArr = new int[10];

		for (int i = 0; i < numArr.length; i++) {
			numArr[i] = (int) (Math.random() * 30);
		}

		System.out.println("Random Array : " + Arrays.toString(numArr));
		// Bubble sort
		System.out.println("After Bubble sort : " + Arrays.toString(bubbleSort(numArr)));
		// Randomly arrange
		System.out.println("Random again : " + Arrays.toString(randomly(numArr)));
	}

	// make Array Random
	public static int[] randomly(int[] numArr) {
		int rand = 0;
		int temp = 0;
		for (int i = 0; i < numArr.length; i++) {
			rand = (int) (Math.random() * numArr.length);
			temp = numArr[0];
			numArr[0] = numArr[rand];
			numArr[rand] = temp;
		}
		return numArr;
	}

	// Bubble Sort
	public static int[] bubbleSort(int[] numArr) {
		boolean flag = false;
		for (int i = 0; i < numArr.length - 1; i++) {
			flag = false;

			for (int j = 0; j < numArr.length - i - 1; j++) {
				if (numArr[j] > numArr[j + 1]) {
					int temp = numArr[j];
					numArr[j] = numArr[j + 1];
					numArr[j + 1] = temp;
					flag = true;
				}
			}
			if (!flag)
				break;
		}
		return numArr;

	}
}
