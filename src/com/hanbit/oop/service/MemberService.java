package com.hanbit.oop.service;

import com.hanbit.oop.domain.MemberBean;

public class MemberService {
	MemberBean session;
	public MemberService(){
		session=new MemberBean();
	}
	//MemberBean member = new MemberBean(); → 원칙적으로는 사용 불가, CPU는 area에서 RAM은 필드에서 활동하는데, 필드에서는 initialize하면 안 됨, 또한 멤버값을 각 메소드가 공유해서는 안 됨.

	public String getGender(MemberBean member){
		String gender="";
		char ch = member.getSsn().charAt(7);
		switch (ch){
			case '1':
			case '3':
				gender = "남자";
				break;
			case '2':
			case '4':
				gender = "여자";
				break;
			case '5':
			case '6':
				gender = "외국인";
				break;
			default:
				gender = "잘못입력";
				break;
		}
		return gender;
	}
	
	public String getAge(MemberBean member){
		//MemberBean member = new MemberBean(); → 사용 불가, 이렇게 하면 initialize되서 값이 초기화 됨
		int age=0;
		String sYear=member.getSsn().substring(0,2);
		int year=Integer.parseInt(sYear);
		int gap=17-year;
		age=(gap>=0) ? 2017-2000-year+1 : 2017-1900-year+1;
		return String.valueOf(age);
	}
	
	public String join(MemberBean member) {
		//session에 회원가입시 입력한 정보를 저장하는 소스
		session=member; //값을 전달하는게 하급, 주소를 전달하는게 상급
		return "환영합니다! "+session.getName()+"님";
	}
	
	public String login(MemberBean member){
		return (session.getId().equals(member.getId())&&session.getPw().equals(member.getPw())) ? "로그인 성공.." : "로그인 실패..";
	}
}