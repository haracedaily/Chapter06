package com.yedam.oop;

public class Application05 {

	public static void main(String[] args) {
		//book01인스턴스 생성
		Book book01 = new Book("혼공자", 1000, "5000");
		
		//클래스 외부에서 book01이 가진 인스턴스 필드(=멤버)를 사용
		book01.company="한빛미디어";
		
		//book01인스턴스가 가진 인스턴스 메소드(getInfo)를 사용
		book01.getInfo("혼공자");
		
		//book01인스턴스에 인스턴스 메소드를 활용한 인스턴스 필드 및 데이터 초기화
		book01.type= "자습서";
		book01.setKind("학습서"); 
		book01.getInfo("혼공자");
	}

}
