package java0501_abstract_interface.part03;

abstract public class Instrument {
	String name;
	
	public Instrument() {
		
	}
	public Instrument(String name) {
		this.name = name;
	}
	
	abstract public void play();
	
} //end class
