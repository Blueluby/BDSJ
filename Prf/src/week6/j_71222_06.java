package week6;

public class j_71222_06 {

	public static void openAndShowFruitBox(_FruitBox<? super _Apple> box) {		//제너릭 클래스 참조자료형. 자료형 제한하는 법. 형변환을 해주어야 함
		_Fruit f = (_Fruit) box.pullOut();						// ? extends _Fruit		//물음표 기호는 자기자신을 포함한 모든 클래스 형변환 안해도 일단 됨.
		f.showYou();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		_FruitBox<_Fruit> box1 = new _FruitBox<_Fruit>();
		box1.store(new _Fruit());
		
		_FruitBox<_Apple> box2 = new _FruitBox<_Apple>();
		box2.store(new _Apple());
		
		openAndShowFruitBox(box1);
		openAndShowFruitBox(box2);
		
		_FruitBox<_Orange> box3 = new _FruitBox<_Orange>();
		_FruitBox<_SubApple> box4 = new _FruitBox<_SubApple>();
		
//		openAndShowFruitBox(box3);
//		openAndShowFruitBox(box4);
		
		
		
	}
}

class _Fruit{
	public void showYou() {
		System.out.println("나는 과일");
	}
}

class _Orange{}

class _Apple extends _Fruit{
	public void showYou() {
		super.showYou();
		System.out.println("난 붉은 과일");
	}
}

class _SubApple extends _Apple{}


class _FruitBox<T>{
	T item;
	public void store(T item) {
		this.item = item;
	}
	public T pullOut() {
		return item;
	}
}