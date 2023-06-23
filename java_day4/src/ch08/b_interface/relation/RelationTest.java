package ch08.b_interface.relation;

class Phone {}

class HandPhone extends Phone implements Chargeable{
    public void charge() {
        System.out.println("HandPhone 충전 중...");
    }
}

class Camera {}

class DigitalCamera extends Camera implements Chargeable{
    public void charge() {
        System.out.println("BlackBox 충전 중...");
    }
}

// TODO: 충전할 수 있는 기능을 가지는 Chargeable interface를 만들고 적용해보세요.
interface Chargeable{
	void charge();
}
// END

public class RelationTest {
    void badCase() {
        Object[] objs = { new HandPhone(), new DigitalCamera() };
        for (Object obj : objs) {
            if (obj instanceof HandPhone) {
                HandPhone phone = (HandPhone) obj;
                phone.charge();
            } else if (obj instanceof DigitalCamera) {
                DigitalCamera camera = (DigitalCamera) obj;
                camera.charge();
            }
        }
    }
    // class를 이용한 관계: tight coupling
    // interface를 이용한 관계: loose coupling

    void goodCase() {
        // TODO: Chargeable한 객체들을 관리하고 충전해보자.
    	Chargeable [] chargeables = {new DigitalCamera(), new HandPhone()};
    	for(Chargeable c: chargeables) {
    		c.charge();
    	}
        // END
    }

    public static void main(String[] args) {
        RelationTest lct = new RelationTest();
        lct.badCase();
        lct.goodCase();

    }
}
