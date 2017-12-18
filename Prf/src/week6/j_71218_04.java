package week6;

public class j_71218_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Tank tank = new Tank();
		Dropship dropship = new Dropship();
		
		Marine marine = new Marine();
		SCV scv = new SCV();
		
		scv.repair(tank);
		scv.repair(dropship);
		//scv.repair(marine);
		
		
	}

}


interface Repairable{}
class GroundUnit extends _Unit{
	GroundUnit(int hp) {
		// TODO Auto-generated constructor stub
		super(hp);
	}
}

class AirUnit extends _Unit{
	AirUnit(int hp) {
		// TODO Auto-generated constructor stub
		super(hp);
	}
}
class _Unit{
	int hitPoint;
	final int MAX_HP;
	
	_Unit(int hp){
		MAX_HP = hp;
	}
}

class Tank extends GroundUnit implements Repairable{
	Tank(){
		super(150);
		hitPoint = MAX_HP;
	}
	
	public String toString() {
		return "Tank";
	}
}


class Dropship extends AirUnit implements Repairable{
	public Dropship() {
		super(125);
		hitPoint = MAX_HP;
	}
	
	public String toString() {
		return "Dropship";
	}
}

class Marine extends GroundUnit{
	public Marine() {
		super(50);
		hitPoint = MAX_HP;
	}
	
	public String toString() {
		return "Marine";
	}
}

class SCV extends GroundUnit implements Repairable{
	SCV() {
		super(50);
		hitPoint = MAX_HP;
	}
	
	void repair(Repairable r) {
		if(r instanceof _Unit) {
			_Unit u = (_Unit)r;
			while(u.hitPoint != u.MAX_HP) {
				u.hitPoint += 5;
			}
			System.out.println(u.toString() + " 수리 완료");
		}
	}
	
	public String toString() {
		return "SCV";
	}
}