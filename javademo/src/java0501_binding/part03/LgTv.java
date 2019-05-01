package java0501_binding.part03;

public class LgTv {
String maker;
	
	public LgTv() {
	
	}
	
	public LgTv(String maker) {
		this.maker=maker;
	}
	
	public void turnOn(){
		System.out.println(maker+" TV-전원을 켠다.");
	}
	
	public void turnOff(){
		System.out.println(maker+" TV-전원을 끈다.");
	}
	
	public void soundUp(){
		System.out.println(maker+" TV-소리를 높인다.");
	}
	
	public void soundDown(){
		System.out.println(maker+" TV-소리를 줄인다.");
	}

}//end LgTv
