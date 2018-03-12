package annotation;

public class AnnotationEx4 {

	public static void main(String[] args) {

		

	}

}

//배열 데이터를 저장해서 운영하는 지네릭스 프로그램
class MyArrayList<T>{
	T[] arr;
	@SafeVarargs
	MyArrayList(T ... arr){
		this.arr = arr;
	}
}