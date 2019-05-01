package java0501_abstract_interface.part03;

public class Flute extends Instrument {
	public Flute() {
		// TODO Auto-generated constructor stub
	}
	
	public Flute(String name) {
		super(name);
	}
	
	@Override
	public void play() {
		System.out.println("입으로 분다.");
		
	}

}
