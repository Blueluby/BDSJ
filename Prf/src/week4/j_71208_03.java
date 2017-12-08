package week4;

public class j_71208_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car c1 = new Car();
		c1.color = "white";
		c1.gearType = "auto";
		c1.door = 4;
		
		Car c2 = new Car("white","manual",2);
		c1.display("c1의 ");
		c2.display("c2의 ");
		
	}

}

class Car{
	String color;
	String gearType;
	int door;
	
	Car(){}
	Car(String c, String g, int d){
		color = c;
		gearType = g;
		door = d;
	}
	void display(String s) {
		System.out.print(s+"의 ");
		System.out.println("색 : "+color+"타입 : "+gearType + "문 수 :"+door);
	}
}