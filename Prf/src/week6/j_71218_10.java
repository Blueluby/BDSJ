package week6;

public class j_71218_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Inner___ i3 = new Inner___() {
			public void b() {
				System.out.println("오버라이딩된 메서드 b");
				System.out.println("x : "+x);
				System.out.println("y : "+y);
				
			}
		};
		i3.a();
		i3.b();
		i3.c();
		i3 = new Inner___() {
			public void c() {
				System.out.println("오버라이딩된 메서드 c");
			}
		};
		i3.c();
	}

}

class Inner___{
	int x = 5;
	int y = 6;
	public void a() {
		System.out.println("a");
	}
	public void b() {
	}
	public void c() {
		System.out.println("c");
	}
}

class Sub__ extends Inner___{
	public void b() {
		System.out.println("b 변경 B");
	}
}