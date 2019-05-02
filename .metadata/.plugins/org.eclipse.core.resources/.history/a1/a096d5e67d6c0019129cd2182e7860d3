package java0501_binding.part01;
//객체의 형변환(casting)에 대하여

/*
 * 데이터 타입
 * 1 기본 데이터타입 : byte,short,int,long,float,double,boolean,char (8가지)
 * 2 참조 데이터타입 : array, class, interface (3가지)
 * 
 * 인자전달방식
 * 1 call by value : 값복사 - 기본 데이터타입
 *    void add(int a, int b){}
 *    add(10, 20);
 * 2 call by reference : 주소복사 -참조 데이터타입
 *   void process(int[] arr){}
 *   process(new int[]{1,2,3});
 *   
 *   
 * 형변환(casting)
 * 
 * (1)기본 데이터타입
 * 1 묵시적형변환 : 작 -> 큰
 * 2 명시적형변환 : 큰 -> 작   (왜냐하면 데이터 손실이 발생하므로)
 *   int num=3;
 *   double data=num; //묵시적형변환
 *   short val=(short)num;  //명시적형변환
 *   
 *(2)참조데이터타입 - 객체형변환   : 독립된 객체끼리는 형변환이 안 된다. 객체는 형변환이 발생하지 않는 게 기본.
 * 1 상속관계일때 형변환이 가능하다.(is a)
 * 2 업캐스팅 발생된후 다운캐스팅을 할 수 있다.
 * 
 *   업캐스팅(up-casting) : 부모객체로 자식객체를 참조하도록 형변환하는 기술  //묵시적 형변환과 같은 의미 //업캐스팅의 예시에는 뭐가 있지?
 *   다운캐스팅(down-casting) : 업캐스팅을 다시 원상복귀해주는 형변환하는 기술  // 
 *   
 *   
 */
public class Java109_casting {

	public static void main(String[] args) {
		Parent p = new Parent();
		Outer t = new Outer();
		//독립적인 참조데이터타입(객체)은 형변환이 안 된다.
		//p=t;
		//t=p;
		
		Child c = new Child();
		p=c;
		p.process(); //Child process
		//p.call(); //왜 오류가 뜨는가?
		
		//위 두 가지를 하나의 문장으로 끝냄
		Parent pt = new Child(); //pt가 업캐스팅 된 것
		pt.process();
		//pt.call(); 오류 발생. 해당 영역에 process 메소드가 없기 때문?
		
		//원상복귀(다운캐스팅)
		Child cn = (Child)pt;
		cn.process();
		cn.call();
		
	} //end main()

} //end class
