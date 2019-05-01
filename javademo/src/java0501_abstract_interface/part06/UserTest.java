package java0501_abstract_interface.part06;

public class UserTest extends User implements Score, Print{
	public int count;	
	//생성자
	public UserTest(String name, int count) {
		super(name);
		this.count = count;
		
	}
	@Override
	public String toPaint() {
		
		return "이름 : " + toString() + "\n점수 : " + getScore();
	}
	@Override
	public int getScore() {		
		return sol * count;
	}
}
