package com.yedam.oop;

import java.util.Scanner;

public class Application04 {

	public static void main(String[] args) {

		
		Student stu=new Student("김또치",20230201,80,74,96);
		stu.getInfo();
	
	
	//int[] score : int형 데이터를 담을 수 있는 배열
	//Class[] clazz : 객체를 담을 수 있는 배열
	//정보 입력 받는 용도
		Scanner sc=new Scanner(System.in);	
		
	//학생 수 입력 받는 변수
		int stdCount=0;
	//학생의 정보를 보관하는 배열 생성
	Student[] stdAry=null;//Student타입으로 만들어진 애들만 받는 배열
	
	while(true) {
		System.out.println("================================");
		System.out.println("1.학생수|2.학생정보입력|3.총점,평균|4.종료");
		System.out.println("입력>");
		int selectNo = Integer.parseInt(sc.nextLine());
		
		if(selectNo ==1) {
			System.out.println("학생 수 입력>");
			stdCount = Integer.parseInt(sc.nextLine());
		}else if(selectNo ==2) {
			//배열의 크기(학생의 데이터를 넣을 수 있는 크기 설정)
			stdAry = new Student[stdCount];
			for(int i=0;i<stdAry.length;i++) {
//				임의기 객체를 생성해서, 배열에 객체를 담는 그릇 용도
				//각 방(각배열)에 있는 객체를 초기화 해준다.
				stdAry[i]=new Student();
//				Student std = new Student();
				
				System.out.println("이름>");
				String name = sc.nextLine();
				stdAry[i].name=name;
				
				System.out.println("학번>");
				int No = Integer.parseInt(sc.nextLine());
				stdAry[i].num=No;
				
				System.out.println("국어>");
				int kor = Integer.parseInt(sc.nextLine());
				stdAry[i].kor = kor;
				
				System.out.println("영어>");
				int eng = Integer.parseInt(sc.nextLine());
				stdAry[i].eng = eng;
				
				System.out.println("수학>");
				int math = Integer.parseInt(sc.nextLine());
				stdAry[i].math = math;
				//임의이 객체를 배열에 저장
//				stdAry[i]=std;
			}
			
			
		}else if(selectNo ==3) {
			//학생의 수를 입력하고, 배열이 만들어진 상황.
			//학생의 데이터가 다 입력이 되어 있다.
			for(int i=0;i<stdAry.length;i++) {
				System.out.println(stdAry[i].name+">학생 성적");
				System.out.println("총점 : "+stdAry[i].sum());
				System.out.println("평균 : "+stdAry[i].avg());
			}
		}else if(selectNo ==4) {
			System.out.println("End of program");
			break;
		}
	}
	
}
}
