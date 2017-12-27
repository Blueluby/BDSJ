package week7;

import java.util.Optional;

public class j_71226_02 <T>{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}
	
	private static final j_71226_02<?> EMPTY = new j_71226_02<>();
	private static final j_71226_02<Object> EMPTY1 = new j_71226_02<>();
	
	j_71226_02<String> sopt1 = (j_71226_02<String>)EMPTY;
//	j_71226_02<String> sopt2 = (j_71226_02<String>)EMPTY1;	//안됨.
	
	
	private final T value;
	
	private j_71226_02() {
		T n = null;
		value = n;		

	}
	
	public static <T> j_71226_02<T> empty(){
		j_71226_02<T> t = (j_71226_02<T>) EMPTY;
		return t;
	}

}





//final class Optional<T> {
//	private static final Optional<? extends Object>EMPTY = new Optional<Object>();
//
//	public static <T> Optional<T> empty() {
//
//	}
//}