package ch07.c_modifier.p1;

public class SamePackageChildClass extends Parent {
    public void useMember() {
        this.publicVar = 10;
        this.protectVar = 10;
        this.defaultVar = 10;
//        this.privVar = 10; //보이지 않는다고 나옴 있지만
//        this.none = 10; //없다고 나옴
        // END
    }
}
