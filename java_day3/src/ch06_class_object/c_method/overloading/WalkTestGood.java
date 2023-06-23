package ch06_class_object.c_method.overloading;

public class WalkTestGood {
    void walk() {
    	// 중복 코드 방지!
    	// 	System.out.println(distance+"100cm 이동");
    	walk(100);
    	
        System.out.println("100cm 이동");
    }

    // TODO: walk 메서드를 overloading 해보자.
    void walk(int distance) {
    	System.out.println(distance+"cm");
    }
    
    void walk(int distance, String unit) {
    	if(unit.equals("inch")) {
    		distance*=2.54;
    	}
    	System.out.println(distance+"cm 이동 완료!!");
    }
    // END

    public static void main(String[] args) {
        WalkTestGood wtg = new WalkTestGood();
        wtg.walk();
        wtg.walk(100);
        wtg.walk(100,"cm");

    }

}
