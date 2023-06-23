package ch07.c_modifier.p2;

import ch07.c_modifier.p1.Parent;

public class OtherPackageChildClass extends Parent {
    public void useMember() {
        this.publicVar = 10;
        this.protectVar = 10;
//        this.defaultVar = 10; // 같은 패키지에서만 접속 할 수 있다.
//        this.privVar = 10; //보이지 않는다고 나옴 있지만
//        this.none = 10; //없다고 나옴
    }
}
