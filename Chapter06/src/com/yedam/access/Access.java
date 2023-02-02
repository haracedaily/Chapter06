package com.yedam.access;

public class Access {
	/* 사용 하는 곳 : 필드, 메소드, 클래스, 인터페이스 등 앞에 사용 가능
	 * public 어디서든 누구나 다 접근 가능 -> 필드 -> 누구나 다 사용이 가능하다
	 * 
	 * protected 상속이라는 관계 맺은 다음에 부모 - 자식 사이에 사용(패키지가 달라도 사용가능)
	 * 			같은 패키지 에서만 접근 가능, 서로 다른 패키지면 접근 불가능
	 * 
	 * default 서로 다른 패키지는 접근 불가능 하고 같은 패키지에서만 접근 가능
	 * 
	 * private 내가 속한 클래스 내에서만 사용이 가능
	 *
	 */
	public String free;
	protected String parent;
	private String privacy;
	String basic; //default
	
	//생성자
	public Access() {
		
	}
	//생성자에 접근 제한자 -> 객체를 생성하는 범위를 조절
	//public->어디서든 객체 생성 가능
	//protected -> 같은 패키지, 자식클래스에서만 객체생성가능
	//defualt ->같은 패키지에서만 객체 생성 가능
	//private->객체 생성 불가능
	public Access(String free) {
		this.free=free;
	}
	protected Access(int a) {
		
	}
	Access(String s,String b){
		
	}
	private Access(double a) {
		
	}
	
	
	//메소드
	//숨기고 싶은 정보
	private void info() {
		System.out.println("private 메소드입니다.");
	}
	//숨긴 정보를 대신 불러주는 메소드
	public void instead() {
		info();
	}
	protected void parent() {
		System.out.println("parent");
	}
	void basic() {
		System.out.println("defualt");
	}
	
}
