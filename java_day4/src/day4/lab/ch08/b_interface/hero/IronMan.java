package day4.lab.ch08.b_interface.hero;

// TODO: Heroable을 구현하는 IronMan을 작성하시오.

public class IronMan implements Heroable{

	@Override
	public void fire() {
		System.out.println("빵");
		
	}

	@Override
	public void changeShape() {
		System.out.println("쉬리릭");
	}

	@Override
	public void upgrade() {
		System.out.println("짜잔");
		
	}
	
}

// END
