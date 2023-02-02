package com.yedam.oop;

public class Application06 {
	
	//필드 선언(stack)
	int num = 1;
	//정적 필드 선언(method)
	static int sNum = 1;
	//필드 선언
	int field1;//인스턴스 필드(heap)
	
	//메소드 선언
	void info() {
		System.out.println("info 출력");
	}
	static void inFo() {
		System.out.println("static info 출력");
	}
	
	
	//메소드 영역에 포함 되어 있는 정적 메소드
	public static void main(String[] args) {
//		this.field1 = 1;//여기서 this는 메소드 영역을 가르킴 그런데 field는 stack영역에 있기 떄문에 못씀
//		field1 = 1;//인스턴스 필드로 선언한다해도 Heap영역에 있기 때문에 사용 불가는 그대로
		
		//클래스 한 공간에서 정적 멤버, 인스턴스 멤버도 쓰고 싶다면
		//1)인스턴스 필드 -> 정적 메소드에서 사용한다.
		//	=->>자기 자신을 객체로 만든 다음 인스턴스 필드를 호출해서 사용
		//2) 필드 ->인스턴스 필드에서 정적 필드로 변경해서 사용한다.
		
		Application06 field=new Application06();
		field.field1=0;
		
		//메소드 역시 필드와 동일하다
//		info();
		inFo();
		field.info();
		
//		num = num+1;//stack영역에 있는걸 가져와선 못쓴다
//		System.out.println(num);
		//사용하려면 같은 영역 즉 정적 영역 선언 된걸 가져와야한다.
		sNum = sNum+1;
		System.out.println(sNum);
		
		
		
		double result1 = 10*10*StaticCal.PI;
		System.out.println(result1);
		
		int result2 = StaticCal.plus(10, 5);
		int result3 = StaticCal.minus(10, 5);
		
		System.out.println("result1 : "+result1);
		System.out.println("result2 : "+result2);
		System.out.println("result3 : "+result3);
	}

}
