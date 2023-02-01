package com.yedam.oop;

public class Application03 {

	public static void main(String[] args) {
		Bycle bycle = new Bycle();
		
		bycle.setGas(5);//Bycle로 생성한 객체 필드값 데이터 입력
		
		boolean gasState = bycle.isLeftGas();
		if(gasState) {
			System.out.println("출발합니다.");
			bycle.run();
			
		}
		if(bycle.isLeftGas()) {
			System.out.println("gas를 주입할 필요 없음.");
		}else {
			System.out.println("gas를 주입해야함.");
		}
		System.out.println("===============");
		Book book=new Book("혼자 공부하는 자바");
		Book bok=new Book("자바의 정석","학습서","도우출판",32000,"0002");
		Book choose=new Book("c의 정석","학습서","한빛 출판사",25000,"0003");
		book.getInfo("혼자 공부하는 자바");
		bok.getInfo("자바의 정석");
		choose.getInfo("c의 정석");
	}

}
