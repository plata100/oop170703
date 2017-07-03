package com.hanbit.oop.inheritance;

public class IPhone extends CellPhone {
	protected String data;
	//KIND는 스마트폰이라고 오버라이딩..
	public final static String BRAND="아이폰";
	public final static String KIND="스마트폰";
	
	public void setData(String data) {
		this.data=data;
		setPortable(true);
		//데이터는 getter 성격의 메소드에 넣지 말고 setter 성격의 메소드 안에 넣어야 함. read only 개념(읽기 전용).
	}
	public String getData() {
		return data;
	}
	
	@Override
	public String toString() {
		//아이폰은 스마트폰이기 때문에 이동가능한 상태로 홍길동에게 010 번호로
		//아이폰을 사용해서 안녕이라고 문자를 전송했다.
		return String.format("%s에게 %s 번호로 %s한 %s이라는 %s를 사용해서 %s이라고 문자를 보냈다.", name, phoneNo, move, BRAND, KIND, data);
	}

}
