package com.yedam.oop;

public class Book {
		//Book이라는 클래스는 아래의 정보를 가져야합니다.
		//책 이름, 책 종류, 가격, 도서번호, 출판사
		//생성자는 아무런 행동을 하지 않습니다.
	
		//생성자는 3개 정도 생성
		//1)기본 생성자
		//2)모든 데이터를 초기화 할 수 있는 생성자
		//3) 책이름, 책 가격, 도서번호를 받아오는 생성자
	
		//메소드는 getInfo()라는 메소드를 가지는데, 아무런 기능이 없습니다.
		//getInfo() 메소드를 클래스 외부에서 실행 하였을 때,
		//다음과 같은 출력물이 나오도록 구현.
		/*
		 * 책 이름 : 혼자 공부하는 자바
		 * # 내용
		 * 1) 종류 : 학습서
		 * 2) 가격 : 24000원
		 * 3) 출판사 : 한빛 미디어
		 * 4) 도서번호 : 0001
		 */
	
		//필드
		String name;
		String type;
		String company;
		int price;
		String isbn;//
		
		//생성자
		public Book() {
			
		}
		
		public Book(String name,String type, String company, int price,String isbn) {
			this.name=name;
			this.type=type;
			this.company=company;
			this.price=price;
			this.isbn=isbn;
		}
		public Book(int price, String name, String isbn) {
			this.price=price;
			this.name=name;
			this.isbn=isbn;
		}
		public Book(String name,int price,String isbn) {
			this(price,name,isbn);//달라야지 오버로딩이 되니까<< 저
		}
		public Book(String name) {
			this(name,"학습서","한빛 미디어",24000,"0001");
		}
//		public Book(String name,int price,int isbn) {
//			this.name=name;
//			this.price=price;
//			this.isbn=isbn;
//		}
		//메소드
		void getInfo(String x) {
			if(this.name==x) {
			System.out.println("\n책 이름 : "+this.name);
			System.out.println("#내용");
			System.out.println("1) 종류 : "+this.type);
			System.out.println("2) 가격 : "+this.price+"원");
			System.out.println("3) 출판사 : "+this.company);
			System.out.println("4) 도서번호 : "+this.isbn);
			}
		}
		
		void setKind(String type) {
			this.type=type;
		}
		
}