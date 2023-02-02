package com.yedam.access;

public class Student {
	//다음 조건을 만족하는 Student 클래스 작성
	//이름, 학과, 학년, 과목별 점수
	//과목 설정
	//programing, database,OS
	//필드들은 모두 private
	//setter를 통해 필드 초기화
	//getter를 통해 데이터 reading
	//getInfo() 학생의 정보를 출력하는 기능
	//필드
	private String stdName;
	private String major;
	private String stdGrade;
//	private int[] subject=new int[int programing, int dataBase, int Os];
	private int programing;
	private int dataBase;
	private int os;
	//생성자
	
	//메소드
	public void setPrograming(int programing) {
//		if(programing<=0) {
//			this.programing=0;
//			return;
//		}
//		this.programing = programing;
		this.programing=(programing<=0)?0:programing;
	}
	public void setStdName(String stdName) {
		this.stdName =stdName;
	}
	public String getStdName() {
		return stdName;
	}
	public String getMajor() {
		return major;
	}
	public void setMajor(String major) {
		this.major = major;
	}
	public String getStdGrade() {
		return stdGrade;
	}
	public void setStdGrade(String stdGrade) {
		this.stdGrade = stdGrade;
	}
//	public int[] getSubject() {
//		return subject;
//	}
//	public void setSubject(int[] subject) {
//		this.subject = subject;
//	}
	public int getPrograming() {
		return programing;
	}
//	public void setPrograming(int programing) {
//		this.programing = programing;
//	}
	public int getDataBase() {
		return dataBase;
	}
	public void setDataBase(int dataBase) {
		this.dataBase = dataBase;
	}
	public int getOs() {
		return os;
	}
	public void setOs(int os) {
		this.os = os;
	}
	
}
