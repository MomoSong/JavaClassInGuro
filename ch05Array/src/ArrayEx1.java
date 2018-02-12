

import java.util.Arrays;

public class ArrayEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = new int[5];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = i + 1;
		}

		System.out.println(Arrays.toString(arr));

		int[] tmp = new int[arr.length + 1];

		for (int i = 0; i < arr.length; i++) {
			tmp[i] = arr[i];
		}
		arr = tmp;

		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(tmp));
		System.out.println(arr + ", " + tmp);

		System.out.println(arr.length);
		int[] result = new int[arr.length * 2];
		
		System.arraycopy(arr, 0,  result, 0, arr.length);
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(result));

	}

}
