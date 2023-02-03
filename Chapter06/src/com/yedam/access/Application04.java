package com.yedam.access;

public class Application04 {

	public static void main(String[] args) {
		//Singleton.getInstance() = Singleton 클래스에서 만든 객체
		Singleton obj1=Singleton.getInstance();
		Singleton obj2=Singleton.getInstance();
		Singleton obj3=Singleton.getInstance();
		
		System.out.println(obj1);
		System.out.println(obj2);
		System.out.println(obj3);
		
		obj1.getInfo();
		obj2.getInfo();
		obj3.getInfo();
		//싱글톤 메소드로 db와 연결시켜줄 경우 하나씩 처리해주게 된다
	}

}
