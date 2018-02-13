
public class VarArgsEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// +/- 처리를 위한 프로그램 작성. 입력되는 데이터는 정해져 있지 않다.
		// + : 맨앞에 숫자에 뒤에 나오는 숫자를 모두 더한다.
		// - : 맨앞에 숫자에서 뒤에 나오는 숫자들을 모두 뺀다.
		
		System.out.println(process("+", 100, 10, 20));
		System.out.println(process("-", 100, 10, 20));
	}

	public static int process(String op, int... nums) {
		int res = 0;
		res = nums[0];
		if (op.equals("+")) {
			for (int i = 1; i < nums.length; i++) {
				res += nums[i];
				
			}
		}else if(op.equals("-")) {
			for (int i = 1; i < nums.length; i++) {
				res -= nums[i];
			}
		}
		return res;
	}

}
