package ch07.c_modifier.p2;

import ch07.c_modifier.p1.Parent;

public class OtherPackageSomeClass {
    public void method() {
        Parent p = new Parent();
        p.publicVar = 10;
   //   p.protectVar = 10; 상속도 안받았고
   //   p.defaultVar = 10; 같은 패키지도 아니고
   //   p.privVar = 10;
    }
}
