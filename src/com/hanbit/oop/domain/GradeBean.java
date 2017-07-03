package com.hanbit.oop.domain;

public class GradeBean {
	private int kor, eng, math;
	private String name, major;
	
	public int getKor() {
		return kor; //getter는 this 생략 가능 / 이유: 값이 없으면 가까운 필드값을 찾기 때문에
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMajor() {
		return major;
	}
	public void setMajor(String major) {
		this.major = major;
	}
	
}
