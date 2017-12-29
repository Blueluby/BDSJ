package week7;

enum Num__ {
	ONE(1) {
		int show(int n) {
			return value * n;
		}
	},
	TWO(2) {
		int show(int n) {
			return value * n;
		}
	},
	THREE(3) {
		int show(int n) {
			return value * n;
		}
	};

	int value;

	Num__(int n) {
		value = n;
	}

	public int get() {
		return value;
	}

	abstract int show(int n);
}

public class j_71229_07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Num__.ONE.show(5));
		System.out.println(Num__.TWO.show(5));
		System.out.println(Num__.THREE.show(5));
		
		
	}
}
