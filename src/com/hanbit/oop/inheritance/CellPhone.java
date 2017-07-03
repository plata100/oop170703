package com.hanbit.oop.inheritance;

public class CellPhone extends Phone {
	protected boolean portable;
	protected String move;
	public final static String KIND="스마트폰";
	
	public void setPortable(boolean portable) {
		if(portable) {
			this.setMove("이동 가능");
		} else {
			this.setMove("이동 불가능");
		}
		this.portable=portable;
	}
	public boolean isPortable() {
		return portable;
	}
	
	public void setMove(String move) {
		this.move=move;
	}
	public String getMove() {
		return move;
	}
	
	@Override
	public String toString() {
		return String.format("%s에게 %s 번호로 %s한 %s %s를 사용해서 %s이라고 통화했다.", name, phoneNo, move, brand, KIND, call, move); //부모 클래스에 변수가 protected가 아니라 private이면 super.를 붙였어야 됨.
	}
	
}