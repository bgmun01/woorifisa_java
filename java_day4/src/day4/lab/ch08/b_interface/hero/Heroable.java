package day4.lab.ch08.b_interface.hero;

interface Fightalbe{{
	void fire(); // 뭘 발사하는 진 알수 없음 일단 그런 기능이 있다.
	
}


interface Transformable{
	void changeShape();
}


// 파이트어블과 트렌스포마블을 상속받는 어로블을 작성하시오
// 히어로블은ㅇ ㅓㅂ그레이드 할 수 잉ㅆ다.

public interface Heroable extends Fightalbe, Transformable{
	void upgrade();
}

//END