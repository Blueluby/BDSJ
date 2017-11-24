package week2;

public class j_71124_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1 = new Student();
		s1.test();
		
		System.out.println(s1.age);
		s1.age = 25;
		System.out.println(s1.age);
		
		Student s2 = new Student();
		
		
	}
}

class Student{
	int age;
	float socre;
	
	void study() {
		System.out.println("겅부");
	}
	void test() {
		System.out.println("시험");
	}
}

class BDS{
	int age;
	int rating;
	int studyCount;
	boolean test;
	
	String name;
	
	BDS(){
		name = "임시";
		age = 20;
		test = false;
	}
	BDS(int iage, String sname){
		name = sname;
		age = iage;
		test = false;
	}
	
	void Study() {
		studyCount++;
		System.out.println("공부를 합니다");
	}
	void Test() {
		if(studyCount>20 || test) {
			test = true;
			System.out.println("시험 통과");
		}else {
			System.out.println("공부량 부족");
		}
	}
}