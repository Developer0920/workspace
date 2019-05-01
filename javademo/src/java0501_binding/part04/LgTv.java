package java0501_binding.part04;

public class LgTv extends HomeTv {	
	public LgTv() {

	}

	public LgTv(String maker) {
		super(maker);
	}
	
	public void call() {
		System.out.println("lg call");
	}

	
}// end LgTv
