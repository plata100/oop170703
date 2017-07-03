package com.hanbit.oop.inheritance;

public class Phone {
	protected String name, phoneNo, brand, kind, call;
	
	public void setName(String name) {
		this.name=name;
	}
	public String getName() {
		return name;
	}
	
	public void setPhoneNo(String phoneNo) {
		this.phoneNo=phoneNo;
	}
	public String getPhoneNo() {
		return phoneNo;
	}
	
	public void setBrand(String brand) {
		this.brand=brand;
	}
	public String getBrand() {
		return brand;
	}
	
	public void setKind(String kind) {
		this.kind=kind;
	}
	public String getKind() {
		return kind;
	}
	
	public void setCall(String call) {
		this.call=call;
	}
	public String getCall() {
		return call;
	}
	
	public String toString() {
		return String.format("%s에게 %s 번호로 %s %s를 사용해서 %s라고 보냈다.", name, phoneNo, brand, kind, call);
	}
}
