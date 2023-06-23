package ch08.d_annotation;

class MySuperClass{
    public void addall(){
        System.out.println("이 메서드를 재정의해보세요");
    }
}

public class SimpleAnnotationTest extends MySuperClass{
    // TODO: 다음 클래스 요소에 적절한 annotation을 추가해보자.
    
	@Deprecated
    public void poorOldMethod(){
        System.out.println("이 메서드는 지금은 사용하지만 없어질 수도 있다.");
    }

    
    int notUsedMember;

    @Override
    public void adda11(){
        System.out.println("재정의 된 메서드 호출");
    }

    public static void main(String[] args) {
        SimpleAnnotationTest sat = new SimpleAnnotationTest();
        sat.addall();
    }
}
