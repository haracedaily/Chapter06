package com.yedam.access;

public class Singleton {
	
	//외부에서 접근은 못하지만 공유 가능하다.
	//객체 생성 -> 객체가 존재하고 있는 주소값만 들어가 있다
	//즉, sington->객체의 데이터가 존재할 주소값
	private static Singleton sington = new Singleton();
	
	//외부에서 객체를 생성하지 못하도록 막는 역할
	private Singleton() {
		
	}
	
	//Singleton 내부에서 만든 객체를 외부에 전달 하는 용도.
	public static Singleton getInstance() {
		return sington;
	}
	
	public void getInfo() {
		System.out.println("싱글톤 내부 getInfo메소드 실행");
	}
	
	
}
