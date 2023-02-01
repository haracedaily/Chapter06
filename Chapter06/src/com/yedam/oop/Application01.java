package com.yedam.oop;

public class Application01 {

	public static void main(String[] args) {
		//실행 클래스 ; 정적 void
		//문법상 클래스 변수 = new 생성자(); 
			Car	 myCar = new Car();
		//클래스 : 어떤 생성자를 통해서 만들꺼냐, 변수:주소,new:(heap에서)새로운 저장공간을 생성자를 실행하며 만든다;
		//데이터타입 Car;Car.java안에 있는 필드 생성자 메소드를 사용하기 위해
		//필드와 메소드를 사용하려면 데이터타입을 써야한다.
		
		//객체에 정보를 넣어주는 방식
		//dot 연산자 =>> .
			//dot의 역할은 myCar의 속성 또는 가지고 있는 내부정의하고 싶을때
			//필드와 메소드 영역을 정의 가능하다.
			//즉 .name .price .run 사용 가능
			myCar.name="sonata";
			myCar.price=10000;
			//.누르면 자동완성으로 필드와 메소드에 정의된 명칭을 보여줌
			
			//Car 클래스를 활용한 또 다른 객체 생성
			Car yourCar = new Car();
			//클래스 외부에서 데이터를 입력
			yourCar.name = "kona";
			yourCar.price = 50000;
			//클래스 외부에서 필드를 사용할 경우(출력)
			System.out.println(yourCar.name);
			System.out.println(yourCar.price);
			System.out.println(yourCar.company);
			System.out.println(myCar.name);
			//클래스 외부에서 입력 분별입력 | 클래스 내부에서 입력 공통입력
			//클래스 내부에서 생성자와 메소드를 사용해서도 가능
			
			//다양한 생성자를 통한 객체 생성
			Car car01 = new Car("kona", 5000, "현대");
			Car car02 = new Car();
			Car car03 = new Car(3000);
			
			Book book1 = new Book("배고파",10000,"1234");
			System.out.println(book1.name);
			System.out.println(book1.price);
			System.out.println(book1.isbn);
			System.out.println(book1.company);
			System.out.println(book1.type);
			
			
	}

}
