package com.hanbit.oop.controller;

import javax.swing.*;

import com.hanbit.oop.domain.GradeBean;
import com.hanbit.oop.service.GradeService;

public class GradeController {
	public static void main(String[] args) {
		GradeService gs=new GradeService();
		GradeBean gb=new GradeBean();
		
		while(true){
			switch(JOptionPane.showInputDialog("0.End 1.Grade")){
				case "0":
					JOptionPane.showMessageDialog(null, "시스템 종료");
					return;
			
				case "1":
					gb.setName(JOptionPane.showInputDialog("이름은?"));
					gb.setMajor(JOptionPane.showInputDialog("전공은?"));
					gb.setKor(Integer.parseInt(JOptionPane.showInputDialog("국어점수는?")));
					gb.setEng(Integer.parseInt(JOptionPane.showInputDialog("영어점수는?")));
					gb.setMath(Integer.parseInt(JOptionPane.showInputDialog("수학점수는?")));
					JOptionPane.showMessageDialog(null, gs.getGrade(gs.calcAvg(gs.calcTotal(gb))));
					break;
			}
		}
		
	}
}