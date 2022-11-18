package parentConstructorClearCall;

public class Child extends Parent {
	public int ChildNo;

	Child(String name, String ssn, int ChildNo) {
		super(name, ssn); // 조상의 멤버변수를 명시적 호출!!
		this.ChildNo = ChildNo; // this는 자기자신
	}
}