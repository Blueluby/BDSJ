package week7;

enum Direction__{
	EAST(1, ">"), SOUTH(2,"v"), WEST(3, "<"), NORTH(4,"^");
	
	private static final Direction__[] DIR_ARR = Direction__.values();
	private final int value;
	private final String symbol;
	
	Direction__(int value, String symbol){
		this.value = value;
		this.symbol = symbol;
	}
	
	public int getValue() {
		return value;
	}
	public String getSymbol() {
		return symbol;
	}
	
	public static Direction__ of(int dir) {
		if(dir< 1 || dir > 4) {
			throw new IllegalArgumentException("Invalid value : "+dir);
		}
		return DIR_ARR[dir -1];
	}
	
	public Direction__ rotate(int num) {
		num = num%4;
		if(num<0)
			num += 4;
		
		return DIR_ARR[(value-1+num)%4];
	}
	
	public String toString() {
		return name()+getSymbol();
	}
	
}

public class j_71229_06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(Direction__ d : Direction__.values())
			System.out.printf(d.name() +" = "+d.getValue()+"\t");
		
		System.out.println();
		Direction__ d1 = Direction__.EAST;
		Direction__ d2 = Direction__.of(1);
		
		System.out.printf("d1=%s, %d%n", d1.name(), d1.getValue());
		System.out.printf("d2=%s, %d%n", d2.name(), d2.getValue());
		
		System.out.println(Direction__.EAST.rotate(1));
		System.out.println(Direction__.EAST.rotate(2));
		System.out.println(Direction__.EAST.rotate(-1));
		System.out.println(Direction__.EAST.rotate(-2));
		
		
		
	}

}
