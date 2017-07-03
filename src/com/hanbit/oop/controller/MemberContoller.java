package com.hanbit.oop.controller;

import javax.swing.*;

import com.hanbit.oop.domain.MemberBean;
import com.hanbit.oop.service.MemberService;

public class MemberContoller {

	public static void main(String[] args) {
		MemberService ms=new MemberService();
		MemberBean mb =new MemberBean();

		while(true){
			String flag=JOptionPane.showInputDialog("0.종료 1.회원등록 2.로그인");
			//String flag=s.next();
			switch (flag) {
			case "0":
				JOptionPane.showMessageDialog(null, "시스템 종료");
				return;
			case "1":
				//setter
				mb.setId(JOptionPane.showInputDialog("ID"));
				mb.setPw(JOptionPane.showInputDialog("PW?"));
				mb.setName(JOptionPane.showInputDialog("Name?"));
				mb.setSsn(JOptionPane.showInputDialog("SSN?"));
				JOptionPane.showMessageDialog(null, ms.join(mb));
				break;
			case "2":
				MemberBean temp=new MemberBean();//MemberBean을 초기화+주소에 의한 전달 가능해짐
				temp.setId(JOptionPane.showInputDialog("Input ID"));
				temp.setPw(JOptionPane.showInputDialog("Input PW"));
				JOptionPane.showMessageDialog(null, ms.login(temp));
				break;
			default:
				break;
			}
		}

	}

}