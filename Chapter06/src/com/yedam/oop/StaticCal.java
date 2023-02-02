package com.yedam.oop;

public class StaticCal {
	//정적 필드 선언
	//필드
	static final double PI = 3.14;
	//Math안에 final static으로 선언된 구문이 많다<-참고하기
	
	//정적 파이널 변수 생성 시 두개의 단어를 합칠 경우 _(즉 언더바로 연결해준다)
	static final Long EARTH_RADIUS = 6400L;
	
	
	//정적 메소드 선언
	static int plus(int x, int y) {
		return x+y;
	}
	
	//정적 메소드 선언
	static int minus(int x, int y) {
		return x-y;
	}
}
