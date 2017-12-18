package week6;

class Fighter extends Unit implements Fightable{
	public void move(int x, int y) {
		
	}
	public void attack (Unit u) {
		
	}
}

class Unit{
	int currentHP;
	int x;
	int y;
}

interface Fightable extends Movable, Attackable{
}

interface Movable{
	void move (int x, int y);
}

interface Attackable{
	void attack(Unit u);
}

public class j_71218_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fighter f = new Fighter();
		
		if(f instanceof Unit) {
			System.out.println("F U");
		}
		if(f instanceof Fightable) {
			System.out.println("F fable");
		}
		if(f instanceof Movable) {
			System.out.println("F mable");
		}
		if(f instanceof Attackable) {
			System.out.println("F atable");
		}
		if(f instanceof Object) {
			System.out.println("F Ob");
		}
		
	}

}
