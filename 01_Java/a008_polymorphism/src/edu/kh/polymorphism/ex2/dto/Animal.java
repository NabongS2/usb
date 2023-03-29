package edu.kh.polymorphism.ex2.dto;

// 추상 클래스 (abstract class)
// - 추상 메서드가 포함된 클래스
// 단, 추상 메서드가 없어도 추상 클래스가 생성된다.
public abstract class Animal { // The type Animal must be an abstract class to define abstract methods
	// 추상화, 캡슐화
	
	// 필드
	private String type; // 종(양서류, 포유류, 파충류...)
	private String eatType; // 식성
	
	// 생성자
	public Animal() { // 기본 생성자
		super(); // 부모 생성자 호출
		// 미작성시 컴파일러가 자동 호출
	}

	public Animal(String type, String eatType) { // 매개변수 생성자
		this.type = type;
		this.eatType = eatType;
	}
	
	// 메서드
	public String getType() { // get 가져오겠다. String 타입의 return(반환하고 싶은 변수명)
		return type;
	}
	
	public void setType(String type) { // set 수정해주겠다 String type을 필드에 있는 것을 새로 받은 것으로 수정해주겠다. 반환형 없음!
		this.type= type;
	}

	public String getEatType() {
		return eatType;
	}

	public void setEatType(String eatType) {
		this.eatType = eatType;
	}
	
	// String Object.toString()
	// - 객체가 가지고 있는 필드를 하나의 문자열로 반환하는 용도에 메서드
	//   (자식이 오버라이딩해서 사용하길 권장)
	// - 오버라이딩 X -> 패키지명+클래스명@해시코드 문자열 반환
	@Override
	public String toString() {
		return type + " / " + eatType;
	}
	
	// 추상 메서드 (미완성된 메서드)
	// -> 상속 받은 자식 클래스에 반드시 오버라이딩 해야한다.
	// -> 추상 메서드를 포함한 클래스는 반드시 abstract class여야만 한다.
	public abstract void breath();
}
