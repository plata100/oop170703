package com.hanbit.oop.inheritance;

public class AndroidPhone extends IPhone {
	//BRAND 갤럭시노트
	//data를 오버라이딩해서 카톡 메세지라고 출력시킴
	private String size, appl;
	public final static String BRAND="갤럭시노트";
	public final static String KIND="스마트폰";
	
	public void setSize(String size) {
		this.size=size;
		setPortable(true);
	}
	public String getSize() {
		return size;
	}
	
	public void setAppl(String appl) {
		this.appl=appl;
	}
	public String getAppl() {
		return appl;
	}
	
	@Override
	public String toString() {
		//아이폰은 스마트폰이기 때문에 이동가능한 상태로 홍길동에게 010 번호로
		//갤럭시노트 6인치를 사용해서 안녕이라고 문자를 전송했다.
		return String.format("%s에게 %s 번호로 %s한 %s %s이라는 %s를 사용해서 %s이라고 %s을 전송했다.", name, phoneNo, move, BRAND, size, KIND, data, appl);
	}
}
