package week6;

public class j_71222_06 {

	public static void openAndShowFruitBox(_FruitBox box) {
		_Fruit f = (_Fruit)box.pullOut();
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
		
	}
}

class _Fruit{
	public void showYou() {
		System.out.println("나는 과일");
	}
}

class _Apple extends _Fruit{
	public void showYou() {
		super.showYou();
		System.out.println("난 붉은 과일");
	}
}

class _FruitBox<T>{
	T item;
	public void store(T item) {
		this.item = item;
	}
	public T pullOut() {
		return item;
	}
}