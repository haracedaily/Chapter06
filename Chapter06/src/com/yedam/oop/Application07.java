package com.yedam.oop;

public class Application07 {

	public static void main(String[] args) {
		//객체 생성
		Person p1 = new Person("230202-444444","김또치");
//		p1.nation ="미국";
//		p1.ssn = "123-123"
		
		//개명 제외하고는 final값으로 인해 변경이 불가하다
		
		System.out.println(p1.nation);
		System.out.println(p1.ssn);
		System.out.println(p1.name);
		
		
		//지구의 반지름
		System.out.println("지구의 반지름 : "+StaticCal.EARTH_RADIUS);
		//지구의 표면적(pi*r*r)
		System.out.println("지구의 표면적 : "+(StaticCal.PI*StaticCal.EARTH_RADIUS*StaticCal.EARTH_RADIUS));
		
//		StaticCal.PI=100; 
		//final 선언문은 바꿀수 없다
	}

}
