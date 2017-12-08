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
		
		Car c3 = new Car(c2);
		c3.display();
		
		c1.display();
		c2.display("c2");
		c3.display("c3");
	}

}

class Car{
	String color;
	String gearType;
	int door;
	int count = 0;
	int serialNo=0;
	
	Car(){
		this("white","auto",4);
		count++;
		serialNo = count;
	}
	Car(Car c){
		count++;
		serialNo = count;
		
		this.color = c.color;
		this.gearType = c.gearType;
		this.door = c.door;
		
		count++;
		serialNo = count;
	}
	Car(String c, String g, int d){
		count++;
		serialNo = count;
		
		color = c;
		gearType = g;
		door = d;
	}
	void display() {
		System.out.println("색 : "+color+"타입 : "+gearType + "문 수 :"+door);
		System.out.println("일련번호 : "+serialNo);
	}
	void display(String s) {
		System.out.print(s+"의 ");
		System.out.println("색 : "+color+"타입 : "+gearType + "문 수 :"+door);
		System.out.println("일련번호 : "+serialNo);
	}
}