package java0426_class.part01;

/*
 * Song 클래스의 show()메소드를 아래와 같이 출력이 되도록 구현하세요.
 */

public class Song {
	String title;
	String artist;
	String album;
	String[] composer;
	int year;
	int track;
	
	//생성자1// 멤버면수가 많으므로...
	public Song() { 
		
	}
	
	//생성자2//
	public Song(String title, String artist, String album, String[] composer, int year, int track) {
		super(); //일단 무시
		this.title = title;
		this.artist = artist;
		this.album = album;
		this.composer = composer;
		this.year = year;
		this.track = track;
	}
	
	public void show() {
		System.out.println("노래 제목:" + title);
		System.out.println("가수:" + artist);
		System.out.println("앨범:" + album);
		System.out.print("작곡가:");		
		for(int i=0; i<composer.length; i++) {
			char chk=i<composer.length-1? ',' : '\n';
			System.out.printf("%s%c", composer[i],chk);		
		}
		System.out.println("년도:" + year);
		System.out.println("트랙 번호:" + track);
		
	}
}// end class
