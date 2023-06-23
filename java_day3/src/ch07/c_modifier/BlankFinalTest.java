package ch07.c_modifier;
//이게 중요하다면 파이날 선언
//final class FinalMemberClass {
 class FinalMemberClass {
	 // reference type member - null 이 기본값 null 인 상태로 파이널이 된다?? 그런 무슨 의미가 있지
    final String name; //디폴트 초기화가 일어나야 하는데? 왜 블랭크 파이널 변수 객체마다 유니크한 값을 가져가고 싶을떄?
    // 누구도 값을 줄  순 없어 딱 한군데서 초기화 할 수 있게 만듬 생성자에서 딱한번 초기화 할 수 있다
    // blank final 변수

    public FinalMemberClass(String name) {
    	// blank final은 생성자에서 딱 한번 초기화 가능
        this.name = name;
    }
    public final void printName() { //이렇게 파이날 붙이면 밑에 에러 발생
    	System.out.println(this.name);
		
	}
}
//생성자 오류 처리법!
class MyClass extends FinalMemberClass{ //오류가 나온다 자식을 만들 수 없다 파이널이기 때문에!!
	public MyClass(String name) {
		super(name); //처리하는 방법은 2가지 조상에 기본생성자를 추가하던가 문자로 가져오던가
	}
	// 오버 라이딩
	public void printName() {
		System.out.println("자식의 재정의 !!" + name);
	}
	
}



public class BlankFinalTest {
    public static void main(String[] args) {
        FinalMemberClass fmc1 = new FinalMemberClass("hong");
        FinalMemberClass fmc2 = new FinalMemberClass("lim");

        System.out.printf("name: fmc1 - %s, fmc2 - %s%n", fmc1.name, fmc2.name);
        //The final field FinalMemberClass.name cannot be assigned
        //fmc1.name = "kim"; // final 변수로 해서 오류가 난다 
    }
}
