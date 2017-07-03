package com.hanbit.oop.controller;

import javax.swing.*;

import com.hanbit.oop.inheritance.AndroidPhone;
import com.hanbit.oop.inheritance.CellPhone;
import com.hanbit.oop.inheritance.IPhone;
import com.hanbit.oop.inheritance.Phone;

public class PhoneController {
	public static void main(String[] args) {
		Phone phone=new Phone();
		CellPhone nokia=new CellPhone();
		IPhone iphone=new IPhone();
		AndroidPhone android=new AndroidPhone();
		
		while(true) {
			switch (JOptionPane.showInputDialog("0.End 1.Phone 2.Cell Phone 3. I Phone 4. Android Phone")) {
				case "0":
					JOptionPane.showMessageDialog(null, "End");
					return;
				case "1":
					phone.setName(JOptionPane.showInputDialog("이름은?"));
					phone.setPhoneNo(JOptionPane.showInputDialog("전화번호는?"));
					phone.setBrand(JOptionPane.showInputDialog("브랜드는?"));
					phone.setKind(JOptionPane.showInputDialog("종류는?"));
					phone.setCall(JOptionPane.showInputDialog("전화 내용은?"));
					JOptionPane.showMessageDialog(null, phone.toString());
					break;
				case "2":
					nokia.setName(JOptionPane.showInputDialog("이름은?"));
					nokia.setPhoneNo(JOptionPane.showInputDialog("전화번호는?"));
					nokia.setBrand(JOptionPane.showInputDialog("브랜드는?"));
					nokia.setCall(JOptionPane.showInputDialog("전화 내용은?"));
					nokia.setPortable(true);
					JOptionPane.showMessageDialog(null, nokia.toString());
					break;
				case "3":
					iphone.setName(JOptionPane.showInputDialog("이름은?"));
					iphone.setPhoneNo(JOptionPane.showInputDialog("전화번호는?"));
					iphone.setData(JOptionPane.showInputDialog("쓸 내용은?"));
					JOptionPane.showMessageDialog(null, iphone.toString());
					break;
				case "4":
					android.setName(JOptionPane.showInputDialog("이름은?"));
					android.setPhoneNo(JOptionPane.showInputDialog("전화번호는?"));
					android.setSize("5.5");
					android.setData(JOptionPane.showInputDialog("쓸 내용은?"));
					android.setAppl("카톡");
					JOptionPane.showMessageDialog(null, android.toString());
					break;
			}
			
		}
		
	}
}
