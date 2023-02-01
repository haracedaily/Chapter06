package com.yedam.oop;

public class Car {
	//설계 클래스
	//필드 : 객체로 만들었을 때, 정보를 담아주는 역할
	String name; //차 이름
	int price; //차 가격
	String company = "현대";//차 제조사or브랜드
	
	//생성자 : 객체로 만들 때 내가 하고 싶은 행위를 정의하는 곳
	//규칙이 있는데, 생성자 정의 -> 클래스의 이름과 동일해야한다
	//행위하지 않고 싶을땐 비워준다
	//기본생성자(Basic)
	public Car() {
	//아무것도 안하겠다.
	}
	
	
	//생성자를 통한 필드 초기화(객체를 만들때, 필드에 데이터 대입, 입력)
	//조건 : 생성자에 매개변수를 통해서 필드 초기화.
	public Car(String name, int price) {
		this.name = name;//this.는 class 또는 method
		this.price = price;
	}
	//생성자 다수 만들경우 매개변수가 들어가게 될 인스턴스를 확실히 지정해주기 위해
	public Car(String name) {
		this.name = name;
	}
	
	public Car(int price) {
		this.price=price;
	}
	
	public Car(String name, int price, String company) {
		this.name=name;
		this.price=price;
		this.company=company;
	}
		
	//메소드 : 객체로 만들었을 때, 기능 구현.
	void run() {
		System.out.println("자동차가 달립니다.");
	}
	//run이라는 기능이 부여되있는 것 <<그냥 출력문을 내보낸다
	//new클래스();활용해서 객체를 만든다.
	//힙영역에 객체 생성한다.<<새로운 공간을 만들어서 객체를 담는다.
	//new가 있어야 객체로 만들수 있다. why?보관할 영역이 있어야 계속 생성 가능
	
	//생성자 ; 객체를 만들때 무조건 행위하는걸 정의? 초기화역할 담당
	//생성자는 필수; 2순위로 필드와 메소드 정의
}
