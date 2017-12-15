package week5;

public class j_71215_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal[] anim = {
			new Cat(),
			new Dog(),
			new Lion(),
			new Snake()
		};
		
		Cat c = (Cat)anim[0];
		c.printName();
		
		Dog d = (Dog)anim[1];
		d.printName();
		
		Lion l = (Lion)anim[2];
		l.printName();
		l.ride();
		
		Snake s = (Snake)anim[3];
		s.printName();
		
		
		//goal
		System.out.println("//Goal//");
		((Cat)anim[0]).printName();
		((Dog)anim[1]).printName();
		((Lion)anim[2]).printName();
		((Lion)anim[2]).ride();
		((Snake)anim[3]).printName();
		
		
	}

}

class Animal{
	String color;
	int kind;
}

class Cat extends Animal{
	public void printName() {
		System.out.println("고양이");
	}
}

class Dog extends Animal{
	public void printName() {
		System.out.println("개");
	}
}

class Snake extends Animal{
	public void printName() {
		System.out.println("뱀");
	}
}

class Lion extends Animal{
	public void printName() {
		System.out.println("사자");
	}
	public void ride() {
		System.out.println("사자 타봤냐");
	}
}

