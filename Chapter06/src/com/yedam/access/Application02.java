package com.yedam.access;

public class Application02 {

	public static void main(String[] args) {
		//인스턴스 학생 생성
		Student std = new Student();
		
		//필드에 데이터 넣어주는거
		std.setStdName("김또치");
		std.setStdGrade("2학년");
		std.setMajor("컴퓨터공학과");
		std.setPrograming(-100);
		std.setDataBase(90);
		std.setOs(100);
//		std.setSubject(int grade[50,90,100]);
		System.out.println("이름 : "+std.getStdName());
		System.out.println("학과 : "+std.getMajor());
		System.out.println("학년 : "+std.getStdGrade());
		System.out.println("프로그래밍 : "+std.getPrograming());
		System.out.println("데이터베이스 : "+std.getDataBase());
		System.out.println("운영체제 : "+std.getOs());
		
		
		Member mem=new Member();
		mem.setName("김또치");
		mem.setPw("yedam");
		mem.setId("또치");
		mem.setAge(-30);
		
		System.out.println("유저의 아이디는 "+mem.getId());
		System.out.println("유저의 비밀번호는 "+mem.getPw());
		System.out.println("유저의 이름은 "+mem.getName());
		System.out.println("유저의 나이는 "+mem.getAge());
	}

}
