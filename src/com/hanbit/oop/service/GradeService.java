package com.hanbit.oop.service;

import com.hanbit.oop.domain.GradeBean;

public class GradeService {
	public int calcTotal(GradeBean gb){
		return gb.getKor()+gb.getEng()+gb.getMath();
	}
	
	public int calcAvg(int total){
		return total/3;
	}

	public String getGrade(int avg){
		String grade="";
		switch(avg/10){
			case 10 : 
			case 9 : 
				grade = "A학점";
			break;
			case 8 : 
				grade = "B학점";
			break;
			case 7 : 
				grade = "C학점";
			break;
			case 6 : 
				grade = "D학점";
			break;
			case 5 : 
				grade = "E학점";
			break;
			default:
				grade = "F학점";
			break;
		}
		return grade;
	}
	
}