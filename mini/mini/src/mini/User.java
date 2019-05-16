package mini;

//유저의 객체
public class User {
	
	//아이디,패스워드,플레이 리스트
	private String id;
	private String pw;
	private String[] playlist;
	
	//리스트유무 체크
	public boolean listcheck() {
		//DB접속해서 이 유저의 기존 플레이 리스트가 있는지 확인해서
		//있으면 받아오기
	}
	
	public String[] playlist() {
		//플레이리스트 보여주기
	}
	
	public void makeplaylist() {
		//플레이 리스트만들기
		//근데 어떤식으로 만들지???
	}
	
	public int select() {
		//선택한 플레이 리스트 번호 반환
	}
}
